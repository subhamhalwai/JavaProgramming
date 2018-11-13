import java.util.Scanner;

public class ArmStrong_1f {

	public static void main(String[] args) {
		System.out.println("Enter a number to check ArmStrong or not :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int res=0,n=num;
		while (n!=0) {
			res+=Math.pow(n%10, 3);
			n/=10;
		}
		if(res==num)
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not a ArmStrong Number");
	}

}

