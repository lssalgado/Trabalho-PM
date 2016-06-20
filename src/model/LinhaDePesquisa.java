package model;

import java.util.ArrayList;
import java.util.List;

public class LinhaDePesquisa {

	private List<Professor> professores = new ArrayList<Professor>();
	private String nome;

	Curriculo curriculo = new Curriculo();

	/**
	 * Alimenta o Curriculo da Linha de Pesquisa com os dados de todas os seus
	 * professores
	 */
	public void setCurriculo() {

		for (Professor prf : professores) {

			curriculo.setArtigoConferenciaA1(
					curriculo.getArtigoConferenciaA1() + prf.getCurriculo().getArtigoConferenciaA1());
			curriculo.setArtigoConferenciaA2(
					curriculo.getArtigoConferenciaA2() + prf.getCurriculo().getArtigoConferenciaA2());
			curriculo.setArtigoConferenciaB1(
					curriculo.getArtigoConferenciaB1() + prf.getCurriculo().getArtigoConferenciaB1());
			curriculo.setArtigoConferenciaB2(
					curriculo.getArtigoConferenciaB2() + prf.getCurriculo().getArtigoConferenciaB2());
			curriculo.setArtigoConferenciaB3(
					curriculo.getArtigoConferenciaB3() + prf.getCurriculo().getArtigoConferenciaB3());
			curriculo.setArtigoConferenciaB4(
					curriculo.getArtigoConferenciaB4() + prf.getCurriculo().getArtigoConferenciaB4());
			curriculo.setArtigoConferenciaB5(
					curriculo.getArtigoConferenciaB5() + prf.getCurriculo().getArtigoConferenciaB5());
			curriculo.setArtigoConferenciaC(
					curriculo.getArtigoConferenciaC() + prf.getCurriculo().getArtigoConferenciaC());
			curriculo.setArtigoConferenciaNC(
					curriculo.getArtigoConferenciaNC() + prf.getCurriculo().getArtigoConferenciaNC());

			curriculo
					.setArtigoPeriodicoA1(curriculo.getArtigoPeriodicoA1() + prf.getCurriculo().getArtigoPeriodicoA1());
			curriculo
					.setArtigoPeriodicoA2(curriculo.getArtigoPeriodicoA2() + prf.getCurriculo().getArtigoPeriodicoA2());
			curriculo
					.setArtigoPeriodicoB1(curriculo.getArtigoPeriodicoB1() + prf.getCurriculo().getArtigoPeriodicoB1());
			curriculo
					.setArtigoPeriodicoB2(curriculo.getArtigoPeriodicoB2() + prf.getCurriculo().getArtigoPeriodicoB2());
			curriculo
					.setArtigoPeriodicoB3(curriculo.getArtigoPeriodicoB3() + prf.getCurriculo().getArtigoPeriodicoB3());
			curriculo
					.setArtigoPeriodicoB4(curriculo.getArtigoPeriodicoB4() + prf.getCurriculo().getArtigoPeriodicoB4());
			curriculo
					.setArtigoPeriodicoB5(curriculo.getArtigoPeriodicoB5() + prf.getCurriculo().getArtigoPeriodicoB5());
			curriculo.setArtigoPeriodicoC(curriculo.getArtigoPeriodicoC() + prf.getCurriculo().getArtigoPeriodicoC());
			curriculo
					.setArtigoPeriodicoNC(curriculo.getArtigoPeriodicoNC() + prf.getCurriculo().getArtigoPeriodicoNC());

			curriculo.setBancasDoutoradoValidas(
					curriculo.getBancasDoutoradoValidas() + prf.getCurriculo().getBancasDoutoradoValidas());
			curriculo.setBancasMestradoValidas(
					curriculo.getBancasMestradoValidas() + prf.getCurriculo().getBancasMestradoValidas());
			curriculo.setBancasGraduacaoValidas(
					curriculo.getBancasGraduacaoValidas() + prf.getCurriculo().getBancasGraduacaoValidas());

			curriculo.setOrientaçoesDoutoradoConcluidasValidas(curriculo.getOrientaçoesDoutoradoConcluidasValidas()
					+ prf.getCurriculo().getOrientaçoesDoutoradoConcluidasValidas());
			curriculo.setOrientaçoesMestradoConcluidasValidas(curriculo.getOrientaçoesMestradoConcluidasValidas()
					+ prf.getCurriculo().getOrientaçoesMestradoConcluidasValidas());
			curriculo
					.setOrientaçoesProjetoFinalConcluidasValidas(curriculo.getOrientaçoesProjetoFinalConcluidasValidas()
							+ prf.getCurriculo().getOrientaçoesProjetoFinalConcluidasValidas());

			curriculo.setOrientaçoesDoutoradoAndamentoValidas(curriculo.getOrientaçoesDoutoradoAndamentoValidas()
					+ prf.getCurriculo().getOrientaçoesDoutoradoAndamentoValidas());
			curriculo.setOrientaçoesMestradoAndamentoValidas(curriculo.getOrientaçoesMestradoAndamentoValidas()
					+ prf.getCurriculo().getOrientaçoesMestradoAndamentoValidas());
			curriculo.setOrientaçoesProjetoFinalAndamentoValidas(curriculo.getOrientaçoesProjetoFinalAndamentoValidas()
					+ prf.getCurriculo().getOrientaçoesProjetoFinalAndamentoValidas());

		}

	}

	/**
	 * Adiciona um professor a lista de professores
	 */
	public void addListProfessores(String nomeProfessor, String codigo) {

		Professor prf = new Professor();
		prf.setNome(nomeProfessor);
		prf.setCodigo(codigo);
		professores.add(prf);

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

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

}
