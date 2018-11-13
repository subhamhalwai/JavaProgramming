import java.util.Scanner;

public class Common_2c {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you wanna to enter in first array:");
		int n1=sc.nextInt();
		System.out.println("Enter the number of elements you wanna to enter in second array:");
		int n2=sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		System.out.println("Enter the elements in first array:");
		for (int i = 0; i < n1; i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements in Second array:");
		for (int i = 0; i < n2; i++) {
			arr2[i]=sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				if(arr1[i]==arr2[j])
					System.out.println("Common Element : "+arr1[i]+" 1st Array index : "+(i+1)+" 2nd Array index : "+(j+1));
			}
		}
	}

}
