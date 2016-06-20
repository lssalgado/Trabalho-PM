package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import accessories.LeitorXML;
import model.Curriculo;

public class Tester {

	LeitorXML leitor = new LeitorXML();
	
	@Test
	public void testaLeitorGetLinhas() {
		
		assertEquals(3, leitor.getLinhas("contents.xml").size());
		assertEquals("Representação de Conhecimento e Raciocínio", leitor.getLinhas("contents.xml").get(0).getNome());
		assertEquals("Distribuição e Redes", leitor.getLinhas("contents.xml").get(1).getNome());
		assertEquals("Sistemas de Apoio a Negócios", leitor.getLinhas("contents.xml").get(2).getNome());
		
	}
	
	@Test
	public void testaLeitorGetQualis(){
		
		assertEquals(3510, leitor.getQualis().size());
		
	}
	
	@Test
	public void testaQualisQualificador(){
		
		assertEquals(true, leitor.getQualis().get(14).qualificador("Workshop de Engenharia de Software baseada em Buscas".toLowerCase()));
		assertEquals(true, leitor.getQualis().get(14).qualificador("Workshop em Engenharia de Software baseada em Buscas".toLowerCase()));
		assertEquals(false, leitor.getQualis().get(14).qualificador("Workshop Engenharia de Software baseada em Buscas".toLowerCase()));
		
	}
	
	@Test
	public void testaLeitorGetProfessor(){
		
		assertEquals("1841338064901299", leitor.getLinhas("contents.xml").get(0).getProfessores().get(0).getCodigo());
		assertEquals("Adriana Cesário de Faria Alvim", leitor.getLinhas("contents.xml").get(0).getProfessores().get(0).getNome());
		
	}
	
	@Test
	public void testaLeitorAlimentaProfessor(){
		
		Curriculo curriculo = new Curriculo();
		
		curriculo.setArtigoPeriodicoA1(0);
		curriculo.setArtigoPeriodicoA2(5);
		curriculo.setArtigoPeriodicoB1(1);
		curriculo.setArtigoPeriodicoB2(0);
		curriculo.setArtigoPeriodicoB3(2);
		curriculo.setArtigoPeriodicoB4(3);
		curriculo.setArtigoPeriodicoB5(2);
		curriculo.setArtigoPeriodicoC(1);
		curriculo.setArtigoPeriodicoNC(0);
		
		curriculo.setArtigoConferenciaA1(2);
		curriculo.setArtigoConferenciaA2(0);
		curriculo.setArtigoConferenciaB1(7);
		curriculo.setArtigoConferenciaB2(8);
		curriculo.setArtigoConferenciaB3(4);
		curriculo.setArtigoConferenciaB4(18);
		curriculo.setArtigoConferenciaB5(2);
		curriculo.setArtigoConferenciaC(0);
		curriculo.setArtigoConferenciaNC(0);
		
		curriculo.setBancasDoutoradoValidas(12);
		curriculo.setBancasMestradoValidas(65);
		curriculo.setBancasGraduacaoValidas(22);
		
		curriculo.setOrientaçoesDoutoradoConcluidasValidas(2);
		curriculo.setOrientaçoesMestradoConcluidasValidas(24);
		curriculo.setOrientaçoesProjetoFinalConcluidasValidas(7);
		
		curriculo.setOrientaçoesDoutoradoAndamentoValidas(4);
		curriculo.setOrientaçoesMestradoAndamentoValidas(12);
		curriculo.setOrientaçoesProjetoFinalAndamentoValidas(1);
		
		Curriculo crcl = leitor.alimentaProfessor("curriculos/2562652838103607.xml", leitor.getQualis(), "Sean Wolfgand Matsui Siqueira");
		crcl.filtroDeArtigos(0, 2020);			
		
		assertEquals(curriculo.getConteudo(0, 2020), crcl.getConteudo(0, 2020));
		
	}

}
