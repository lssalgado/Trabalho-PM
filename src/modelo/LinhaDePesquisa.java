package modelo;
public class LinhaDePesquisa {

	private int artigosRevistas;
	private int artigosEventos;
	private int bancasDoutorado;
	private int bancasMestrado;
	private int bancasProjetoFinal;
	private int orientaçoesDoutoradoConcluidas;
	private int orientaçoesMestradoConcluidas;
	private int orientaçoesProjetoFinalConcluidas;
	private int orientaçoesDoutoradoAndamento;
	private int orientaçoesMestradoAndamento;
	private int orientaçoesProjetoFinalAndamento;
	private Professor professores[];

	public Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}

	public int getArtigosRevistas() {
		return artigosRevistas;
	}

	public void setArtigosRevistas(int artigosRevistas) {
		this.artigosRevistas = artigosRevistas;
	}

	public int getArtigosEventos() {
		return artigosEventos;
	}

	public void setArtigosEventos(int artigosEventos) {
		this.artigosEventos = artigosEventos;
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

}
