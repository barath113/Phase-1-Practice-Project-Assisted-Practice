import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		double number1,number2;
		char operator;
		double result=0;
		Scanner user_input=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		number1=user_input.nextDouble();
		System.out.println("Enter second number: ");
		number2=user_input.nextDouble();
		
		System.out.println("Enter an operator to perform calculation: + , - , * , / , % ");
		operator=user_input.next().charAt(0);
		
		if(operator=='+')
		{
			result=number1+number2;
			System.out.println(number1 +" "+ operator +" "+number2+" = "+result);
		}
		else if(operator=='-')
		{
			result=number1-number2;
			System.out.println(number1 +" "+ operator +" "+number2+" = "+result);
		}
		else if(operator=='*')
		{
			result=number1*number2;
			System.out.println(number1 +" "+ operator +" "+number2+" = "+result);
		}
		else if(operator=='/')
		{
			result=number1/number2;
			System.out.println(number1 +" "+ operator +" "+number2+" = "+result);
		}
		else if(operator=='%')
		{
			result=number1%number2;
			System.out.println(number1 +" "+ operator +" "+number2+" = "+result);
		}
		else
		{
			System.out.println("It is an Invalid operator");
		}
	user_input.close();
	}		
}
