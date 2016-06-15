package control;

import java.util.List;

import org.w3c.dom.Element;

import accessories.Baixador;
import accessories.Escritor;
import accessories.FactoryXML;
import accessories.LeitorXML;
import accessories.XmlUtils;
import model.LinhaDePesquisa;
import model.Professor;

/**
 * Essa classe é responsável por controlar o programa como um todo.
 * 
 * @author Lucas
 */

public class Controller {

	private static List<LinhaDePesquisa> linhaDePesquisa;

	public void controller(String project, String start, String stop) {

	}

	public void start() {

		LeitorXML leitor = new LeitorXML();
		String project = "PPGI-UNIRIO";
		Baixador.downloadProject(project);
		Baixador.downloadQualis();
		String tagName = "linha";
		linhaDePesquisa = leitor.getLinhas("contents.xml");
		List<Element> lines = FactoryXML.getElementoXml("contents.xml", tagName);
		for (Element e : lines) {
//fazer o getlinhas chamar getprofessores, o getprofessores chamar um getcurriculo e este chamar todo o resto.
			linhaDePesquisa = leitor.getProfessor(e, linhaDePesquisa);

		}

		for (LinhaDePesquisa ldp : linhaDePesquisa) {

			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + ldp.getNome());
			// ldp.printProfessores();
			for (Professor prf : ldp.getProfessores()) {

				// Baixador.downloadProfessor(project, prf.getCodigo());
				int mestrado = leitor.getBancasMestrado("curriculos/" + prf.getCodigo() + "-curriculo.xml", 2013, 2015);
				prf.setBancasMestrado(mestrado);
				int doutorado = leitor.getBancasDoutorado("curriculos/" + prf.getCodigo() + "-curriculo.xml", 2013, 2015);
				prf.setBancasDoutorado(doutorado);
				int graduacao = leitor.getBancasGraduacao("curriculos/" + prf.getCodigo() + "-curriculo.xml", 2013, 2015);
				prf.setBancasGraduacao(graduacao);
				leitor.getArtigos("curriculos/" + prf.getCodigo() + "-curriculo.xml", 2013, 2015);
			}

		}
		Escritor.escreveArquivo(linhaDePesquisa, project);
	}

}
