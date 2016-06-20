package control;

import java.util.List;

import accessories.Baixador;
import accessories.Escritor;
import accessories.LeitorXML;
import model.Curriculo;
import model.LinhaDePesquisa;
import model.Professor;
import model.Programa;
import model.Qualis;

/**
 * Essa classe é responsável por controlar o programa como um todo.
 * 
 * @author Lucas
 */

public class Controller {

	private Programa prog = new Programa();
	private List<LinhaDePesquisa> linhaDePesquisa;
	private List<Qualis> qualis;
	private String programa;
	private int anoInicial;
	private int anoFinal;
	LeitorXML leitor;
	Baixador baixador;
	Escritor escritor;

	public Controller(String programa, String anoInicial, String anoFinal) {

		this.programa = programa;
		this.anoFinal = Integer.parseInt(anoFinal);
		this.anoInicial = Integer.parseInt(anoInicial);

	}

	public void start() {

		leitor = new LeitorXML();
		baixador = new Baixador();
		escritor = new Escritor();

		prog.setNome(programa);
		baixador.downloadProject(programa);
		baixador.downloadQualis();

		qualis = leitor.getQualis();
		linhaDePesquisa = leitor.getLinhas("contents.xml");

		iniciaTodosProfessores();
		contador();

		prog.setLinhas(linhaDePesquisa);

		escritor.escreveArquivo(prog, anoInicial, anoFinal);

	}

	/**
	 * Realiza o download dos arquivos de cada professor e alimenta os mesmos
	 * com seus curriculos
	 */
	private void iniciaTodosProfessores() {

		for (LinhaDePesquisa ldp : linhaDePesquisa) {

			List<Professor> prf = ldp.getProfessores();

			for (Professor p : prf) {

				baixador.downloadProfessor(programa, p.getCodigo());
				p.setCurriculo(leitor.alimentaProfessor("curriculos/" + p.getCodigo() + ".xml", qualis, p.getNome()));

			}

		}

	}

	/**
	 * Filtra os Artigos de todos os professores de todas as linhas de pesquisa
	 */
	private void contador() {

		for (LinhaDePesquisa ldp : linhaDePesquisa) {

			List<Professor> professores = ldp.getProfessores();

			for (Professor prf : professores) {

				Curriculo curriculo = prf.getCurriculo();
				curriculo.filtroDeArtigos(anoInicial, anoFinal);

			}

		}

	}

}
