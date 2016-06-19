package model;

import java.util.List;

public class Curriculo {

	private List<Artigos> artigoPeriodico;
	private List<Artigos> artigoEvento;
	private int artigoPeriodicoA1;
	private int artigoPeriodicoA2;
	private int artigoPeriodicoB1;
	private int artigoPeriodicoB2;
	private int artigoPeriodicoB3;
	private int artigoPeriodicoB4;
	private int artigoPeriodicoC;
	private int artigoPeriodicoNC;
	private int artigoConferenciaA1;
	private int artigoConferenciaA2;
	private int artigoConferenciaB1;
	private int artigoConferenciaB2;
	private int artigoConferenciaB3;
	private int artigoConferenciaB4;
	private int artigoConferenciaC;
	private int artigoConferenciaNC;
	/*
	 * private List<Artigos> artigoPeriodicoA1; private List<Artigos>
	 * artigoPeriodicoA2; private List<Artigos> artigoPeriodicoB1; private
	 * List<Artigos> artigoPeriodicoB2; private List<Artigos> artigoPeriodicoB3;
	 * private List<Artigos> artigoPeriodicoB4; private List<Artigos>
	 * artigoPeriodicoC; private List<Artigos> artigoPeriodicoNC; private
	 * List<Artigos> artigoConferenciaA1; private List<Artigos>
	 * artigoConferenciaA2; private List<Artigos> artigoConferenciaB1; private
	 * List<Artigos> artigoConferenciaB2; private List<Artigos>
	 * artigoConferenciaB3; private List<Artigos> artigoConferenciaB4; private
	 * List<Artigos> artigoConferenciaC; private List<Artigos>
	 * artigoConferenciaNC;
	 */
	private List<Banca> bancasDoutorado;
	private List<Banca> bancasMestrado;
	private List<Banca> bancasGraduacao;
	private List<Orientacao> orientaçoesDoutoradoConcluidas;
	private List<Orientacao> orientaçoesMestradoConcluidas;
	private List<Orientacao> orientaçoesProjetoFinalConcluidas;
	private List<Orientacao> orientaçoesDoutoradoAndamento;
	private List<Orientacao> orientaçoesMestradoAndamento;
	private List<Orientacao> orientaçoesProjetoFinalAndamento;

	
	/**
	 * Filtra os artigos válidos e conta quantos de cada tipo existem
	 */
	public void filtroDeArtigos(int anoInicial, int anoFinal) {

		for (Artigos artg : artigoEvento) {

			if (artg.getSituacao() == Situacao.CONCLUIDO) {

				if (artg.getAno() >= anoInicial && anoFinal <= artg.getAno()) {

					switch (artg.getNivelArtigo()) {
					case A1:

						this.artigoConferenciaA1++;

						break;

					case A2:

						this.artigoConferenciaA2++;

						break;

					case B1:

						this.artigoConferenciaB1++;

						break;

					case B2:

						this.artigoConferenciaB2++;

						break;

					case B3:

						this.artigoConferenciaB3++;

						break;

					case B4:

						this.artigoConferenciaB4++;

						break;

					case C:

						this.artigoConferenciaC++;

						break;

					case NC:

						this.artigoConferenciaNC++;

						break;

					default:
						break;
					}

				}

			}

		}

		for (Artigos artg : artigoPeriodico) {

			if (artg.getSituacao() == Situacao.CONCLUIDO) {

				if (artg.getAno() >= anoInicial && anoFinal <= artg.getAno()) {

					switch (artg.getNivelArtigo()) {
					case A1:

						this.artigoPeriodicoA1++;

						break;

					case A2:

						this.artigoPeriodicoA2++;

						break;

					case B1:

						this.artigoPeriodicoB1++;

						break;

					case B2:

						this.artigoPeriodicoB2++;

						break;

					case B3:

						this.artigoPeriodicoB3++;

						break;

					case B4:

						this.artigoPeriodicoB4++;

						break;

					case C:

						this.artigoPeriodicoC++;

						break;

					case NC:

						this.artigoPeriodicoNC++;

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

}
