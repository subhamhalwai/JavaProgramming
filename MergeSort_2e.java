import java.util.Scanner;

public class MergeSort_2e {

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
		mergeSort(arr,0,n-1);
		System.out.println("Sorted Elements Are :");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void mergeSort(int[] arr, int i, int n) {
		if (i < n) 
		{
			int m = (i+n)/2; 
			mergeSort(arr, i, m); 
			mergeSort(arr , m+1, n); 
			merge(arr, i, m, n); 
		} 
	}

	private static void merge(int[] arr, int i, int m, int n) {
		int n1=m-i+1,n2=n-m,L[]=new int[n1],R[]=new int[n2];
		for (int j = 0; j < n1; j++) {
			L[j]=arr[i+j];
		}
		for (int j = 0; j < n2; j++) {
			R[j]=arr[m+1+j];
		}
		int l=0,j=0,k=i;
		while (l < n1 && j < n2) { 
			if (L[l] <= R[j]) 
			{ 
				arr[k] = L[l]; 
				l++; 
			} 
			else
			{ 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		}
		while (l < n1){ 
			arr[k] = L[l]; 
			l++; 
			k++; 
		}
		while (j < n2){ 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 
	}

}
