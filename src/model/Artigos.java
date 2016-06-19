package model;

public class Artigos {

	private TipoArtigo tipoArtigo;
	private NivelArtigo nivelArtigo;
	private int ano;
	private String veiculo;
	private String titulo;
	private Situacao situacao;

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public TipoArtigo getTipoArtigo() {
		return tipoArtigo;
	}

	public void setTipoArtigo(TipoArtigo tipoArquivo) {
		this.tipoArtigo = tipoArquivo;
	}

	public NivelArtigo getNivelArtigo() {
		return nivelArtigo;
	}

	public void setNivelArtigo(NivelArtigo nivelArtigo) {
		this.nivelArtigo = nivelArtigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
