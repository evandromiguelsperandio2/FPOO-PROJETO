
public class DadosPessoais {

	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String genero;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
		if(nome.isEmpty()) {
			System.out.println("NOME É OBRIGATORIO");
			System.exit(0);
		}
		int tamanho = nome.length();
		if(tamanho < 3) {
			System.out.println("MINIMO DE TRÊS CARACTERES");
			System.exit(0);
		}else {
			this.nome = nome;
		}
		
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		
		if(sobrenome.isEmpty()) {
			System.out.println("SOBRENOME É OBRIGATORIO");
			System.exit(0);
		}
		int tamanho = sobrenome.length();
		if(tamanho < 3) {
			System.out.println("MINIMO DE TRÊS CARACTERES");
			System.exit(0);
		}else {
			this.sobrenome = sobrenome;
		}
		
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.isEmpty()) {
			System.out.println("DATA DE NASCIMENTO É OBRIGATORIO");
			System.exit(0);
		}else {
			if(dataNascimento.length()==10) {
				this.dataNascimento = dataNascimento;
			}else {
				System.out.println("MINIMO DE DEZ CARACTERES");	
				System.exit(0);
		
			}
		}
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		if(dataNascimento.isEmpty()) {
			System.out.println("DATA DE NASCIMENTO É OBRIGATORIO");	
			System.exit(0);
		}else {
			if(genero.equalsIgnoreCase("feminino")) {
				this.genero = genero;
			}else {
				if(genero.equalsIgnoreCase("masculino")) {
					this.genero = genero;
				}else {
					if(genero.equalsIgnoreCase("outros")) {
						this.genero = genero;
					}else {
						System.out.println("APENAS MASCULINO, FEMININO E OUTROS");
						System.exit(0);
					}
				}
			}
		}
	}
	

	}
