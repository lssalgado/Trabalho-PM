package accessories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Essa classe é responsável por fazer o download de todos os arquivos
 * necessários para o programa
 */
public class Baixador {

	/**
	 * Realiza o download do arquivo base do projeto
	 */
	public void downloadProject(String proj) {
		String caminho = "https://s3.amazonaws.com/posgraduacao/" + proj + "/contents.xml";
		String destino = "contents.xml";

		File file = new File("contents.xml");

		if (!file.exists()) {
			try {
				URL website = new URL(caminho);
				ReadableByteChannel rbc = Channels.newChannel(website.openStream());
				FileOutputStream fos = new FileOutputStream(destino);
				fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

			} catch (IOException e) {
				System.err.println("Download do Contents não foi efetuado com sucesso!");
				e.printStackTrace();
			}

		}
	}

	/**
	 * Realiza o download do .zip de um professor
	 */
	public void downloadProfessor(String proj, String codigo) {
		String caminho = "https://s3.amazonaws.com/posgraduacao/" + proj + "/" + codigo + ".zip";
		URL website;
		String destino = codigo + ".zip";
		Descompactador descompactador = new Descompactador();
		File file = new File(destino);

		if (!file.exists()) {

			try {
				website = new URL(caminho);
				ReadableByteChannel rbc = Channels.newChannel(website.openStream());
				FileOutputStream fos = new FileOutputStream(destino);
				fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

			} catch (IOException e) {
				System.err.println("Download do Professor " + codigo + " não foi efetuado com sucesso!");
				e.printStackTrace();
			}
		}
		descompactador.descompactar(destino);

	}

	/**
	 * Realiza o download do arquivo qualis.xml
	 */
	public void downloadQualis() {
		String caminho = "https://s3.amazonaws.com/posgraduacao/qualis.xml";
		URL website;
		String destino = "qualis.xml";

		File file = new File(destino);

		if (!file.exists()) {
			try {
				website = new URL(caminho);
				ReadableByteChannel rbc = Channels.newChannel(website.openStream());
				FileOutputStream fos = new FileOutputStream(destino);
				fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
				// System.out.println("Arquivo baixado para : " +destino);
			} catch (IOException e) {
				System.err.println("Download do Qualis não foi efetuado com sucesso!");
				e.printStackTrace();
			}
		}

	}

	/**
	 * Realiza o download do arquivo com os programas
	 */
	public void downloadPrograma() {

		String caminho = "https://s3.amazonaws.com/posgraduacao/programas.xml";
		URL website;
		String destino = "programas.xml";

		File file = new File(destino);

		if (!file.exists()) {
			try {
				website = new URL(caminho);
				ReadableByteChannel rbc = Channels.newChannel(website.openStream());
				FileOutputStream fos = new FileOutputStream(destino);
				fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
				// System.out.println("Arquivo baixado para : " +destino);
			} catch (IOException e) {
				System.err.println("Download do programa não foi efetuado com sucesso!");
				e.printStackTrace();
			}
		}
	}
}
