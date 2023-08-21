class Even_fib_summation 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c=0,sum=0;
              // Summation of even fibnocci numbers 
		for (int i=1;i<=15 ; i++)
		{
			
			if (c%2==0)
			{
		           sum+=c; 
			   System.out.println("the even fib numbers are:"+c);
			}
			a=b;
			b=c;
			c=a+b;
		}
	         System.out.println("the sum of even fib:"+sum);
	}
}
