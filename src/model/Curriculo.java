package model;

import java.util.List;

public class Curriculo {

	private List<Artigos> artigoPeriodico;
	private List<Artigos> artigoEvento;

	private List<Banca> bancasDoutorado;
	private List<Banca> bancasMestrado;
	private List<Banca> bancasGraduacao;

	private List<Orientacao> orientaçoesDoutoradoConcluidas;
	private List<Orientacao> orientaçoesMestradoConcluidas;
	private List<Orientacao> orientaçoesProjetoFinalConcluidas;
	private List<Orientacao> orientaçoesDoutoradoAndamento;
	private List<Orientacao> orientaçoesMestradoAndamento;
	private List<Orientacao> orientaçoesProjetoFinalAndamento;

	private int artigoPeriodicoA1 = 0;
	private int artigoPeriodicoA2 = 0;
	private int artigoPeriodicoB1 = 0;
	private int artigoPeriodicoB2 = 0;
	private int artigoPeriodicoB3 = 0;
	private int artigoPeriodicoB4 = 0;
	private int artigoPeriodicoB5 = 0;
	private int artigoPeriodicoC = 0;
	private int artigoPeriodicoNC = 0;
	private int artigoConferenciaA1 = 0;
	private int artigoConferenciaA2 = 0;
	private int artigoConferenciaB1 = 0;
	private int artigoConferenciaB2 = 0;
	private int artigoConferenciaB3 = 0;
	private int artigoConferenciaB4 = 0;
	private int artigoConferenciaB5 = 0;
	private int artigoConferenciaC = 0;
	private int artigoConferenciaNC = 0;

	private int bancasDoutoradoValidas;
	private int bancasMestradoValidas;
	private int bancasGraduacaoValidas;

	private int orientaçoesDoutoradoConcluidasValidas;
	private int orientaçoesMestradoConcluidasValidas;
	private int orientaçoesProjetoFinalConcluidasValidas;
	private int orientaçoesDoutoradoAndamentoValidas;
	private int orientaçoesMestradoAndamentoValidas;
	private int orientaçoesProjetoFinalAndamentoValidas;

	/**
	 * Valida e conta conteúdo
	 */
	private void validaConteudo(int anoInicial, int anoFinal) {

		setBancasDoutoradoValidas(validaBancas(bancasDoutorado, anoInicial, anoFinal));
		setBancasMestradoValidas(validaBancas(bancasMestrado, anoInicial, anoFinal));
		setBancasGraduacaoValidas(validaBancas(bancasGraduacao, anoInicial, anoFinal));

		setOrientaçoesDoutoradoConcluidasValidas(
				validaOrientacoes(orientaçoesDoutoradoConcluidas, anoInicial, anoFinal));
		setOrientaçoesMestradoConcluidasValidas(validaOrientacoes(orientaçoesMestradoConcluidas, anoInicial, anoFinal));
		setOrientaçoesProjetoFinalConcluidasValidas(
				validaOrientacoes(orientaçoesProjetoFinalConcluidas, anoInicial, anoFinal));

		setOrientaçoesDoutoradoAndamentoValidas(validaOrientacoes(orientaçoesDoutoradoAndamento, anoInicial, anoFinal));
		setOrientaçoesMestradoAndamentoValidas(validaOrientacoes(orientaçoesMestradoAndamento, anoInicial, anoFinal));
		setOrientaçoesProjetoFinalAndamentoValidas(
				validaOrientacoes(orientaçoesProjetoFinalAndamento, anoInicial, anoFinal));

	}

	/**
	 * Retorna uma String com todo o conteúdo do currículo
	 */
	public String getConteudo(int anoInicial, int anoFinal) {

		validaConteudo(anoInicial, anoFinal);

		String conteudo = artigoPeriodicoA1 + "\t" + artigoPeriodicoA2 + "\t" + artigoPeriodicoB1 + "\t"
				+ artigoPeriodicoB2 + "\t" + artigoPeriodicoB3 + "\t" + artigoPeriodicoB4 + "\t" + artigoPeriodicoB5
				+ "\t" + artigoPeriodicoC + "\t" + artigoPeriodicoNC + "\t" + artigoConferenciaA1 + "\t"
				+ artigoConferenciaA2 + "\t" + artigoConferenciaB1 + "\t" + artigoConferenciaB2 + "\t"
				+ artigoConferenciaB3 + "\t" + artigoConferenciaB4 + "\t" + artigoConferenciaB5 + "\t"
				+ artigoConferenciaC + "\t" + artigoConferenciaNC + "\t" + bancasDoutoradoValidas + "\t"
				+ bancasMestradoValidas + "\t" + bancasGraduacaoValidas + "\t" + orientaçoesDoutoradoConcluidasValidas
				+ "\t" + orientaçoesMestradoConcluidasValidas + "\t" + orientaçoesProjetoFinalConcluidasValidas + "\t"
				+ orientaçoesDoutoradoAndamentoValidas + "\t" + orientaçoesMestradoAndamentoValidas + "\t"
				+ orientaçoesDoutoradoAndamentoValidas;

		return conteudo;

	}

