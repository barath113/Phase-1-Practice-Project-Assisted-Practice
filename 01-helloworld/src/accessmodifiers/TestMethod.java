package accessmodifiers;

public class TestMethod {

	public static void main(String [] args) {
		
		AccessModifier am= new  AccessModifier();
				
				am.DefaultMethod();
				//obj.PrivateMethod(); private method we can't access out side of class
				am.ProtectedMethod();
				am.PublicMethod();
			}

}
