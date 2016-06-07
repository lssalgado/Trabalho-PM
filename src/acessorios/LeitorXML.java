package acessorios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import modelo.Professor;

public class LeitorXML {

	private static ArrayList<String> professores = new ArrayList<String>();
	
	
	public static String checaConteudo(String linha) {

		CharSequence pattern = "professor";
		if (linha.contains(pattern)) {
			return capturaCodigoProfessor(linha);
		}
		return "0";

	}

	public static String capturaCodigoProfessor(String linha) {

		String codigo = linha.replaceAll("[\\D]", "");
		professores.add(codigo);
		return codigo;

	}

	public static void baixaProfessores(){
		
		for (int i = 0; i < professores.size(); i++){
			Baixador.baixar("PPGI-UNIRIO", professores.get(i));
		}
		
	}
	
	public static void leArquivo(String arquivo) {
		ArrayList<String> linhas = new ArrayList<String>();
		File contents = new File(arquivo);
		int linhaAtual = 0;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					contents));
			for (String line; (line = bufferedReader.readLine()) != null;) {

				linhas.add(line);
				System.out.println(linhas.get(linhaAtual));
				// System.out.println(linhaAtual);
				System.out.println(checaConteudo(linhas.get(linhaAtual)));

				linhaAtual++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		baixaProfessores();
	}

}
