public class helloworld {
	public static void main(String[] args)
	{
		System.out.println("Hello");
		
		String input1="12";
		int in=Integer.parseInt(input1);
		System.out.println(in);
		
		byte b=Byte.parseByte(input1);
		System.out.println(b);
		
		
		//print even numbers between
		for(int i=22;i<=98;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		for(int i=0;i<=100;i++)
		{
			if((i%3==0)&&(i%5==0))
			{
				System.out.println(i);
			}
		}
		
	}

}
