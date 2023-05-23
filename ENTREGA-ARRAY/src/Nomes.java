import java.util.Scanner;

public class Nomes {
       
	String[] nomes = new String [10];
	Scanner objScanner = new Scanner(System.in);
	
	public void GuardarNomes() {
		
		for(int indice = 0; indice < nomes.length; indice++ ) {
			
          System.out.println(" DIGITE O NOMES " + (indice + 1 ));
          	nomes[indice] = objScanner.next();
		
		}
		
		System.out.println("LISTAGEM DE NOME: ");
		
		int indice = 0;
		while(indice <nomes.length) {
			System.out.println((indice + 1) + "º NOME: " + nomes[indice]);
			indice++;
		
		}
		
		
		
			
		
		
		
	}
}
