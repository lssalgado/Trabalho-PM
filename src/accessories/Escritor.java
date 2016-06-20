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

	public void escreveArquivo(List<LinhaDePesquisa> linhaDePesquisa,
			String programa, int anoInicial, int anoFinal) {

		try {
			Writer escritor = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(programa + ".txt"), "utf-8"));
			String breakLine = System.getProperty("line.separator");
			for (LinhaDePesquisa ldp : linhaDePesquisa) {

				List<Professor> professores = ldp.getProfessores();

				for (Professor prf : professores) {
					
					escritor.write(prf.getNome() + "\t" + prf.getCurriculo().getConteudo(anoInicial, anoFinal) + breakLine);

				}

				ldp.somaCurriculos();
				escritor.write("Total da Linha de Pesquisa " + ldp.getConteudo() + "\t" + breakLine);
				

			}
			escritor.write("Total do Programa " + programa);
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
