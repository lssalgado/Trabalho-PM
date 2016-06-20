package model;

import java.util.ArrayList;
import java.util.List;

public class LinhaDePesquisa {

	private List<Professor> professores = new ArrayList<Professor>();
	private String nome;
	private int artigosA1Revistas = 0;
	private int artigosA2Revistas = 0;
	private int artigosB1Revistas = 0;
	private int artigosB2Revistas = 0;
	private int artigosB3Revistas = 0;
	private int artigosB4Revistas = 0;
	private int artigosB5Revistas = 0;
	private int artigosCRevistas = 0;
	private int artigosNCRevistas = 0;
	private int artigosA1Eventos = 0;
	private int artigosA2Eventos = 0;
	private int artigosB1Eventos = 0;
	private int artigosB2Eventos = 0;
	private int artigosB3Eventos = 0;
	private int artigosB4Eventos = 0;
	private int artigosB5Eventos = 0;
	private int artigosCEventos = 0;
	private int artigosNCEventos = 0;
	private int bancasDoutorado = 0;
	private int bancasMestrado = 0;
	private int bancasProjetoFinal = 0;
	private int orientaçoesDoutoradoConcluidas = 0;
	private int orientaçoesMestradoConcluidas = 0;
	private int orientaçoesProjetoFinalConcluidas = 0;
	private int orientaçoesDoutoradoAndamento = 0;
	private int orientaçoesMestradoAndamento = 0;
	private int orientaçoesProjetoFinalAndamento = 0;

	public String getConteudo() {

		String conteudo = nome + "\t" + artigosA1Revistas + "\t" + artigosA2Revistas + "\t" + artigosB1Revistas + "\t"
				+ artigosB2Revistas + "\t" + artigosB3Revistas + "\t" + artigosB4Revistas + "\t" + artigosB5Revistas
				+ "\t" + artigosCRevistas + "\t" + artigosNCRevistas + "\t" + artigosA1Eventos + "\t" + artigosA2Eventos
				+ "\t" + artigosB1Eventos + "\t" + artigosB2Eventos + "\t" + artigosB3Eventos + "\t" + artigosB4Eventos
				+ "\t" + artigosB5Eventos + "\t" + artigosCEventos + "\t" + artigosNCEventos + "\t" + bancasDoutorado
				+ "\t" + bancasMestrado + "\t" + bancasProjetoFinal + "\t" + orientaçoesDoutoradoConcluidas + "\t"
				+ orientaçoesMestradoConcluidas + "\t" + orientaçoesProjetoFinalConcluidas + "\t"
				+ orientaçoesDoutoradoAndamento + "\t" + orientaçoesMestradoAndamento + "\t"
				+ orientaçoesProjetoFinalAndamento;
		
		return conteudo;
	}

	public void addListProfessores(String nomeProfessor, String codigo) {

		Professor prf = new Professor();
		prf.setNome(nomeProfessor);
		prf.setCodigo(codigo);
		professores.add(prf);

	}

