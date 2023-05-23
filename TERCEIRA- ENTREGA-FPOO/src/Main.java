import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		
		Triangulos objTriangulo = new Triangulos();
		
		System.out.println("INFORME O TAMANHO DO LADO 1:");
		objTriangulo.setN1(objScanner.nextInt());
		
		System.out.println("INFORME O TAMANHO DO LADO 2:");
		objTriangulo.setN2(objScanner.nextInt());
		
		System.out.println("INFORME O TAMANHO DO LADO 3:");
		objTriangulo.setN3(objScanner.nextInt());
		
		objTriangulo.TriangulosCalcular();
		
		
	}

}
