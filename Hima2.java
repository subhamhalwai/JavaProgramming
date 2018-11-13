public class Hima2 {

	public static void main(String[] args) {
		int arr[]= {1,5,2,9,4,3},total=1;
		for (int i = 0; i < arr.length; i++) {
			total*=arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" "+(total/arr[i]));
		}
	}
}