	/**
	 * Retorna a quantidade de Bancas válidas
	 */
	public int validaBancas(List<Banca> list, int anoInicial, int anoFinal) {

		int quantidade = 0;

		for (Banca banca : list) {

			if (banca.getAno() >= anoInicial && banca.getAno() <= anoFinal) {

				quantidade++;

			}

		}

		return quantidade;
	}

	/**
	 * Retorna a quantidade de Orientacoes válidas
	 */
	public int validaOrientacoes(List<Orientacao> list, int anoInicial, int anoFinal) {

		int quantidade = 0;

		for (Orientacao orientacao : list) {

			if (orientacao.getAno() >= anoInicial && orientacao.getAno() <= anoFinal) {

				quantidade++;

			}

		}

		return quantidade;
	}

	/**
	 * Filtra os artigos válidos e conta quantos de cada tipo existem
	 */
	public void filtroDeArtigos(int anoInicial, int anoFinal) {

		for (Artigos artg : artigoEvento) {

			if (artg.getSituacao() == Situacao.CONCLUIDO) {
				
				if (artg.getAno() >= anoInicial && anoFinal <= artg.getAno() && artg.getNivelArtigo() != null) {

					switch (artg.getNivelArtigo()) {
					case A1:

						artigoConferenciaA1++;

						break;

					case A2:

						artigoConferenciaA2++;

						break;

					case B1:

						artigoConferenciaB1++;

						break;

					case B2:

						artigoConferenciaB2++;

						break;

					case B3:

						artigoConferenciaB3++;

						break;

					case B4:

						artigoConferenciaB4++;

						break;

					case B5:

						artigoConferenciaB5++;

						break;

					case C:

						artigoConferenciaC++;

						break;

					case NC:

						artigoConferenciaNC++;

						break;

					default:
						break;
					}

				}

			}

		}

		for (Artigos artg : artigoPeriodico) {

			if (artg.getSituacao() == Situacao.CONCLUIDO) {
				
				if (artg.getAno() >= anoInicial && anoFinal <= artg.getAno() && artg.getNivelArtigo() != null) {

					switch (artg.getNivelArtigo()) {
					case A1:

						artigoPeriodicoA1++;

						break;

					case A2:

						artigoPeriodicoA2++;

						break;

					case B1:

						artigoPeriodicoB1++;

						break;

					case B2:

						artigoPeriodicoB2++;

						break;

					case B3:

						artigoPeriodicoB3++;

						break;

					case B4:

						artigoPeriodicoB4++;

						break;

					case B5:

						artigoPeriodicoB5++;

						break;

					case C:

						artigoPeriodicoC++;

						break;

					case NC:

						artigoPeriodicoNC++;

						break;

					default:
						break;
					}

				}
			}
		}

	}

	public List<Artigos> getArtigoPeriodico() {
		return artigoPeriodico;
	}

	public void setArtigoPeriodico(List<Artigos> artigoPeriodico) {
		this.artigoPeriodico = artigoPeriodico;
	}

	public List<Artigos> getArtigoEvento() {
		return artigoEvento;
	}

	public void setArtigoEvento(List<Artigos> artigoEvento) {
		this.artigoEvento = artigoEvento;
	}

	public int getArtigoPeriodicoA1() {
		return artigoPeriodicoA1;
	}

	public void setArtigoPeriodicoA1(int artigoPeriodicoA1) {
		this.artigoPeriodicoA1 = artigoPeriodicoA1;
	}

	public int getArtigoPeriodicoA2() {
		return artigoPeriodicoA2;
	}

	public void setArtigoPeriodicoA2(int artigoPeriodicoA2) {
		this.artigoPeriodicoA2 = artigoPeriodicoA2;
	}

	public int getArtigoPeriodicoB1() {
		return artigoPeriodicoB1;
	}

	public void setArtigoPeriodicoB1(int artigoPeriodicoB1) {
		this.artigoPeriodicoB1 = artigoPeriodicoB1;
	}

	public int getArtigoPeriodicoB2() {
		return artigoPeriodicoB2;
	}

	public void setArtigoPeriodicoB2(int artigoPeriodicoB2) {
		this.artigoPeriodicoB2 = artigoPeriodicoB2;
	}

