package control;

import java.util.List;

import org.w3c.dom.Element;

import accessories.Baixador;
import accessories.Escritor;
import accessories.FactoryXML;
import accessories.LeitorXML;
import model.Curriculo;
import model.LinhaDePesquisa;
import model.Professor;
import model.Qualis;

/**
 * Essa classe é responsável por controlar o programa como um todo.
 * 
 * @author Lucas
 */

public class Controller {

	private List<LinhaDePesquisa> linhaDePesquisa;
	private List<Qualis> qualis;

	public void controller(String project, String start, String stop) {

	}

	public void start() {

		LeitorXML leitor = new LeitorXML();
		String project = "PPGI-UNIRIO";
		Baixador.downloadProject(project);
		Baixador.downloadQualis();
		qualis = leitor.getQualis();
		
		
		leitor.getArtigosRevista("curriculos/curriculo.xml", 2013, 2014);
		/*
		String tagName = "linha";
		linhaDePesquisa = leitor.getLinhas("contents.xml");
		List<Element> lines = FactoryXML.getElementoXml("contents.xml", tagName);
		for (Element e : lines) {
//fazer o getlinhas chamar getprofessores, o getprofessores chamar um getcurriculo e este chamar todo o resto.
			linhaDePesquisa = leitor.getProfessor(e, linhaDePesquisa);

		}
		*/
		
		/*
		for (LinhaDePesquisa ldp : linhaDePesquisa) {

			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + ldp.getNome());
			
			for (Professor prf : ldp.getProfessores()) {

				Baixador.downloadProfessor(project, prf.getCodigo());
				
				/*
				int mestrado = leitor.getBancasMestrado("curriculos/" + prf.getCodigo() + "-curriculo.xml", 2013, 2015);
				prf.setBancasMestrado(mestrado);
				int doutorado = leitor.getBancasDoutorado("curriculos/" + prf.getCodigo() + "-curriculo.xml", 2013, 2015);
				prf.setBancasDoutorado(doutorado);
				int graduacao = leitor.getBancasGraduacao("curriculos/" + prf.getCodigo() + "-curriculo.xml", 2013, 2015);
				prf.setBancasGraduacao(graduacao);
				leitor.getArtigos("curriculos/" + prf.getCodigo() + "-curriculo.xml", 2013, 2015);
				
			}

		}
		*/
//		Escritor.escreveArquivo(linhaDePesquisa, project);
		
	}
	
	private void contador(){
		
		for (LinhaDePesquisa ldp : linhaDePesquisa){
			
			List<Professor> professores = ldp.getProfessores();
			
			for (Professor prf : professores){
				
				Curriculo curriculo = prf.getCurriculo();
				ldp.setArtigosA1Eventos(curriculo.getArtigoConferenciaA1());
				ldp.setArtigosA2Eventos(curriculo.getArtigoConferenciaA2());
				ldp.setArtigosB1Eventos(curriculo.getArtigoConferenciaB1());
				ldp.setArtigosB2Eventos(curriculo.getArtigoConferenciaB2());
				ldp.setArtigosB3Eventos(curriculo.getArtigoConferenciaB3());
				ldp.setArtigosB4Eventos(curriculo.getArtigoConferenciaB4());
				ldp.setArtigosCEventos(curriculo.getArtigoConferenciaC());
				ldp.setArtigosNCEventos(curriculo.getArtigoConferenciaNC());
				ldp.setArtigosA1Revistas(curriculo.getArtigoPeriodicoA1());
				ldp.setArtigosA2Revistas(curriculo.getArtigoPeriodicoA2());
				ldp.setArtigosB1Revistas(curriculo.getArtigoPeriodicoB1());
				ldp.setArtigosB2Revistas(curriculo.getArtigoPeriodicoB2());
				ldp.setArtigosB3Revistas(curriculo.getArtigoPeriodicoB3());
				ldp.setArtigosB4Revistas(curriculo.getArtigoPeriodicoB4());
				ldp.setArtigosCRevistas(curriculo.getArtigoPeriodicoC());
				ldp.setArtigosNCRevistas(curriculo.getArtigoPeriodicoNC());
				/*
				ldp.setArtigosA1Eventos(curriculo.getArtigoConferenciaA1().size());
				ldp.setArtigosA2Eventos(curriculo.getArtigoConferenciaA2().size());
				ldp.setArtigosB1Eventos(curriculo.getArtigoConferenciaB1().size());
				ldp.setArtigosB2Eventos(curriculo.getArtigoConferenciaB2().size());
				ldp.setArtigosB3Eventos(curriculo.getArtigoConferenciaB3().size());
				ldp.setArtigosB4Eventos(curriculo.getArtigoConferenciaB4().size());
				ldp.setArtigosCEventos(curriculo.getArtigoConferenciaC().size());
				ldp.setArtigosNCEventos(curriculo.getArtigoConferenciaNC().size());
				ldp.setArtigosA1Revistas(curriculo.getArtigoPeriodicoA1().size());
				ldp.setArtigosA2Revistas(curriculo.getArtigoPeriodicoA2().size());
				ldp.setArtigosB1Revistas(curriculo.getArtigoPeriodicoB1().size());
				ldp.setArtigosB2Revistas(curriculo.getArtigoPeriodicoB2().size());
				ldp.setArtigosB3Revistas(curriculo.getArtigoPeriodicoB3().size());
				ldp.setArtigosB4Revistas(curriculo.getArtigoPeriodicoB4().size());
				ldp.setArtigosCRevistas(curriculo.getArtigoPeriodicoC().size());
				ldp.setArtigosNCRevistas(curriculo.getArtigoPeriodicoNC().size());
				*/
				ldp.setBancasDoutorado(curriculo.getBancasDoutorado().size());
				ldp.setBancasMestrado(curriculo.getBancasMestrado().size());
				ldp.setBancasProjetoFinal(curriculo.getBancasGraduacao().size());
				ldp.setOrientaçoesDoutoradoAndamento(curriculo.getOrientaçoesDoutoradoAndamento().size());
				ldp.setOrientaçoesDoutoradoConcluidas(curriculo.getOrientaçoesDoutoradoConcluidas().size());
				ldp.setOrientaçoesMestradoAndamento(curriculo.getOrientaçoesMestradoAndamento().size());
				ldp.setOrientaçoesMestradoConcluidas(curriculo.getOrientaçoesMestradoConcluidas().size());
				ldp.setOrientaçoesProjetoFinalAndamento(curriculo.getOrientaçoesProjetoFinalAndamento().size());
				ldp.setOrientaçoesProjetoFinalConcluidas(curriculo.getOrientaçoesProjetoFinalConcluidas().size());
			}
			
		}
		
	}

}
