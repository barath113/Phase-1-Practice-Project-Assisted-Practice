package Chaining;

public class Child extends Parent {

	Child(){
		System.out.println("Child constructor: No Arg");
	}
	Child(int x){
		//Super(x);
		System.out.println("Child constructor: One Arg");
	}
}
