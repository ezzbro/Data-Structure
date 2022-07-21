package demoDS;

public class Excel_Sheet_Col_Number {

	public static void main(String[] args) {
		String str="ADEF";
		int n=str.length();
		int  pow=1;
		int col_num=0;
		for(int i=n-1; i>=0; i--) {
			col_num = col_num + (str.charAt(i)-64)*pow;
	        pow = pow*26;
		}
		System.out.println(col_num);
	}
}
