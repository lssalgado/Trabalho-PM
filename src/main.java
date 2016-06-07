import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static String capturaCodigoProfessor(String linha) {
		
		String codigo = linha.replaceAll("[\\D]", "");
		
		return codigo;

	}

	public static String checaConteudo(String linha) {

		CharSequence pattern = "professor";
		if (linha.contains(pattern)){
			return capturaCodigoProfessor(linha);
		}
		return "0";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Baixador.baixar();
		// Descompactador.descompactar();

		// String[] linhas = null;
		ArrayList<String> linhas = new ArrayList<String>();
		File contents = new File("1.xml");
		int linhaAtual = 0;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					contents));
			for (String line; (line = bufferedReader.readLine()) != null;) {

				linhas.add(line);
				System.out.println(linhas.get(linhaAtual));
//				System.out.println(linhaAtual);
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
		
		

	}

}
