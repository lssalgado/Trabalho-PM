package model;

import java.util.ArrayList;
import java.util.List;

public class LinhaDePesquisa {

	private List<Professor> professores = new ArrayList<Professor>();
	private String nome;
	private Artigos artigosRevistas;
	private Artigos artigosEventos;
	private int bancasDoutorado;
	private int bancasMestrado;
	private int bancasProjetoFinal;
	private int orientaçoesDoutoradoConcluidas;
	private int orientaçoesMestradoConcluidas;
	private int orientaçoesProjetoFinalConcluidas;
	private int orientaçoesDoutoradoAndamento;
	private int orientaçoesMestradoAndamento;
	private int orientaçoesProjetoFinalAndamento;


	public void printProfessores(){
		
		for (Professor prf : professores){
			
			System.out.println("Nome : "+prf.getNome());
			System.out.println("Codigo : "+prf.getCodigo());
			
		}
		
	}
	
	public void addListProfessores(String nomeProfessor, String codigo){
		
		Professor prf = new Professor();
		prf.setNome(nomeProfessor);
		prf.setCodigo(codigo);
		professores.add(prf);
		
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

	public void setOrientaçoesDoutoradoConcluidas(
			int orientaçoesDoutoradoConcluidas) {
		this.orientaçoesDoutoradoConcluidas = orientaçoesDoutoradoConcluidas;
	}

	public int getOrientaçoesMestradoConcluidas() {
		return orientaçoesMestradoConcluidas;
	}

	public void setOrientaçoesMestradoConcluidas(
			int orientaçoesMestradoConcluidas) {
		this.orientaçoesMestradoConcluidas = orientaçoesMestradoConcluidas;
	}

	public int getOrientaçoesProjetoFinalConcluidas() {
		return orientaçoesProjetoFinalConcluidas;
	}

	public void setOrientaçoesProjetoFinalConcluidas(
			int orientaçoesProjetoFinalConcluidas) {
		this.orientaçoesProjetoFinalConcluidas = orientaçoesProjetoFinalConcluidas;
	}

	public int getOrientaçoesDoutoradoAndamento() {
		return orientaçoesDoutoradoAndamento;
	}

	public void setOrientaçoesDoutoradoAndamento(
			int orientaçoesDoutoradoAndamento) {
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

	public void setOrientaçoesProjetoFinalAndamento(
			int orientaçoesProjetoFinalAndamento) {
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

	public Artigos getArtigosRevistas() {
		return artigosRevistas;
	}

	public void setArtigosRevistas(Artigos artigosRevistas) {
		this.artigosRevistas = artigosRevistas;
	}

	public Artigos getArtigosEventos() {
		return artigosEventos;
	}

	public void setArtigosEventos(Artigos artigosEventos) {
		this.artigosEventos = artigosEventos;
	}

}
