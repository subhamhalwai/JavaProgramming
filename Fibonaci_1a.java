import java.util.Scanner;
class Fibonaci_1a
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Fibonaci number you wanna to see:");
		int  n=sc.nextInt(),a=0,b=1,sum;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n-2;i++)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		
	}
}