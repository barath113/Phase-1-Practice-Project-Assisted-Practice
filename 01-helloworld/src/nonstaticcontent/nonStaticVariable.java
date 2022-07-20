package nonstaticcontent;

public class nonStaticVariable {
	int num;
	{
		System.out.println("In non-static method");
	}
	nonStaticVariable(){
		System.out.println("In constructor method");
	}

	public static void main(String[] args) {
		System.out.println("In main method");
		nonStaticVariable nv=new nonStaticVariable();
		System.out.println(nv.num);
	}
}
