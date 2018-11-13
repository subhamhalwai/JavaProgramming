import java.util.Scanner;

public class Merge_2e {

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
		int arrMerge[]=new int[n1+n2];
		int k=0;
		for (int i = 0; i < n1; i++) {
			arrMerge[k++]=arr1[i];
		}
		for (int i = 0; i < n2; i++) {
			arrMerge[k++]=arr2[i];
		}
		System.out.println("Elements in 3rd Array is : ");
		for (int i = 0; i < arrMerge.length; i++) {
			System.out.print(arrMerge[i]+" ");
		}
	}

}
