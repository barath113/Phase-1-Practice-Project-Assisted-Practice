package Innerclasses;

abstract class Anonymousinnerclass {
		   public abstract void display();
		}

public class InnerClass3 {
		public static void main(String[] args) {
			Anonymousinnerclass i = new Anonymousinnerclass() {

			         public void display() {
			            System.out.println("Anonymous Inner Class");
			         }
			      };
			      i.display();
			   }

}
