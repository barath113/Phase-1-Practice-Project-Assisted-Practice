package Methods;

public class CallByValue {
		
		int value=15;

		void operation(int num) {
			this.value=num*10/100;
		}
		
		public static void main(String[] args) {
			
			CallByValue cv= new CallByValue();
			
			System.out.println("The Value before function call: "+cv.value);
			
			cv.operation(75);
			System.out.println("The Value after function call: "+cv.value);
		}
}
