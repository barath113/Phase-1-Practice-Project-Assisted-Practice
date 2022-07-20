package accessmodifiers;

public class AccessModifier {
	
	public void DefaultMethod() {
		System.out.println("Inside Default Method");
		}
		public void PublicMethod() {
		System.out.println("Inside Public Method");
		}
		public void PrivateMethod() {
		System.out.println("Inside Private Method");
		}
		public void ProtectedMethod() {
		System.out.println("Inside Protected Method");
		}
		public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		am.PublicMethod();
		am.PrivateMethod();
		am.DefaultMethod();
		am.ProtectedMethod();
		}

}

