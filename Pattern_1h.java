import java.util.Scanner;

public class Pattern_1h {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines  you wanna to print :");
		int n=sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
