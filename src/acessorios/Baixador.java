package acessorios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Baixador {


	public static void baixar(String proj) {
		String caminho = "https://s3.amazonaws.com/posgraduacao/" + proj
				+ "/contents.xml";
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
	
	public static void baixar(String proj, String codigo) {
		String caminho = "https://s3.amazonaws.com/posgraduacao/" + proj + "/" + codigo +".zip";
		URL website;
		String destino = codigo + ".zip";
		try {
			website = new URL(caminho);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(destino);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			System.out.println("Arquivo baixado para : " +destino);
			Descompactador.descompactar(destino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
