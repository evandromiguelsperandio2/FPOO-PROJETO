import java.util.Scanner; 
public class Temperatura {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		double celcius, fahrenheit;
		
		System.out.println("DIGITE A TEMPERATURA EM GRAUS CELCIUS");
		celcius = scanner.nextDouble();
		fahrenheit = (celcius*1.8+32);
		
		System.out.println("RESULTADO EM FAHRENHEIT         "  + fahrenheit);
		
	
	
	
	
	
	
	}
	
	
	

}

