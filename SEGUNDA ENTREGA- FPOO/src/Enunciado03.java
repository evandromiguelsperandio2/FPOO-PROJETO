
public class Enunciado03 {
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double nota5;
	private double media1;
	private double media2;
	
	   public void CalcularMedia() {
		   if(media1()>= 7) {
			   System.out.println("APROVADO");
		   }
	   }
	   
	   public void CalcularMedia2() {
		   if(media2()>= 7) {
			   System.out.println("APROVADO");
		   }else {
			   System.out.println("REPROVADO");
		   }
	   }
	   public double media1() {
		   media1 = (getnota1()+ getnota2()+ getnota3() + getnota4())/4;
		   return media1;
	   }
	   public double media2() {
		   media2 = (getnota1()+ getnota2()+ getnota3() + getnota4() + getnota5())/5;
		   return media2;
	   }
	   
	   public double getnota1() {
		   return nota1;
	   } 
	   
	   public void setnota1(double Nota1) {
		   nota1 = Nota1;
	   }
	   
	   public double getnota2() {
		   return nota2;
	   } 
	   
	   public void setnota2(double Nota2) {
		   nota2 = Nota2;
	   }
	   
	   public double getnota3() {
		   return nota3;
	   } 
	   
	   public void setnota3(double Nota3) {
		   nota3 = Nota3;
	   }
	   
	   public double getnota4() {
		   return nota4;
	   } 
	   
	   public void setnota4(double Nota4) {
		   nota4 = Nota4;
	   }
	   
	   public double getnota5() {
		   return nota5;
	   } 
	   
	   public void setnota5(double Nota5) {
		   nota5 = Nota5;
	   }

}
