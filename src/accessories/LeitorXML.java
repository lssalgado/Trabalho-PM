package accessories;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import model.LinhaDePesquisa;

public class LeitorXML {

	/**
	 * Retorna a quantidade de artigos de dado professor
	 */
	public static List<Element> getArtigos(String filePath, String anoInicial, String anoFinal) {

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
	public static int getOrientacaoMestradoAndamento(String filePath, String anoInicial, String anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= Integer.parseInt(anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= Integer.parseInt(anoFinal)) {
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
	public static int getOrientacaoTCCAndamento(String filePath, String anoInicial, String anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= Integer.parseInt(anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= Integer.parseInt(anoFinal)) {
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
	public static int getOrientacaoDoutoradoAndamento(String filePath, String anoInicial, String anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= Integer.parseInt(anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= Integer.parseInt(anoFinal)) {
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
	public static int getOrientacaoMestradoConcluida(String filePath, String anoInicial, String anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= Integer.parseInt(anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= Integer.parseInt(anoFinal)) {
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
	public static int getOrientacaoTCCConcluida(String filePath, String anoInicial, String anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "OUTRAS-ORIENTACOES-CONCLUIDAS");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= Integer.parseInt(anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= Integer.parseInt(anoFinal)
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
	public static int getOrientacaoDoutoradoConcluida(String filePath, String anoInicial, String anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= Integer.parseInt(anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= Integer.parseInt(anoFinal)) {
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
	public static int getBancasMestrado(String filePath, String anoInicial, String anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "PARTICIPACAO-EM-BANCA-DE-MESTRADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-MESTRADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= Integer.parseInt(anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= Integer.parseInt(anoFinal)) {
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
	public static int getBancasDoutorado(String filePath, String anoInicial, String anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "PARTICIPACAO-EM-BANCA-DE-DOUTORADO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-DOUTORADO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= Integer.parseInt(anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= Integer.parseInt(anoFinal)) {
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
	public static int getBancasGraduacao(String filePath, String anoInicial, String anoFinal) {

		int a = 0;
		List<Element> bancas = FactoryXML.getElementoXml(filePath, "PARTICIPACAO-EM-BANCA-DE-GRADUACAO");
		for (Element e : bancas) {
			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-GRADUACAO");
			for (Element es : l) {
				if (XmlUtils.getIntAttribute(es, "ANO") >= Integer.parseInt(anoInicial)
						&& XmlUtils.getIntAttribute(es, "ANO") <= Integer.parseInt(anoFinal)) {
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
	public static List<LinhaDePesquisa> getProfessor(Element e, List<LinhaDePesquisa> ldp) {

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
	public static List<LinhaDePesquisa> getLinhas(String filePath) {

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

//	public static int countBancasMestrado(String filePath) {
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
