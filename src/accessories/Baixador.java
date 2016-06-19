package accessories;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Essa classe é responsável por fazer o download de todos os arquivos
 * necessários para o programa
 * 
 * @author Lucas
 */
public class Baixador {

	/**
	 * Realiza o download do arquivo base do projeto
	 * 
	 * @param proj
	 *            Nome do projeto a ser baixado
	 */
	public static void downloadProject(String proj) {
		String caminho = "https://s3.amazonaws.com/posgraduacao/" + proj + "/contents.xml";
		String destino = "contents.xml";
		try {
			URL website = new URL(caminho);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(destino);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			// System.out.println("Arquivo baixado para : " +destino);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Realiza o download do .zip do professor passado
	 * 
	 * @param proj
	 *            Nome do projeto referente ao professor
	 * @param codigo
	 *            Codigo indentificador do professor
	 */
	public static void downloadProfessor(String proj, String codigo) {
		String caminho = "https://s3.amazonaws.com/posgraduacao/" + proj + "/" + codigo + ".zip";
		URL website;
		String destino = codigo + ".zip";
		try {
			website = new URL(caminho);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(destino);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			// System.out.println("Arquivo baixado para : " +destino);
			Descompactador.descompactar(destino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Realiza o download do arquivo qualis.xml
	 */
	public static void downloadQualis() {
		String caminho = "https://s3.amazonaws.com/posgraduacao/qualis.xml";
		URL website;
		String destino = "qualis.xml";
		try {
			website = new URL(caminho);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(destino);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			// System.out.println("Arquivo baixado para : " +destino);
			Descompactador.descompactar(destino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void downloadPrograma(){
		
		String caminho = "https://s3.amazonaws.com/posgraduacao/programas.xml";
		URL website;
		String destino = "programas.xml";
		try {
			website = new URL(caminho);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(destino);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			// System.out.println("Arquivo baixado para : " +destino);
			Descompactador.descompactar(destino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
