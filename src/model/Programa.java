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

			curriculo.setArtigoConferenciaA1(curriculo.getArtigoConferenciaA1() + ldp.getCurriculo().getArtigoConferenciaA1());
			curriculo.setArtigoConferenciaA2(curriculo.getArtigoConferenciaA2() + ldp.getCurriculo().getArtigoConferenciaA2());
			curriculo.setArtigoConferenciaB1(curriculo.getArtigoConferenciaB1() + ldp.getCurriculo().getArtigoConferenciaB1());
			curriculo.setArtigoConferenciaB2(curriculo.getArtigoConferenciaB2() + ldp.getCurriculo().getArtigoConferenciaB2());
			curriculo.setArtigoConferenciaB3(curriculo.getArtigoConferenciaB3() + ldp.getCurriculo().getArtigoConferenciaB3());
			curriculo.setArtigoConferenciaB4(curriculo.getArtigoConferenciaB4() + ldp.getCurriculo().getArtigoConferenciaB4());
			curriculo.setArtigoConferenciaB5(curriculo.getArtigoConferenciaB5() + ldp.getCurriculo().getArtigoConferenciaB5());
			curriculo.setArtigoConferenciaC(curriculo.getArtigoConferenciaC() + ldp.getCurriculo().getArtigoConferenciaC());
			curriculo.setArtigoConferenciaNC(curriculo.getArtigoConferenciaNC() + ldp.getCurriculo().getArtigoConferenciaNC());

			curriculo.setArtigoPeriodicoA1(curriculo.getArtigoPeriodicoA1() + ldp.getCurriculo().getArtigoPeriodicoA1());
			curriculo.setArtigoPeriodicoA2(curriculo.getArtigoPeriodicoA2() + ldp.getCurriculo().getArtigoPeriodicoA2());
			curriculo.setArtigoPeriodicoB1(curriculo.getArtigoPeriodicoB1() + ldp.getCurriculo().getArtigoPeriodicoB1());
			curriculo.setArtigoPeriodicoB2(curriculo.getArtigoPeriodicoB2() + ldp.getCurriculo().getArtigoPeriodicoB2());
			curriculo.setArtigoPeriodicoB3(curriculo.getArtigoPeriodicoB3() + ldp.getCurriculo().getArtigoPeriodicoB3());
			curriculo.setArtigoPeriodicoB4(curriculo.getArtigoPeriodicoB4() + ldp.getCurriculo().getArtigoPeriodicoB4());
			curriculo.setArtigoPeriodicoB5(curriculo.getArtigoPeriodicoB5() + ldp.getCurriculo().getArtigoPeriodicoB5());
			curriculo.setArtigoPeriodicoC(curriculo.getArtigoPeriodicoC() + ldp.getCurriculo().getArtigoPeriodicoC());
			curriculo.setArtigoPeriodicoNC(curriculo.getArtigoPeriodicoNC() + ldp.getCurriculo().getArtigoPeriodicoNC());

			curriculo.setBancasDoutoradoValidas(curriculo.getBancasDoutoradoValidas() + ldp.getCurriculo().getBancasDoutoradoValidas());
			curriculo.setBancasMestradoValidas(curriculo.getBancasMestradoValidas() + ldp.getCurriculo().getBancasMestradoValidas());
			curriculo.setBancasGraduacaoValidas(curriculo.getBancasGraduacaoValidas() + ldp.getCurriculo().getBancasGraduacaoValidas());

			curriculo.setOrientaçoesDoutoradoConcluidasValidas(
					curriculo.getOrientaçoesDoutoradoConcluidasValidas() + ldp.getCurriculo().getOrientaçoesDoutoradoConcluidasValidas());
			curriculo.setOrientaçoesMestradoConcluidasValidas(
					curriculo.getOrientaçoesMestradoConcluidasValidas() + ldp.getCurriculo().getOrientaçoesMestradoConcluidasValidas());
			curriculo
					.setOrientaçoesProjetoFinalConcluidasValidas(curriculo.getOrientaçoesProjetoFinalConcluidasValidas()
							+ ldp.getCurriculo().getOrientaçoesProjetoFinalConcluidasValidas());

			curriculo.setOrientaçoesDoutoradoAndamentoValidas(
					curriculo.getOrientaçoesDoutoradoAndamentoValidas() + ldp.getCurriculo().getOrientaçoesDoutoradoAndamentoValidas());
			curriculo.setOrientaçoesMestradoAndamentoValidas(
					curriculo.getOrientaçoesMestradoAndamentoValidas() + ldp.getCurriculo().getOrientaçoesMestradoAndamentoValidas());
			curriculo.setOrientaçoesProjetoFinalAndamentoValidas(
					curriculo.getOrientaçoesProjetoFinalAndamentoValidas() + ldp.getCurriculo().getOrientaçoesProjetoFinalAndamentoValidas());

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
