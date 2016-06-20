package accessories;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import model.Artigos;
import model.Banca;
import model.Curriculo;
import model.LinhaDePesquisa;
import model.Natureza;
import model.NivelArtigo;
import model.Orientacao;
import model.Professor;
import model.Qualis;
import model.Situacao;
import model.TipoArtigo;

public class LeitorXML {

	/**
	 * Retorna o curriculo de dado professor após alimentar o mesmo
	 */
	public Curriculo alimentaProfessor(String filePath, List<Qualis> qualis, String nome) {

		Curriculo curriculo = new Curriculo();

		curriculo.setListas(true);
		
		curriculo.setArtigoEvento(getArtigosEvento(filePath, qualis, nome));
		curriculo.setArtigoPeriodico(getArtigosRevista(filePath, qualis, nome));

		curriculo.setOrientaçoesMestradoAndamento(getOrientacaoMestradoAndamento(filePath));
		curriculo.setOrientaçoesProjetoFinalAndamento(getOrientacaoTCCAndamento(filePath));
		curriculo.setOrientaçoesDoutoradoAndamento(getOrientacaoDoutoradoAndamento(filePath));

		curriculo.setOrientaçoesMestradoConcluidas(getOrientacaoMestradoConcluida(filePath));
		curriculo.setOrientaçoesProjetoFinalConcluidas(getOrientacaoTCCConcluida(filePath));
		curriculo.setOrientaçoesDoutoradoConcluidas(getOrientacaoDoutoradoConcluida(filePath));

		curriculo.setBancasMestrado(getBancasMestrado(filePath));
		curriculo.setBancasGraduacao(getBancasGraduacao(filePath));
		curriculo.setBancasDoutorado(getBancasDoutorado(filePath));

		return curriculo;

	}

	/**
	 * Retorna uma lista de artigos de revista.
	 */
	private List<Artigos> getArtigosRevista(String filePath, List<Qualis> qualis, String nome) {

		List<Artigos> listaArtigos = new ArrayList<Artigos>();

		List<Element> artigos = FactoryXML.getElementoXml(filePath, "ARTIGO-PUBLICADO");
		for (Element e : artigos) {

			Artigos artg = new Artigos();
			String revista = "";
			String situacao = "";
			String titulo = "";
			int ano = 0;
			NivelArtigo nivel = NivelArtigo.Nao_Listado;

			List<Element> l = XmlUtils.getElements(e, "DETALHAMENTO-DO-ARTIGO");
			for (Element es : l) {

				revista = XmlUtils.getStringAttribute(es, "TITULO-DO-PERIODICO-OU-REVISTA");

			}

			List<Element> lista = XmlUtils.getElements(e, "DADOS-BASICOS-DO-ARTIGO");
			for (Element ls : lista) {

				situacao = XmlUtils.getStringAttribute(ls, "NATUREZA");
				ano = XmlUtils.getIntAttribute(ls, "ANO-DO-ARTIGO");
				titulo = XmlUtils.getStringAttribute(ls, "TITULO-DO-ARTIGO");

				if (situacao.equals("COMPLETO")) {

					artg.setSituacao(Situacao.CONCLUIDO);

				} else {

					artg.setSituacao(Situacao.ANDAMENTO);

				}
			}
			artg.setAno(ano);
			artg.setTitulo(titulo);
			artg.setVeiculo(revista);
			artg.setTipoArtigo(TipoArtigo.ARTIGO_REVISTA);

			for (Qualis qls : qualis) {

				if (qls.getTipo() == TipoArtigo.ARTIGO_REVISTA && situacao.equals("COMPLETO")) {

					if (qls.qualificador(revista.toLowerCase())) {
						
						nivel = qls.getNivel();
						break;
					
					}
				}

			}
			
			if (nivel.equals(NivelArtigo.Nao_Listado)){
			
				System.out.println(nome + "\t Revista " + revista + "\t Não encontrado");
				
			}
			
			artg.setNivelArtigo(nivel);
			listaArtigos.add(artg);

		}
		return listaArtigos;

	}

