 import java.util.Scanner;
    public class Temperatura {
    
    	public static void main(String[] args) {
    		
    		Scanner scanner = new Scanner(System.in);
    		double fahrenheit,celsius;
    		
    		System.out.println(" DIGITE A TEMPERATURA EM FAHRENHEIT");
    		fahrenheit = scanner.nextDouble();
    		celsius = (fahrenheit - 32)/1.8;
    		
    		System.out.println(" RESULTADO EM CELSIUS    " + celsius );
    		
    	}
}