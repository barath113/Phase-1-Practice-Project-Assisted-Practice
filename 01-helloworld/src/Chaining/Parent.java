package Chaining;

public class Parent {

	int x;
	Parent(){
		//this(5);
		System.out.println("Parent constructor: No Arg");
	}
	Parent(int x){
		this.x=x;
		System.out.println("Parent constructor: One Arg");
	}
}