	/**
	 * Retorna uma lista de Artigos de Eventos
	 */
	private List<Artigos> getArtigosEvento(String filePath, List<Qualis> qualis, String nome) {

		List<Artigos> listaArtigos = new ArrayList<Artigos>();

		List<Element> artigos = FactoryXML.getElementoXml(filePath, "TRABALHO-EM-EVENTOS");
		for (Element e : artigos) {

			Artigos artg = new Artigos();
			String evento = "";
			String situacao = "";
			String titulo = "";
			int ano = 0;
			NivelArtigo nivel = NivelArtigo.Nao_Listado;

			List<Element> l = XmlUtils.getElements(e, "DETALHAMENTO-DO-TRABALHO");
			for (Element es : l) {

				evento = XmlUtils.getStringAttribute(es, "NOME-DO-EVENTO");

			}

			List<Element> lista = XmlUtils.getElements(e, "DADOS-BASICOS-DO-TRABALHO");
			for (Element ls : lista) {

				situacao = XmlUtils.getStringAttribute(ls, "NATUREZA");
				ano = XmlUtils.getIntAttribute(ls, "ANO-DO-TRABALHO");
				titulo = XmlUtils.getStringAttribute(ls, "TITULO-DO-TRABALHO");

				if (situacao.equals("COMPLETO")) {

					artg.setSituacao(Situacao.CONCLUIDO);

				} else {

					artg.setSituacao(Situacao.RESUMO_EXPANDIDO);

				}

			}

			artg.setAno(ano);
			artg.setTitulo(titulo);
			artg.setVeiculo(evento);
			artg.setTipoArtigo(TipoArtigo.ARTIGO_CONVENCAO);

			for (Qualis qls : qualis) {

				if (qls.getTipo() == TipoArtigo.ARTIGO_CONVENCAO) {
					
					if (qls.qualificador(evento.toLowerCase())) {

						nivel = qls.getNivel();
						break;
						
					}
				}

			}
			
			if (nivel.equals(NivelArtigo.Nao_Listado)){
				
				System.out.println(nome + "\t Evento " + evento + "\t Não encontrado");
				
			}

			artg.setNivelArtigo(nivel);
			if (artg.getSituacao()== Situacao.CONCLUIDO){
			listaArtigos.add(artg);
			}

		}
		
		return listaArtigos;

	}

	/**
	 * Retorna uma lista de Orientacao de Mestrado em Andamento
	 */
	private List<Orientacao> getOrientacaoMestradoAndamento(String filePath) {

		List<Orientacao> orientacoes = new ArrayList<Orientacao>();

		List<Element> lista = FactoryXML.getElementoXml(filePath, "ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO");
		int ano;
		Situacao situacao = Situacao.ANDAMENTO;
		Natureza natureza = Natureza.MESTRADO;

		for (Element e : lista) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO");

			for (Element es : l) {

				ano = XmlUtils.getIntAttribute(es, "ANO");

				Orientacao orientacao = new Orientacao();

				orientacao.setAno(ano);
				orientacao.setNatureza(natureza);
				orientacao.setSituacao(situacao);

				orientacoes.add(orientacao);

			}
		}

