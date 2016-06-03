package acessorios;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import org.apache.commons.io.FileUtils;

public class Baixador {

	/**
	 * @param args
	 */
	public static void baixar(){
		// TODO Auto-generated method stub

		File destino = new File("1.xml");
		try {
			URL link = new URL(
					"https://s3.amazonaws.com/posgraduacao/programas.xml");
			FileUtils.copyURLToFile(link, destino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String source = "1.zip";
		String destination = "pasta";
		String password = "password";

		try {
			ZipFile zipFile = new ZipFile(source);
			if (zipFile.isEncrypted()) {
				zipFile.setPassword(password);
			}
			zipFile.extractAll(destination);
		} catch (ZipException e) {
			e.printStackTrace();
		}
	}

}
