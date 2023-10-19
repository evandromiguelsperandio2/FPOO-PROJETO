package br.com.apk.model;

public class Informacao {

	protected String nome;
	
	protected double duracao;
	
	protected int totalReproducao;
	
	protected int curtidas;
	
	protected String classificacao;
	
	protected String genero;
	
	protected String totalVisualizacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getTotalReproducao() {
		return totalReproducao;
	}

	public void setTotalReproducao(int totalReproducao) {
		this.totalReproducao = totalReproducao;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTotalVisualizacao() {
		return totalVisualizacao;
	}

	public void setTotalVisualizacao(String totalVisualizacao) {
		this.totalVisualizacao = totalVisualizacao;
	}
	
	
	
	public void imprimeAudio() {
		

		
		System.out.println("Total de Curtidas: " + curtidas);
		
		if (curtidas > 10) {
			System.out.println("Favorita");
		} else {
			System.out.println("Não favorita");
		}
		
		
		if (curtidas == 2000000) {
			curtidas++;
		}
	}
	
}