	public int getArtigoPeriodicoB3() {
		return artigoPeriodicoB3;
	}

	public void setArtigoPeriodicoB3(int artigoPeriodicoB3) {
		this.artigoPeriodicoB3 = artigoPeriodicoB3;
	}

	public int getArtigoPeriodicoB4() {
		return artigoPeriodicoB4;
	}

	public void setArtigoPeriodicoB4(int artigoPeriodicoB4) {
		this.artigoPeriodicoB4 = artigoPeriodicoB4;
	}

	public int getArtigoPeriodicoC() {
		return artigoPeriodicoC;
	}

	public void setArtigoPeriodicoC(int artigoPeriodicoC) {
		this.artigoPeriodicoC = artigoPeriodicoC;
	}

	public int getArtigoPeriodicoNC() {
		return artigoPeriodicoNC;
	}

	public void setArtigoPeriodicoNC(int artigoPeriodicoNC) {
		this.artigoPeriodicoNC = artigoPeriodicoNC;
	}

	public int getArtigoConferenciaA1() {
		return artigoConferenciaA1;
	}

	public void setArtigoConferenciaA1(int artigoConferenciaA1) {
		this.artigoConferenciaA1 = artigoConferenciaA1;
	}

	public int getArtigoConferenciaA2() {
		return artigoConferenciaA2;
	}

	public void setArtigoConferenciaA2(int artigoConferenciaA2) {
		this.artigoConferenciaA2 = artigoConferenciaA2;
	}

	public int getArtigoConferenciaB1() {
		return artigoConferenciaB1;
	}

	public void setArtigoConferenciaB1(int artigoConferenciaB1) {
		this.artigoConferenciaB1 = artigoConferenciaB1;
	}

	public int getArtigoConferenciaB2() {
		return artigoConferenciaB2;
	}

	public void setArtigoConferenciaB2(int artigoConferenciaB2) {
		this.artigoConferenciaB2 = artigoConferenciaB2;
	}

	public int getArtigoConferenciaB3() {
		return artigoConferenciaB3;
	}

	public void setArtigoConferenciaB3(int artigoConferenciaB3) {
		this.artigoConferenciaB3 = artigoConferenciaB3;
	}

	public int getArtigoConferenciaB4() {
		return artigoConferenciaB4;
	}

	public void setArtigoConferenciaB4(int artigoConferenciaB4) {
		this.artigoConferenciaB4 = artigoConferenciaB4;
	}

	public int getArtigoConferenciaC() {
		return artigoConferenciaC;
	}

	public void setArtigoConferenciaC(int artigoConferenciaC) {
		this.artigoConferenciaC = artigoConferenciaC;
	}

	public int getArtigoConferenciaNC() {
		return artigoConferenciaNC;
	}

	public void setArtigoConferenciaNC(int artigoConferenciaNC) {
		this.artigoConferenciaNC = artigoConferenciaNC;
	}

	public List<Banca> getBancasDoutorado() {
		return bancasDoutorado;
	}

	public void setBancasDoutorado(List<Banca> bancasDoutorado) {
		this.bancasDoutorado = bancasDoutorado;
	}

	public List<Banca> getBancasMestrado() {
		return bancasMestrado;
	}

	public void setBancasMestrado(List<Banca> bancasMestrado) {
		this.bancasMestrado = bancasMestrado;
	}

	public List<Banca> getBancasGraduacao() {
		return bancasGraduacao;
	}

	public void setBancasGraduacao(List<Banca> bancasGraduacao) {
		this.bancasGraduacao = bancasGraduacao;
	}

	public List<Orientacao> getOrientaçoesDoutoradoConcluidas() {
		return orientaçoesDoutoradoConcluidas;
	}

	public void setOrientaçoesDoutoradoConcluidas(List<Orientacao> orientaçoesDoutoradoConcluidas) {
		this.orientaçoesDoutoradoConcluidas = orientaçoesDoutoradoConcluidas;
	}

	public List<Orientacao> getOrientaçoesMestradoConcluidas() {
		return orientaçoesMestradoConcluidas;
	}

	public void setOrientaçoesMestradoConcluidas(List<Orientacao> orientaçoesMestradoConcluidas) {
		this.orientaçoesMestradoConcluidas = orientaçoesMestradoConcluidas;
	}

	public List<Orientacao> getOrientaçoesProjetoFinalConcluidas() {
		return orientaçoesProjetoFinalConcluidas;
	}

	public void setOrientaçoesProjetoFinalConcluidas(List<Orientacao> orientaçoesProjetoFinalConcluidas) {
		this.orientaçoesProjetoFinalConcluidas = orientaçoesProjetoFinalConcluidas;
	}

