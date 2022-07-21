package palindrome;

public class Palindrome_string {

	public static void main(String[] args) {

		String str="Ac&5F*&*5CA";
		if(palindrome(str)) 
			System.out.println(" palindrome");
		else
			System.out.println(" not palindrome");
	}

	private static boolean palindrome(String str) {
		int s=0;
		int e=str.length()-1;
		while(s<=e) {
			
			while(!Character.isLetterOrDigit(str.charAt(s)))    s++;
			while(!Character.isLetterOrDigit(str.charAt(e)))    e--;
			
			if(str.toUpperCase().charAt(s)!= str.toUpperCase().charAt(e)) return false;
			s++;
			e--;
		}
		return true;		
	}

}