	public String somaCurriculos() {

		for (Professor prf : professores) {

			Curriculo curriculo = prf.getCurriculo();

			artigosA1Eventos += curriculo.getArtigoConferenciaA1();
			artigosA2Eventos += curriculo.getArtigoConferenciaA2();
			artigosB1Eventos += curriculo.getArtigoConferenciaB1();
			artigosB2Eventos += curriculo.getArtigoConferenciaB2();
			artigosB3Eventos += curriculo.getArtigoConferenciaB3();
			artigosB4Eventos += curriculo.getArtigoConferenciaB4();
			artigosB5Eventos += curriculo.getArtigoConferenciaB5();
			artigosCEventos += curriculo.getArtigoConferenciaC();
			artigosNCEventos += curriculo.getArtigoConferenciaNC();

			artigosA1Revistas += curriculo.getArtigoPeriodicoA1();
			artigosA2Revistas += curriculo.getArtigoPeriodicoA2();
			artigosB1Revistas += curriculo.getArtigoPeriodicoB1();
			artigosB2Revistas += curriculo.getArtigoPeriodicoB2();
			artigosB3Revistas += curriculo.getArtigoPeriodicoB3();
			artigosB4Revistas += curriculo.getArtigoPeriodicoB4();
			artigosB5Revistas += curriculo.getArtigoPeriodicoB5();
			artigosCRevistas += curriculo.getArtigoPeriodicoC();
			artigosNCRevistas += curriculo.getArtigoPeriodicoNC();

			bancasDoutorado += curriculo.getBancasDoutoradoValidas();
			bancasMestrado += curriculo.getBancasMestradoValidas();
			bancasProjetoFinal += curriculo.getBancasGraduacaoValidas();

			orientaçoesDoutoradoConcluidas += curriculo.getOrientaçoesDoutoradoConcluidasValidas();
			orientaçoesMestradoConcluidas += curriculo.getOrientaçoesMestradoConcluidasValidas();
			orientaçoesProjetoFinalConcluidas += curriculo.getOrientaçoesProjetoFinalConcluidasValidas();

			orientaçoesDoutoradoAndamento += curriculo.getOrientaçoesDoutoradoAndamentoValidas();
			orientaçoesMestradoAndamento += curriculo.getOrientaçoesMestradoAndamentoValidas();
			orientaçoesProjetoFinalAndamento += curriculo.getOrientaçoesProjetoFinalAndamentoValidas();

		}

		String conteudo = getConteudo();
		return conteudo;

	}

	public int getArtigosA1Revistas() {
		return artigosA1Revistas;
	}

	public void setArtigosA1Revistas(int artigosA1Revistas) {
		this.artigosA1Revistas = artigosA1Revistas;
	}

	public int getArtigosA2Revistas() {
		return artigosA2Revistas;
	}

	public void setArtigosA2Revistas(int artigosA2Revistas) {
		this.artigosA2Revistas = artigosA2Revistas;
	}

	public int getArtigosB1Revistas() {
		return artigosB1Revistas;
	}

	public void setArtigosB1Revistas(int artigosB1Revistas) {
		this.artigosB1Revistas = artigosB1Revistas;
	}

	public int getArtigosB2Revistas() {
		return artigosB2Revistas;
	}

	public void setArtigosB2Revistas(int artigosB2Revistas) {
		this.artigosB2Revistas = artigosB2Revistas;
	}

	public int getArtigosB3Revistas() {
		return artigosB3Revistas;
	}

	public void setArtigosB3Revistas(int artigosB3Revistas) {
		this.artigosB3Revistas = artigosB3Revistas;
	}

	public int getArtigosB4Revistas() {
		return artigosB4Revistas;
	}

	public void setArtigosB4Revistas(int artigosB4Revistas) {
		this.artigosB4Revistas = artigosB4Revistas;
	}

	public int getArtigosCRevistas() {
		return artigosCRevistas;
	}

	public void setArtigosCRevistas(int artigosCRevistas) {
		this.artigosCRevistas = artigosCRevistas;
	}

	public int getArtigosNCRevistas() {
		return artigosNCRevistas;
	}

	public void setArtigosNCRevistas(int artigosNCRevistas) {
		this.artigosNCRevistas = artigosNCRevistas;
	}

	public int getArtigosA1Eventos() {
		return artigosA1Eventos;
	}

	public void setArtigosA1Eventos(int artigosA1Eventos) {
		this.artigosA1Eventos = artigosA1Eventos;
	}

	public int getArtigosA2Eventos() {
		return artigosA2Eventos;
	}

	public void setArtigosA2Eventos(int artigosA2Eventos) {
		this.artigosA2Eventos = artigosA2Eventos;
	}

	public int getArtigosB1Eventos() {
		return artigosB1Eventos;
	}

	public void setArtigosB1Eventos(int artigosB1Eventos) {
		this.artigosB1Eventos = artigosB1Eventos;
	}

	public int getArtigosB2Eventos() {
		return artigosB2Eventos;
	}

