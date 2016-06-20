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
import model.Programa;

public class Escritor {

	public void escreveArquivo(Programa prog, int anoInicial, int anoFinal) {

		String programa = prog.getNome();

		try {
			Writer escritor = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(programa + ".txt"), "utf-8"));
			String breakLine = System.getProperty("line.separator");

			escritor.write(
					"Nome\tA1\tA2\tB1\tB2\tB3\tB4\tB5\tC\tNC\tA1\tA2\tB1\tB2\tB3\tB4\tB5\tC\tNC\tBancaD\tBancaM\tBancaG\tOCD\tOCM\tOCG\tOAD\tOAM\tOAG"
							+ breakLine);

			List<LinhaDePesquisa> linhasDePesquisa = prog.getLinhas();

			for (LinhaDePesquisa ldp : linhasDePesquisa) {

				List<Professor> professores = ldp.getProfessores();

				for (Professor prf : professores) {

					escritor.write(
							prf.getNome() + "\t" + prf.getCurriculo().getConteudo(anoInicial, anoFinal) + breakLine);

				}

				ldp.somaCurriculos();
				escritor.write("Total da Linha de Pesquisa" + ldp.getConteudo() + "\t" + breakLine);

			}
			prog.setCurriculo();
			escritor.write(
					"Total do Programa " + programa + "\t" + prog.getCurriculo().getConteudo(anoInicial, anoFinal));
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
