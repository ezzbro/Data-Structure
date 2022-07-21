package palindrome;

public class palindrome_check_by_deleting_atleast_oneCharacter {

	public static void main(String[] args) {

		String str="abyb";
		if(palindrome(str))
			System.out.println("can be palindrome");
		else
			System.out.println("can't be palindrome");
	}

	private static boolean palindrome(String str) {
		int s=0;
		int e=str.length()-1;
		
		while(s<=e) {
			if(str.charAt(s) != str.charAt(e)) {
				if(twoCaseCheck(str, s+1, e) || twoCaseCheck(str,s, e-1))
					return true;
				else
					return false;
			}
			s++;
			e--;
		}
		return true;
	}

	private static boolean twoCaseCheck(String str, int s, int e) {
		while(s<=e) {
			if(str.charAt(s) != str.charAt(e)) 
				return false;
			s++;
			e--;
		}
		return true;
	}

}
