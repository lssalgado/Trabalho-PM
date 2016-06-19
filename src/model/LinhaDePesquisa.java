package model;

import java.util.ArrayList;
import java.util.List;

public class LinhaDePesquisa {

	private List<Professor> professores = new ArrayList<Professor>();
	private String nome;
	private int artigosA1Revistas;
	private int artigosA2Revistas;
	private int artigosB1Revistas;
	private int artigosB2Revistas;
	private int artigosB3Revistas;
	private int artigosB4Revistas;
	private int artigosCRevistas;
	private int artigosNCRevistas;
	private int artigosA1Eventos;
	private int artigosA2Eventos;
	private int artigosB1Eventos;
	private int artigosB2Eventos;
	private int artigosB3Eventos;
	private int artigosB4Eventos;
	private int artigosCEventos;
	private int artigosNCEventos;
	private int bancasDoutorado;
	private int bancasMestrado;
	private int bancasProjetoFinal;
	private int orientaçoesDoutoradoConcluidas;
	private int orientaçoesMestradoConcluidas;
	private int orientaçoesProjetoFinalConcluidas;
	private int orientaçoesDoutoradoAndamento;
	private int orientaçoesMestradoAndamento;
	private int orientaçoesProjetoFinalAndamento;

	public void printProfessores() {

		for (Professor prf : professores) {

			System.out.println("Nome : " + prf.getNome());
			System.out.println("Codigo : " + prf.getCodigo());

		}

	}

	public void addListProfessores(String nomeProfessor, String codigo) {

		Professor prf = new Professor();
		prf.setNome(nomeProfessor);
		prf.setCodigo(codigo);
		professores.add(prf);

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

}
