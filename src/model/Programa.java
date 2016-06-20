package model;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	private String nome;
	private List<LinhaDePesquisa> linhas = new ArrayList<LinhaDePesquisa>();

	private Curriculo curriculo = new Curriculo();

	/**
	 * Alimenta o Curriculo do programa com os dados de todas as suas linhas de
	 * pesquisa
	 */
	public void setCurriculo() {

		for (LinhaDePesquisa ldp : linhas) {

			curriculo.setArtigoConferenciaA1(curriculo.getArtigoConferenciaA1() + ldp.getArtigosA1Eventos());
			curriculo.setArtigoConferenciaA2(curriculo.getArtigoConferenciaA2() + ldp.getArtigosA2Eventos());
			curriculo.setArtigoConferenciaB1(curriculo.getArtigoConferenciaB1() + ldp.getArtigosB1Eventos());
			curriculo.setArtigoConferenciaB2(curriculo.getArtigoConferenciaB2() + ldp.getArtigosB2Eventos());
			curriculo.setArtigoConferenciaB3(curriculo.getArtigoConferenciaB3() + ldp.getArtigosB3Eventos());
			curriculo.setArtigoConferenciaB4(curriculo.getArtigoConferenciaB4() + ldp.getArtigosB4Eventos());
			curriculo.setArtigoConferenciaB5(curriculo.getArtigoConferenciaB5() + ldp.getArtigosB5Eventos());
			curriculo.setArtigoConferenciaC(curriculo.getArtigoConferenciaC() + ldp.getArtigosCEventos());
			curriculo.setArtigoConferenciaNC(curriculo.getArtigoConferenciaNC() + ldp.getArtigosNCEventos());

			curriculo.setArtigoPeriodicoA1(curriculo.getArtigoPeriodicoA1() + ldp.getArtigosA1Revistas());
			curriculo.setArtigoPeriodicoA2(curriculo.getArtigoPeriodicoA2() + ldp.getArtigosA2Revistas());
			curriculo.setArtigoPeriodicoB1(curriculo.getArtigoPeriodicoB1() + ldp.getArtigosB1Revistas());
			curriculo.setArtigoPeriodicoB2(curriculo.getArtigoPeriodicoB2() + ldp.getArtigosB2Revistas());
			curriculo.setArtigoPeriodicoB3(curriculo.getArtigoPeriodicoB3() + ldp.getArtigosB3Revistas());
			curriculo.setArtigoPeriodicoB4(curriculo.getArtigoPeriodicoB4() + ldp.getArtigosB4Revistas());
			curriculo.setArtigoPeriodicoB5(curriculo.getArtigoPeriodicoB5() + ldp.getArtigosB5Revistas());
			curriculo.setArtigoPeriodicoC(curriculo.getArtigoPeriodicoC() + ldp.getArtigosCRevistas());
			curriculo.setArtigoPeriodicoNC(curriculo.getArtigoPeriodicoNC() + ldp.getArtigosNCRevistas());

			curriculo.setBancasDoutoradoValidas(curriculo.getBancasDoutoradoValidas() + ldp.getBancasDoutorado());
			curriculo.setBancasMestradoValidas(curriculo.getBancasMestradoValidas() + ldp.getBancasMestrado());
			curriculo.setBancasGraduacaoValidas(curriculo.getBancasGraduacaoValidas() + ldp.getBancasProjetoFinal());

			curriculo.setOrientaçoesDoutoradoConcluidasValidas(
					curriculo.getOrientaçoesDoutoradoConcluidasValidas() + ldp.getOrientaçoesDoutoradoConcluidas());
			curriculo.setOrientaçoesMestradoConcluidasValidas(
					curriculo.getOrientaçoesMestradoConcluidasValidas() + ldp.getOrientaçoesMestradoConcluidas());
			curriculo
					.setOrientaçoesProjetoFinalConcluidasValidas(curriculo.getOrientaçoesProjetoFinalConcluidasValidas()
							+ ldp.getOrientaçoesProjetoFinalConcluidas());

			curriculo.setOrientaçoesDoutoradoAndamentoValidas(
					curriculo.getOrientaçoesDoutoradoAndamentoValidas() + ldp.getOrientaçoesDoutoradoAndamento());
			curriculo.setOrientaçoesMestradoAndamentoValidas(
					curriculo.getOrientaçoesMestradoAndamentoValidas() + ldp.getOrientaçoesMestradoAndamento());
			curriculo.setOrientaçoesProjetoFinalAndamentoValidas(
					curriculo.getOrientaçoesProjetoFinalAndamentoValidas() + ldp.getOrientaçoesProjetoFinalAndamento());

		}

	}

	public Curriculo getCurriculo() {
		return curriculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<LinhaDePesquisa> getLinhas() {
		return linhas;
	}

	public void setLinhas(List<LinhaDePesquisa> linhas) {
		this.linhas = linhas;
	}

}
