package Methods;

public class MethodOverloading {

	int multiply(int a, int b) {
		return a*b;
	}
	int multiply(int a, int b,int c) {
		return a*b*c;
	}
	float multiply(float a, float b) {
		return a*b;
	}
	
	double multiply(double a, double b) {
		return a*b;
	}
	
	 
	
	public static void main(String[] args) {
		MethodOverloading mo= new MethodOverloading();
		System.out.println("Multiplication of 23 and 4 : "+mo.multiply(23, 4));
		System.out.println("Multiplication of 23.0 and 9.78 : "+mo.multiply(23.0f,9.78f));
		System.out.println("Multiplication of 2 double : "+mo.multiply(2.3, 6.7));
		System.out.println("Multiplication of 3 int : "+mo.multiply(4, 6, 9));
		
	}
}
