import java.util.Scanner;

public class Missing_2b {

	public static void main(String[] args) {
		Missing_2b ref=new Missing_2b();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you wanna to enter :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements :");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		arr=ref.sort(arr);
		//System.out.print(arr[0]+" ");
		System.out.println("Missing Numbers Are : ");
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]-arr[i-1]!=1)
			{
				int temp=++arr[i-1];
				while(temp<arr[i])
				{
					System.out.print((temp++)+" ");
				}
			}
			//System.out.print(arr[i]+" ");
		}
	}

	private int[] sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
