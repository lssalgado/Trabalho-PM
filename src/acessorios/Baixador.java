package acessorios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Baixador {


	public static void baixar() {
		String projeto = "PPGI-UNIRIO";
		String professor = "1841338064901299";
		String caminho = "https://s3.amazonaws.com/posgraduacao/" + projeto
				+ "/contents.xml";
//		String caminhoprofessor = "https://s3.amazonaws.com/posgraduacao/" + projeto + "/" + professor +".zip";
		URL website;
		String destino = "1.xml";
		try {
			website = new URL(caminho);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(destino);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			System.out.println("Arquivo baixado para : " +destino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
