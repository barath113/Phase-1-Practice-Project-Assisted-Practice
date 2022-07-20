public class Strings {
	
	public static void main(String[] args){		
		System.out.println("Methods of Strings");
		
		String sl=new String("Hello Developer");		
		System.out.println(sl.length());
		
		String sub=new String("Welcome Back");		
		System.out.println(sub.substring(2));
		
		String s1="Hello";
		String s2="Hai";
		System.out.println(s1.compareTo(s2));
		
		String s4="";
		System.out.println(s4.isEmpty());
		
		String s5="Hai Kumar";
		System.out.println(s1.toLowerCase());
		
		String s6="Hello Ramya";	
		String replace=s2.replace('d', 'l');
		System.out.println(replace);
		
		String x="Welcome to Eclipse";
		String y="WeLcOmE tO EcLipse";
		System.out.println(x.equals(y));
		
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		
		StringBuffer s=new StringBuffer("Welcome to Eclipse!");		
		s.append("Enjoy your elearning");		
		System.out.println(s);
		
		s.insert(0, 'w');
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Hello");		
		sb.replace(0, 2, "hEl");
		System.out.println(sb);
		
		sb.delete(0, 1);
		System.out.println(sb);						
		
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("ELearning");
		System.out.println(sb1);
		
		System.out.println(sb1.delete(0, 1));
		
		System.out.println(sb1.insert(1, "Welcome to Eclipse"));
		
		System.out.println(sb1.reverse());
		
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");				
		
		String str = "Hello Barath";
		
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("worldwide");
		System.out.println("String to StringBuilder");
		System.out.println(sbl);
	}
}