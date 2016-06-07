package acessorios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Descompactador {

	final static int BUFFER = 2048;

	public static void descompactar(String arquivo) {
		
		FileInputStream zipinho;
		try {
			String destino = null;
			BufferedOutputStream dest = null;
			zipinho = new FileInputStream(arquivo);
			ZipInputStream zipOrigem = new ZipInputStream(
					new BufferedInputStream(zipinho));
			ZipEntry entry;
			while ((entry = zipOrigem.getNextEntry()) != null) {
				int count;
				byte data[] = new byte[BUFFER];
				// write the files to the disk
				destino = "curriculos/" + arquivo.substring(0, (arquivo.length() - 4)) + "-" + entry.getName();
				FileOutputStream fos = new FileOutputStream(destino);
				dest = new BufferedOutputStream(fos, BUFFER);
				while ((count = zipOrigem.read(data, 0, BUFFER)) != -1) {
					dest.write(data, 0, count);
				}
				dest.flush();
				dest.close();
			}
			zipOrigem.close();
			System.out.println("Conteúdo descompactado para : " +destino);
//			LeitorXML.leArquivo(destino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
