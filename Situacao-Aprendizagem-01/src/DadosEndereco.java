
public class DadosEndereco {
	private String cep;
	
	private String lagradouro;
	
	private String numero;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if(cep.isEmpty()) {
			System.out.println("DIGITE UM CEP V�LIDO");
		}else {
			if (cep.length()>=3){
				this.cep = cep;
			}else {
				System.out.println("DIGITE UM CEP COM NO MINIMO 3 N�MEROS");
				System.exit(0);
			}
				
		}
	}
		

	public String getLagradouro() {
		return lagradouro;
	}
	
	public void setLagradouro( String lagradouro){
		if(lagradouro.isEmpty()) {
			System.out.println(" O LAGADOURO N�O PODE FICAR VAZIO");
		}else {
			if (lagradouro.length()>=3) {
				this.lagradouro = lagradouro;
			}else {
				System.out.println("TEM QUE TER NO MIN�MO 3 LETRAS");
				System.exit(0);
			}
		}
	}
		 
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if(numero.isEmpty()) {
			System.out.println(" O N�MERO N�O PODE FICAR VAZIO ");
			System.exit(0);
		}
		this.numero=numero;
	}
		
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		if(bairro.isEmpty()) {
			System.out.println(" SEU BAIRRO N�O PODE FICAR VAZIO ");
		}else {
			this.bairro = bairro;
		}
	}

	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if(cidade.isEmpty()) {
			System.out.println("SUA CIDADE N�O PODE FICAR VAZIO");
		}else {
			this.cidade = cidade;
		}
	}
	
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		if(estado.isEmpty()) {
			System.out.println("DIGITE SEU ESTADO");
			System.exit(0);
		}else {
			if (estado.length()==2){
				this.estado = estado;
			}else {
				System.out.println("TEM QUE TER MIN�MO 2 LETRAS ");
				System.exit(0);
			}
				
		}
	}
	}