import java.util.Scanner;

public class Swap2Ele_2f {

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
		outerFor:
			for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					break outerFor;
				}
			}
		}
		System.out.println("Final Elements:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