		return orientacoes;

	}

	/**
	 * Retorna uma lista de Orientacao de TCC em Andamento
	 */
	private List<Orientacao> getOrientacaoTCCAndamento(String filePath) {

		List<Orientacao> orientacoes = new ArrayList<Orientacao>();

		List<Element> lista = FactoryXML.getElementoXml(filePath, "ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO");
		List<Element> lista2 = FactoryXML.getElementoXml(filePath, "OUTRAS-ORIENTACOES-EM-ANDAMENTO");
		int ano;
		Situacao situacao = Situacao.ANDAMENTO;
		Natureza natureza = Natureza.GRADUACAO;

		for (Element e : lista) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO");

			for (Element es : l) {

				ano = XmlUtils.getIntAttribute(es, "ANO");

				Orientacao orientacao = new Orientacao();
				orientacao.setAno(ano);
				orientacao.setNatureza(natureza);
				orientacao.setSituacao(situacao);

				orientacoes.add(orientacao);

			}
		}

		for (Element e : lista2) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-EM-ANDAMENTO");

			for (Element es : l) {

				ano = XmlUtils.getIntAttribute(es, "ANO");

				Orientacao orientacao = new Orientacao();

				orientacao.setAno(ano);
				orientacao.setNatureza(natureza);
				orientacao.setSituacao(situacao);

				orientacoes.add(orientacao);

			}
		}

		return orientacoes;

	}

	/**
	 * Retorna uma lista de Orientacao de Doutorados em Andamento
	 */
	private List<Orientacao> getOrientacaoDoutoradoAndamento(String filePath) {

		List<Orientacao> orientacoes = new ArrayList<Orientacao>();

		List<Element> lista = FactoryXML.getElementoXml(filePath, "ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO");
		int ano;
		Situacao situacao = Situacao.ANDAMENTO;
		Natureza natureza = Natureza.DOUTORADO;

		for (Element e : lista) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO");

			for (Element es : l) {

				ano = XmlUtils.getIntAttribute(es, "ANO");

				Orientacao orientacao = new Orientacao();

				orientacao.setAno(ano);
				orientacao.setNatureza(natureza);
				orientacao.setSituacao(situacao);

				orientacoes.add(orientacao);

			}
		}

		return orientacoes;

	}

	/**
	 * Retorna uma lista de Orientacao de Mestrado Concluida
	 */
	private List<Orientacao> getOrientacaoMestradoConcluida(String filePath) {

		List<Orientacao> orientacoes = new ArrayList<Orientacao>();

		List<Element> lista = FactoryXML.getElementoXml(filePath, "ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");
		int ano;
		Situacao situacao = Situacao.CONCLUIDO;
		Natureza natureza = Natureza.MESTRADO;

		for (Element e : lista) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");

			for (Element es : l) {

				ano = XmlUtils.getIntAttribute(es, "ANO");

				Orientacao orientacao = new Orientacao();

				orientacao.setAno(ano);
				orientacao.setNatureza(natureza);
				orientacao.setSituacao(situacao);

				orientacoes.add(orientacao);

			}
		}

		return orientacoes;

	}

	/**
	 * Retorna uma lista de Orientacao de TCC Concluida
	 */
	private List<Orientacao> getOrientacaoTCCConcluida(String filePath) {

		List<Orientacao> orientacoes = new ArrayList<Orientacao>();

		List<Element> lista = FactoryXML.getElementoXml(filePath, "OUTRAS-ORIENTACOES-CONCLUIDAS");
		int ano;
		Situacao situacao = Situacao.CONCLUIDO;
		Natureza natureza = Natureza.GRADUACAO;

		for (Element e : lista) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS");

			for (Element es : l) {

				if (XmlUtils.getStringAttribute(es, "NATUREZA").equals("TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO")) {

					ano = XmlUtils.getIntAttribute(es, "ANO");

					Orientacao orientacao = new Orientacao();

					orientacao.setAno(ano);
					orientacao.setNatureza(natureza);
					orientacao.setSituacao(situacao);

					orientacoes.add(orientacao);

				}

			}
		}

		return orientacoes;

	}

	/**
	 * Retorna uma lista de Orientacao de Doutorado Concluida
	 */
	private List<Orientacao> getOrientacaoDoutoradoConcluida(String filePath) {

		List<Orientacao> orientacoes = new ArrayList<Orientacao>();

		List<Element> lista = FactoryXML.getElementoXml(filePath, "ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");
		int ano;
		Situacao situacao = Situacao.CONCLUIDO;
		Natureza natureza = Natureza.DOUTORADO;

		for (Element e : lista) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DE-ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");

			for (Element es : l) {

				ano = XmlUtils.getIntAttribute(es, "ANO");

				Orientacao orientacao = new Orientacao();

				orientacao.setAno(ano);
				orientacao.setNatureza(natureza);
				orientacao.setSituacao(situacao);

				orientacoes.add(orientacao);

			}
		}

		return orientacoes;

	}

	/**
	 * Retorna uma lista de Bancas de Mestrado
	 */
	private List<Banca> getBancasMestrado(String filePath) {

		List<Banca> bancas = new ArrayList<Banca>();
		int ano;
		Natureza natureza = Natureza.MESTRADO;

		List<Element> lista = FactoryXML.getElementoXml(filePath, "PARTICIPACAO-EM-BANCA-DE-MESTRADO");

		for (Element e : lista) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-MESTRADO");

			for (Element es : l) {

				ano = XmlUtils.getIntAttribute(es, "ANO");

				Banca banca = new Banca();

				banca.setAno(ano);
				banca.setNatureza(natureza);

				bancas.add(banca);

			}

		}

		return bancas;

	}

	/**
	 * Retorna uma lista de Bancas de Doutorado
	 */
	private List<Banca> getBancasDoutorado(String filePath) {

		List<Banca> bancas = new ArrayList<Banca>();
		int ano;
		Natureza natureza = Natureza.DOUTORADO;

		List<Element> lista = FactoryXML.getElementoXml(filePath, "PARTICIPACAO-EM-BANCA-DE-DOUTORADO");

		for (Element e : lista) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-DOUTORADO");

			for (Element es : l) {

				ano = XmlUtils.getIntAttribute(es, "ANO");

				Banca banca = new Banca();

				banca.setAno(ano);
				banca.setNatureza(natureza);

				bancas.add(banca);

			}

		}

		return bancas;

	}

	/**
	 * Retorna uma lista de Bancas de Graduacao
	 */
	private List<Banca> getBancasGraduacao(String filePath) {

		List<Banca> bancas = new ArrayList<Banca>();
		int ano;
		Natureza natureza = Natureza.GRADUACAO;

		List<Element> lista = FactoryXML.getElementoXml(filePath, "PARTICIPACAO-EM-BANCA-DE-GRADUACAO");

		for (Element e : lista) {

			List<Element> l = XmlUtils.getElements(e, "DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-GRADUACAO");

			for (Element es : l) {

				ano = XmlUtils.getIntAttribute(es, "ANO");

				Banca banca = new Banca();

				banca.setAno(ano);
				banca.setNatureza(natureza);

				bancas.add(banca);

			}

		}

		return bancas;

	}

	/**
	 * Retorna uma lista de LinhaDePesquisa após alimentar a mesma com os dados
	 * de seus respectivos professores
	 */
	public List<Professor> getProfessor(Element elemento) {

		List<Professor> prfs = new ArrayList<Professor>();
		
		List<Element> l = XmlUtils.getElements(elemento, "professor");
		
		for (Element e : l) {

			Professor prf = new Professor();
			
			prf.setCodigo(XmlUtils.getStringAttribute(e, "codigo"));
			prf.setNome(XmlUtils.getStringAttribute(e, "nome"));
			
			prfs.add(prf);
			
		}

		return prfs;
	}

	/**
	 * Retorna uma lista de LinhaDePesquisa
	 */
	public List<LinhaDePesquisa> getLinhas(String filePath) {

		List<LinhaDePesquisa> ldp = new ArrayList<LinhaDePesquisa>();
		String tagName = "linha";

		List<Element> lines = FactoryXML.getElementoXml(filePath, tagName);
		for (Element es : lines) {

			String nome = XmlUtils.getStringAttribute(es, "nome");
			LinhaDePesquisa linha = new LinhaDePesquisa();
			linha.setNome(nome);
			linha.setProfessores(getProfessor(es));
			ldp.add(linha);

		}
		
		return ldp;

	}

	/**
	 * Retorna uma lista de Qualis com sua qualificação, regex e tipo
	 */
	public List<Qualis> getQualis() {

		List<Qualis> qualis = new ArrayList<Qualis>();
		String tagName = "entry";
		String filePath = "qualis.xml";
		List<Element> entries = FactoryXML.getElementoXml(filePath, tagName);

		for (Element es : entries) {

			String regex = XmlUtils.getStringAttribute(es, "regex");
			String nivel = XmlUtils.getStringAttribute(es, "class");
			String tipo = XmlUtils.getStringAttribute(es, "type");

			Qualis linha = new Qualis();

			linha.setRegex(regex);

			switch (nivel) {
			case "A1":

				linha.setNivel(NivelArtigo.A1);

				break;

			case "A2":

				linha.setNivel(NivelArtigo.A2);

				break;

			case "B1":

				linha.setNivel(NivelArtigo.B1);

				break;

			case "B2":

				linha.setNivel(NivelArtigo.B2);

				break;

			case "B3":

				linha.setNivel(NivelArtigo.B3);

				break;

			case "B4":

				linha.setNivel(NivelArtigo.B4);

				break;

			case "B5":

				linha.setNivel(NivelArtigo.B5);

				break;

			case "C":

				linha.setNivel(NivelArtigo.C);

				break;

			case "NC":
				
				linha.setNivel(NivelArtigo.NC);

				break;

			default:

				break;
			}

			if (tipo.equals("Periódico")) {

				linha.setTipo(TipoArtigo.ARTIGO_REVISTA);

			} else {

				linha.setTipo(TipoArtigo.ARTIGO_CONVENCAO);

			}

			qualis.add(linha);

		}
		return qualis;

	}

}
