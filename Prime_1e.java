import java.util.Scanner;

public class Prime_1e {

	public static void main(String[] args) {
		System.out.println("Enter a number to check prime or not :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		boolean status=true;
		for (int i = 2; i <= num/2; i++) {
			if(num%i==0)
				{
					status=false;
					break;
				}
		}
		if(status)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}

}
