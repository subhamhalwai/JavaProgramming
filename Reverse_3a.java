public class Reverse_3a {

	public static void main(String[] args) {
		String s="Hello",rev="";
		for (int i = s.length()-1; i >-1 ; i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
	}

}
