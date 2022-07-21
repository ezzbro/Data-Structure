package demoDS;

public class Length_of_LastWord {
	
	public static void main(String[] args) {
		String a="tyty    e";
		
		int b=lengthOfLastWord(a);
		System.out.println(b);
	}

	private static int lengthOfLastWord(String a) {
		
		int count=0, i=0;
		int s=a.length();
		while(i<s) {
			if(a.charAt(i)!= ' ') {  // not contains space 
				count++;
				i++;
			}
			else
			{
				while(i<s && a.charAt(i)== ' ')// contains space 
					i++;
				if(i==s)
					return count;
				else
					count=0;
				}
			}
		
		return count;
	}

}
