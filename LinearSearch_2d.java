import java.util.Scanner;

public class LinearSearch_2d 
{ 

	private int search(int arr[], int n, int x) 
    { 
        for (int i = 0; i < n; i++) 
        { 
            if (arr[i] == x) 
                return i; 
        }
        return -1; 
    }
	public static void main(String[] args) {
		LinearSearch_2d ref=new LinearSearch_2d();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you wanna to enter :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements :");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the  elements you wanna to search :");
		int search=sc.nextInt();
		int ele=ref.search(arr, n, search);
		if(ele==-1)
			System.out.println("Element is not found");
		else
			System.out.println("Element is in "+(ele+1 )+" index");
		sc.close();
	}
}  
