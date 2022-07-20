package staticcontent;

public class staticBlock {
	
	public static void main(String[] args) {
		System.out.println("In main method");
	}
	
	static{
		System.out.println("Static block 1");
	}
	static {
		System.out.println("Static block 2");
	}

}
