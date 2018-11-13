import java.util.Scanner;

public class Largest_2a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you wanna to enter :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements :");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int max=arr[0];
		for (int i = 1; i < n; i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("The Largest Number in this array is "+max);
	}

}
