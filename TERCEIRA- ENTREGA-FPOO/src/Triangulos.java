
public class Triangulos {

	int n1;
	int n2;
	int n3;
	

	 public void TriangulosCalcular() {
		if ((getN1() == getN2()) && (getN1() == getN3()) && (getN2() == getN3())) {
			System.out.println("ESSA FORMA É UM TRIÂNGULO EQUILÁTERO");
		}

 		if ((getN1() == getN2()) && (getN2() != getN3())) {
 			System.out.println("ESSA FORMA É UM TRIÂNGULO ISÓSCELES");
 		}
 
 		if ((getN1() != getN2()) && (getN1() != getN3()) && (getN2() != getN3())) {
 			System.out.println("ESSA FORMA É UM TRIÂNGULO ESCALENO");
 		}
 	}
 	
     public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

}