	public List<Orientacao> getOrientaçoesDoutoradoAndamento() {
		return orientaçoesDoutoradoAndamento;
	}

	public void setOrientaçoesDoutoradoAndamento(List<Orientacao> orientaçoesDoutoradoAndamento) {
		this.orientaçoesDoutoradoAndamento = orientaçoesDoutoradoAndamento;
	}

	public List<Orientacao> getOrientaçoesMestradoAndamento() {
		return orientaçoesMestradoAndamento;
	}

	public void setOrientaçoesMestradoAndamento(List<Orientacao> orientaçoesMestradoAndamento) {
		this.orientaçoesMestradoAndamento = orientaçoesMestradoAndamento;
	}

	public List<Orientacao> getOrientaçoesProjetoFinalAndamento() {
		return orientaçoesProjetoFinalAndamento;
	}

	public void setOrientaçoesProjetoFinalAndamento(List<Orientacao> orientaçoesProjetoFinalAndamento) {
		this.orientaçoesProjetoFinalAndamento = orientaçoesProjetoFinalAndamento;
	}

	public int getArtigoConferenciaB5() {
		return artigoConferenciaB5;
	}

	public void setArtigoConferenciaB5(int artigoConferenciaB5) {
		this.artigoConferenciaB5 = artigoConferenciaB5;
	}

	public int getArtigoPeriodicoB5() {
		return artigoPeriodicoB5;
	}

	public void setArtigoPeriodicoB5(int artigoPeriodicoB5) {
		this.artigoPeriodicoB5 = artigoPeriodicoB5;
	}

	public int getBancasDoutoradoValidas() {
		return bancasDoutoradoValidas;
	}

	public void setBancasDoutoradoValidas(int bancasDoutoradoValidas) {
		this.bancasDoutoradoValidas = bancasDoutoradoValidas;
	}

	public int getBancasMestradoValidas() {
		return bancasMestradoValidas;
	}

	public void setBancasMestradoValidas(int bancasMestradoValidas) {
		this.bancasMestradoValidas = bancasMestradoValidas;
	}

	public int getBancasGraduacaoValidas() {
		return bancasGraduacaoValidas;
	}

	public void setBancasGraduacaoValidas(int bancasGraduacaoValidas) {
		this.bancasGraduacaoValidas = bancasGraduacaoValidas;
	}

	public int getOrientaçoesDoutoradoConcluidasValidas() {
		return orientaçoesDoutoradoConcluidasValidas;
	}

	public void setOrientaçoesDoutoradoConcluidasValidas(int orientaçoesDoutoradoConcluidasValidas) {
		this.orientaçoesDoutoradoConcluidasValidas = orientaçoesDoutoradoConcluidasValidas;
	}

	public int getOrientaçoesMestradoConcluidasValidas() {
		return orientaçoesMestradoConcluidasValidas;
	}

	public void setOrientaçoesMestradoConcluidasValidas(int orientaçoesMestradoConcluidasValidas) {
		this.orientaçoesMestradoConcluidasValidas = orientaçoesMestradoConcluidasValidas;
	}

	public int getOrientaçoesProjetoFinalConcluidasValidas() {
		return orientaçoesProjetoFinalConcluidasValidas;
	}

	public void setOrientaçoesProjetoFinalConcluidasValidas(int orientaçoesProjetoFinalConcluidasValidas) {
		this.orientaçoesProjetoFinalConcluidasValidas = orientaçoesProjetoFinalConcluidasValidas;
	}

	public int getOrientaçoesDoutoradoAndamentoValidas() {
		return orientaçoesDoutoradoAndamentoValidas;
	}

	public void setOrientaçoesDoutoradoAndamentoValidas(int orientaçoesDoutoradoAndamentoValidas) {
		this.orientaçoesDoutoradoAndamentoValidas = orientaçoesDoutoradoAndamentoValidas;
	}

	public int getOrientaçoesMestradoAndamentoValidas() {
		return orientaçoesMestradoAndamentoValidas;
	}

	public void setOrientaçoesMestradoAndamentoValidas(int orientaçoesMestradoAndamentoValidas) {
		this.orientaçoesMestradoAndamentoValidas = orientaçoesMestradoAndamentoValidas;
	}

	public int getOrientaçoesProjetoFinalAndamentoValidas() {
		return orientaçoesProjetoFinalAndamentoValidas;
	}

	public void setOrientaçoesProjetoFinalAndamentoValidas(int orientaçoesProjetoFinalAndamentoValidas) {
		this.orientaçoesProjetoFinalAndamentoValidas = orientaçoesProjetoFinalAndamentoValidas;
	}

}
