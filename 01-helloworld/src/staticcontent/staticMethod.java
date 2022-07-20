package staticcontent;

public class staticMethod {
	public static void main(String[] args) {
		System.out.println("In main method");
		staticMethod.method1();
	}

	static void method1(){
		System.out.println("In static method");
	}
	static {
		System.out.println("In static block");
	}
}