	public void setArtigosB2Eventos(int artigosB2Eventos) {
		this.artigosB2Eventos = artigosB2Eventos;
	}

	public int getArtigosB3Eventos() {
		return artigosB3Eventos;
	}

	public void setArtigosB3Eventos(int artigosB3Eventos) {
		this.artigosB3Eventos = artigosB3Eventos;
	}

	public int getArtigosB4Eventos() {
		return artigosB4Eventos;
	}

	public void setArtigosB4Eventos(int artigosB4Eventos) {
		this.artigosB4Eventos = artigosB4Eventos;
	}

	public int getArtigosCEventos() {
		return artigosCEventos;
	}

	public void setArtigosCEventos(int artigosCEventos) {
		this.artigosCEventos = artigosCEventos;
	}

	public int getArtigosNCEventos() {
		return artigosNCEventos;
	}

	public void setArtigosNCEventos(int artigosNCEventos) {
		this.artigosNCEventos = artigosNCEventos;
	}

	public int getBancasDoutorado() {
		return bancasDoutorado;
	}

	public void setBancasDoutorado(int bancasDoutorado) {
		this.bancasDoutorado = bancasDoutorado;
	}

	public int getBancasMestrado() {
		return bancasMestrado;
	}

	public void setBancasMestrado(int bancasMestrado) {
		this.bancasMestrado = bancasMestrado;
	}

	public int getBancasProjetoFinal() {
		return bancasProjetoFinal;
	}

	public void setBancasProjetoFinal(int bancasProjetoFinal) {
		this.bancasProjetoFinal = bancasProjetoFinal;
	}

	public int getOrientaçoesDoutoradoConcluidas() {
		return orientaçoesDoutoradoConcluidas;
	}

	public void setOrientaçoesDoutoradoConcluidas(int orientaçoesDoutoradoConcluidas) {
		this.orientaçoesDoutoradoConcluidas = orientaçoesDoutoradoConcluidas;
	}

	public int getOrientaçoesMestradoConcluidas() {
		return orientaçoesMestradoConcluidas;
	}

	public void setOrientaçoesMestradoConcluidas(int orientaçoesMestradoConcluidas) {
		this.orientaçoesMestradoConcluidas = orientaçoesMestradoConcluidas;
	}

	public int getOrientaçoesProjetoFinalConcluidas() {
		return orientaçoesProjetoFinalConcluidas;
	}

	public void setOrientaçoesProjetoFinalConcluidas(int orientaçoesProjetoFinalConcluidas) {
		this.orientaçoesProjetoFinalConcluidas = orientaçoesProjetoFinalConcluidas;
	}

	public int getOrientaçoesDoutoradoAndamento() {
		return orientaçoesDoutoradoAndamento;
	}

	public void setOrientaçoesDoutoradoAndamento(int orientaçoesDoutoradoAndamento) {
		this.orientaçoesDoutoradoAndamento = orientaçoesDoutoradoAndamento;
	}

	public int getOrientaçoesMestradoAndamento() {
		return orientaçoesMestradoAndamento;
	}

	public void setOrientaçoesMestradoAndamento(int orientaçoesMestradoAndamento) {
		this.orientaçoesMestradoAndamento = orientaçoesMestradoAndamento;
	}

	public int getOrientaçoesProjetoFinalAndamento() {
		return orientaçoesProjetoFinalAndamento;
	}

	public void setOrientaçoesProjetoFinalAndamento(int orientaçoesProjetoFinalAndamento) {
		this.orientaçoesProjetoFinalAndamento = orientaçoesProjetoFinalAndamento;
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

	public int getArtigosB5Eventos() {
		return artigosB5Eventos;
	}

	public void setArtigosB5Eventos(int artigosB5Eventos) {
		this.artigosB5Eventos = artigosB5Eventos;
	}

	public int getArtigosB5Revistas() {
		return artigosB5Revistas;
	}

	public void setArtigosB5Revistas(int artigosB5Revistas) {
		this.artigosB5Revistas = artigosB5Revistas;
	}

}
