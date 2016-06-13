package model;

public class Professor {

	private String nome;
	private String codigo;
	private Artigos artigosRevistas;
	private Artigos artigosEventos;
	private int bancasDoutorado; // done
	private int bancasMestrado; // done
	private int bancasGraduacao; // done
	private int orientaçoesDoutoradoConcluidas;
	private int orientaçoesMestradoConcluidas;
	private int orientaçoesProjetoFinalConcluidas;
	private int orientaçoesDoutoradoAndamento;
	private int orientaçoesMestradoAndamento;
	private int orientaçoesProjetoFinalAndamento;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String cod) {
		this.codigo = cod;
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

	public int getBancasGraduacao() {
		return bancasGraduacao;
	}

	public void setBancasGraduacao(int bancasGraduacao) {
		this.bancasGraduacao = bancasGraduacao;
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
