package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import accessories.LeitorXML;
import model.Curriculo;
import model.Qualis;

public class Tester {

	LeitorXML leitor = new LeitorXML();
	
	@Test
	public void testaLeitorGetLinhas() {
		
		assertEquals(3, leitor.getLinhas("contents.xml").size());
		
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
		
		Curriculo curriculo = new Curriculo();
		
		assertEquals("1841338064901299", leitor.getLinhas("contents.xml").get(0).getProfessores().get(0).getCodigo());
		assertEquals("Adriana Cesário de Faria Alvim", leitor.getLinhas("contents.xml").get(0).getProfessores().get(0).getNome());
		assertEquals(curriculo, leitor.getLinhas("contents.xml").get(0).getProfessores().get(0).getCurriculo());
		
	}

}
