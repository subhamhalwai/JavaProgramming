import java.util.Scanner;

public class Swap_1c {
	int num1,num2;
	public static void main(String[] args) {
		Swap_1c ref=new Swap_1c();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two number to swap :");
		ref.num1=sc.nextInt();
		ref.num2=sc.nextInt();
		System.out.println("Enter 1.Swap using 3rd Variable\n      2.Swap without using 3rd Variable");
		int n=sc.nextInt();
		while(true)
		{
			if(n==1)
			{
				ref.swapUsingVar(ref);
				break;
			}
			else if(n==2)
			{
				ref.swapWithoutUsingVar(ref);
				break;
			}
			else 
			{
				System.out.println("Invalid Input!!!\nEnter 1.Swap using 3rd Variable\n      2.Swap without using 3rd Variable");
				n=sc.nextInt();
				sc.close();
			}
		}
		System.out.println("After Swaping Number_1= "+ref.num1+" and Number_2= "+ref.num2);
	}
	private void swapWithoutUsingVar(Swap_1c ref) {
		ref.num1+=ref.num2;
		ref.num2=ref.num1-ref.num2;
		ref.num1-=ref.num2;
	}
	private void swapUsingVar(Swap_1c ref) {
		int temp=ref.num1;
		ref.num1=ref.num2;
		ref.num2=temp;
	}

}
