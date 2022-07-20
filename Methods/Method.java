package Methods;

public class Method {
	
	public void Print() {
		System.out.println("Method without return type and without parameter");
	}
	
	public void Display(String name) {
		
		System.out.println("My name is "+name);
	}
	
	public int Multiplication(int n) {
		
		return n*n;
	}

	public String fullName(String firstname, String lastname) {
		return firstname+" "+lastname;
	}	
	
	public static void main(String[] args) {
		Method m=new Method();
		m.Print();
		m.Display("Kumar");
		
		int num=35;
		System.out.println("The multiplication value is: "+m.Multiplication(num));
		
		String FirstName="Barath";
		String LastName="Kumar";
		
		System.out.println("My Full Name is "+m.fullName(FirstName, LastName));
		
	}

}