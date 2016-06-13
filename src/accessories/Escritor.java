package accessories;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

import model.LinhaDePesquisa;
import model.Professor;

public class Escritor {

	public static void escreveArquivo(List<LinhaDePesquisa> linhaDePesquisa,
			String programa) {

		try {
			Writer escritor = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(programa + ".txt"), "utf-8"));

			for (LinhaDePesquisa ldp : linhaDePesquisa) {

				List<Professor> professores = ldp.getProfessores();

				for (Professor prf : professores) {

					escritor.write(prf.getNome() + "	" + prf.getCodigo() + "\n");
					System.out.println(prf.getNome() + "	" + prf.getCodigo());

				}

				escritor.write(ldp.getNome() + "\n");

			}

			escritor.close();
		} catch (UnsupportedEncodingException e) {
			System.err.println("The character encoding is not supported.");
		} catch (FileNotFoundException e) {
			System.err.println("The file was not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
