package march.twentysec;

public class Reverse {
	public String str;
	
	public Reverse(String str) {
		this.str = str;
	}
	
	public String reverseString(String str) {
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		return str;	
	}

}
