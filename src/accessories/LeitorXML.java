package accessories;

import java.util.ArrayList;
import java.util.List;

import model.LinhaDePesquisa;
import model.Professor;

import org.w3c.dom.Element;

public class LeitorXML {

	
	public List<Professor> alimentaProfessores(List<Professor> professores, int anoInicial, int anoFinal){
		
		List<Professor> prfs = professores;
		String filePath;
		for (Professor prof : prfs){
			
			filePath = "curriculos/" + prof.getCodigo() + "-curriculo.xml";
			
			
		}
		return prfs;
		
		
		
		
	}
	
	/**
	 * Retorna a quantidade de artigos de dado professor
	 */
	private List<Professor> getArtigos(String filePath, int anoInicial, int anoFinal) {

		List<Element> artigos = FactoryXML.getElementoXml(filePath, "ARTIGO-PUBLICADO");
		for (Element e : artigos) {

			List<Element> l = XmlUtils.getElements(e, "DETALHAMENTO-DO-ARTIGO");
			for (Element es : l) {
				// System.out.println(XmlUtils.getStringAttribute(es,
				// "TITULO-DO-PERIODICO-OU-REVISTA"));

			}
			List<Element> lista = XmlUtils.getElements(e, "DADOS-BASICOS-DO-ARTIGO");
			for (Element ls : lista) {
				// String lp = XmlUtils.getStringAttribute(ls,
				// "TITULO-DO-ARTIGO");
				// System.out.println(lp);
				// String pl = XmlUtils.getStringAttribute(ls, "ANO-DO-ARTIGO");
				// System.out.println(pl);
				System.out.println(XmlUtils.getStringAttribute(ls, "MEIO-DE-DIVULGACAO"));

			}
		}
		return null;

	}

	/**
	 * Retorna a quantidade de orientações de Mestrado em andamento de dado
	 * professor obedecendo as datas @anoInicial e @anoFinal através de um
	 * arquivo @filepath
	 */
	private int getOrientacaoMestradoAndamento(String filePath, int anoInicial, int anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= (anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= (anoFinal)) {
					a++;
				}
			}
		}
		return a;

	}

	/**
	 * Retorna a quantidade de orientações de TCC em andamento de dado professor
	 * obedecendo as datas @anoInicial e @anoFinal através de um
	 * arquivo @filepath
	 */
	private int getOrientacaoTCCAndamento(String filePath, int anoInicial, int anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= (anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= (anoFinal)) {
					a++;
				}
			}
		}
		return a;

	}

	/**
	 * Retorna a quantidade de orientações de Doutorado em andamento de dado
	 * professor obedecendo as datas @anoInicial e @anoFinal através de um
	 * arquivo @filepath
	 */
	private int getOrientacaoDoutoradoAndamento(String filePath, int anoInicial, int anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= (anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= (anoFinal)) {
					a++;
				}
			}
		}
		return a;

	}

	/**
	 * Retorna a quantidade de orientações de Mestrado concluídas de dado
	 * professor obedecendo as datas @anoInicial e @anoFinal através de um
	 * arquivo @filepath
	 */
	private int getOrientacaoMestradoConcluida(String filePath, int anoInicial, int anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= (anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= (anoFinal)) {
					a++;
				}
			}
		}
		return a;

	}

	/**
	 * Retorna a quantidade de orientações de TCC concluídas de dado professor
	 * obedecendo as datas @anoInicial e @anoFinal através de um
	 * arquivo @filepath
	 */
	private int getOrientacaoTCCConcluida(String filePath, int anoInicial, int anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "OUTRAS-ORIENTACOES-CONCLUIDAS");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= (anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= (anoFinal)
						&& XmlUtils.getStringAttribute(es, "NATUREZA")
								.contentEquals("TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO")) {
					a++;
				}
			}
		}
		return a;

	}

	/**
	 * Retorna a quantidade de orientações de Doutorado concluídas de dado
	 * professor obedecendo as datas @anoInicial e @anoFinal através de um
	 * arquivo @filepath
	 */
	private int getOrientacaoDoutoradoConcluida(String filePath, int anoInicial, int anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= (anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= (anoFinal)) {
					a++;
				}
			}
		}
		return a;

	}

	/**
	 * Retorna a quantidade de bancas de Mestrado de dado professor obedecendo
	 * as datas @anoInicial e @anoFinal através de um arquivo @filepath
	 */
	private int getBancasMestrado(String filePath, int anoInicial, int anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "PARTICIPACAO-EM-BANCA-DE-MESTRADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-MESTRADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= (anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= (anoFinal)) {
					a++;
				}
			}
		}
		return a;

	}

	/**
	 * Retorna a quantidade de bancas de Doutorado de dado professor obedecendo
	 * as datas @anoInicial e @anoFinal através de um arquivo @filepath
	 */
	private int getBancasDoutorado(String filePath, int anoInicial, int anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "PARTICIPACAO-EM-BANCA-DE-DOUTORADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-DOUTORADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= (anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= (anoFinal)) {
					a++;
				}
			}
		}
		return a;

	}

	/**
	 * Retorna a quantidade de bancas de Graduação de dado professor obedecendo
	 * as datas @anoInicial e @anoFinal através de um arquivo @filepath
	 */
	private int getBancasGraduacao(String filePath, int anoInicial, int anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "PARTICIPACAO-EM-BANCA-DE-GRADUACAO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-GRADUACAO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= (anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= (anoFinal)) {
					a++;
				}
			}
		}
		System.out.println(a);
		return a;

	}

	/**
	 * Retorna uma lista de LinhaDePesquisa após alimentar a mesma com os dados
	 * de seus respectivos professores
	 */
	private List<LinhaDePesquisa> getProfessor(Element e, List<LinhaDePesquisa> ldp) {

		List<Element> l = XmlUtils.getElements(e, "professor");
		for (Element es : l) {

			for (LinhaDePesquisa ldps : ldp) {

				if (ldps.getNome().contentEquals(XmlUtils.getStringAttribute(e, "nome"))) {
					ldps.addListProfessores(XmlUtils.getStringAttribute(es, "nome"),
							XmlUtils.getStringAttribute(es, "codigo"));
				}

			}

			// System.out.println(XmlUtils.getStringAttribute(e, "nome"));
			// System.out.println("Nome : " + XmlUtils.getStringAttribute(es,
			// "nome"));
			// System.out.println("Codigo : " +XmlUtils.getStringAttribute(es,
			// "codigo"));

		}

		return ldp;
	}

	
	/**
	 * Retorna uma lista de LinhaDePesquisa obtida através do aquivo @filePath
	 */
	private List<LinhaDePesquisa> getLinhas(String filePath) {

		List<LinhaDePesquisa> ldp = new ArrayList<LinhaDePesquisa>();
		String tagName = "linha";

		List<Element> lines = FactoryXML.getElementoXml(filePath, tagName);
		for (Element es : lines) {

			String nome = XmlUtils.getStringAttribute(es, "nome");
			LinhaDePesquisa linha = new LinhaDePesquisa();
			linha.setNome(nome);
			ldp.add(linha);

		}
		System.out.println(ldp.size());
		return ldp;

	}

//	private int countBancasMestrado(String filePath) {
//
//		String tagName = "";
//
//		List<Element> bancas = FactoryXML.getElementoXml(filePath, tagName);
//
//		for (Element e : bancas) {
//
//		}
//
//		return 0;
//	}

}
