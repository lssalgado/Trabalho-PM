package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qualis {

	private String regex;
	private TipoArtigo tipo;
	private NivelArtigo nivel;
	
	/**
	 * Checa se uma String contém a regex esperada
	 */
	public boolean qualificador(String titulo){
		
		if (titulo.matches(".*" + regex.toLowerCase() + ".*")){

			return true;
			
		}
		return false;
		
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public TipoArtigo getTipo() {
		return tipo;
	}

	public void setTipo(TipoArtigo tipo) {
		this.tipo = tipo;
	}

	public NivelArtigo getNivel() {
		return nivel;
	}

	public void setNivel(NivelArtigo nivel) {
		this.nivel = nivel;
	}

}
