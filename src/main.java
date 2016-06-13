import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import accessories.Baixador;
import accessories.FactoryXML;
import accessories.LeitorXML;
import accessories.XmlUtils;
import control.Controller;

public class main {

	public static void main(String[] args) {

//		Controller.controller(args[0], args[1], args [2]);
		Controller.start();
		
		
		
//		List<String> linhas = new ArrayList<String>();
//		List<String> codigo = new ArrayList<String>();
//		List<Element> llinhas = RecuperaXML.getElementoXml(arquivo, "ARTIGO-PUBLICADO");
//		
//		for (Element l : llinhas){
//		LeitorXML.getArtigos(l, "2013", "2015");
//		
//		}
//		
//		for (Element l : llinhas) {
//			List<Element> e = XmlUtils.getElements(l, "DETALHAMENTO-DO-ARTIGO");
//			for (Element es : e) {
//				System.out.println(XmlUtils.getStringAttribute(es, "TITULO-DO-PERIODICO-OU-REVISTA"));
//			
//			}
//			List<Element> lista = XmlUtils.getElements(l, "DADOS-BASICOS-DO-ARTIGO");
//			for (Element ls : lista){
//			String lp = XmlUtils.getStringAttribute(ls, "TITULO-DO-ARTIGO");
//			System.out.println(lp);
//			String pl = XmlUtils.getStringAttribute(ls, "ANO-DO-ARTIGO");
//			System.out.println(pl);
//			linhas.add(lp);
//			codigo.add(pl);
//			}
//		}

		// for (String s : linhas){
		// System.out.println(s);
		// }
		//
		// for (String i : codigo){
		// System.out.println(i);
		// }
	}
}
/*
 * package com.unirio.controlador;
 * 
 * import com.unirio.acessorios.Baixador; import
 * com.unirio.modelo.LeitorLinhaPesquisa; import
 * com.unirio.modelo.LeitorProfessor; import com.unirio.modelo.LeitorPrograma;
 * import com.unirio.modelo.LinhaPesquisa; import com.unirio.modelo.Professor;
 * import com.unirio.modelo.Programa; import java.util.ArrayList; import
 * java.util.List;
 * 
 * 
 * public class Controlador {
 * 
 * public static void main(String[] args) {
 * 
 * Baixador.baixarPrimeiroArquivo(); Baixador.baixarSegundoArquivo();
 * Baixador.baixarTerceiroArquivo(); List<Programa> programas =
 * LeitorPrograma.recuperaDadosPrograma(); for(Programa p : programas){
 * 
 * List<LinhaPesquisa> linhasPesquisa =
 * LeitorLinhaPesquisa.recuperaDadosLinhaPesquisa(p); for(LinhaPesquisa
 * linhaPesquisa : linhasPesquisa){
 * 
 * List<Professor> professores = LeitorProfessor.recuperaDadosProfessor();
 * for(Professor professor : professores){
 * 
 * System.out.println("Programa: " + p.getNome() + "  Linha de Pesquisa: " +
 * linhaPesquisa.getNome() + " Professor: " + professor.getNome() + " .");
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * }
 */
