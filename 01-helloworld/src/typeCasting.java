public class typeCasting {
	
	public static void main(String[] args) {
		System.out.println("Implicit type casting");
		System.out.println("Byte to other type");
		byte a=12;
		short b=a;
		int c=a;
		long d=a;
		float e=a;
		double f=a;
		
		System.out.println("byte value : "+a);
	    System.out.println("short value : "+b);
	    System.out.println("int value : "+c);
	    System.out.println("long value : "+d);
	    System.out.println("float value : "+e);
	    System.out.println("double value : "+f);
	    
	    System.out.println("int to other type");
		int g=31;
		long h=g;
		float i=g;
		double j=g;
		
		System.out.println("int value : "+g);
		System.out.println("long value : "+h);
	    System.out.println("float value : "+i);
	    System.out.println("double value : "+j);
	    
	    System.out.println("---------------------");
	    System.out.println("Explicit type casting");
		double k=412.5;
		float l=(float)k;
		long m=(long)k;
		int n=(int)k;
		short o=(short)k;
		byte p=(byte)k;
		
		System.out.println("double value : "+k);
		System.out.println("float value : "+l);
		System.out.println("long value : "+m);
		System.out.println("int value : "+n);
		System.out.println("short value : "+o);
		System.out.println("byte value : "+p);
	}

}
