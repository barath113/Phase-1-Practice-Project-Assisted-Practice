package nonstaticcontent;

public class NonStaticVariableint {
	int num;
	{
		System.out.println("In non-static method");
	}
	NonStaticVariableint(int n){
		System.out.println("In constructor method");
		this.num=n;
	}

	public static void main(String[] args) {
		System.out.println("In main method");
		NonStaticVariableint nv=new NonStaticVariableint(20);
		System.out.println(nv.num);
	}
}
