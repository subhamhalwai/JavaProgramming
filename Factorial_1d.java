import java.util.Scanner;

public class Factorial_1d {

	public static void main(String[] args) {
		Factorial_1d ref=new Factorial_1d();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to calculate its factorial");
		int num=sc.nextInt();
		System.out.println("Enter 1.Fact using Recursion\n      2.Fact with other logic");
		int n=sc.nextInt(),res;
		sc.close();
		while(true)
		{
			if(n==1)
			{
				res=ref.factUsingRec(num);
				break;
			}
			else if(n==2)
			{
				res=ref.fact(num);
				break;
			}
			else 
			{
				System.out.println("Invalid Input!!!\nEnter 1.Fact using Recursion\n      2.Fact with other logic");
				n=sc.nextInt();
			}
		}
		System.out.println("Factorial of a number "+num+"! is "+res);
	}

	private int fact(int num) {
		int f=1;
		while (num!=1) {
			f*=num--;
		}
		return f;
	}

	private int factUsingRec(int num) {
		if(num<2)
			return 1;
		return num*fact(--num);
	}

}
