package chap04_controlStatement;

public class _05_ifStatementAndIfEarlyReturn {

	public static void main(String[] args) {
		//1-1. if문
		int lunchPrice = 10000;
		if (lunchPrice >= 10000) {
			System.out.println("너무 비싸다");
		} else if (lunchPrice >= 8000) {
			System.out.println("조금 비싸다");
		} else if (lunchPrice >= 6000) {
			System.out.println("적정하다");
		} else {
			System.out.println("싼 편이다");
		}
		
		//1-2. if Early Return
		String str = getFeeling(lunchPrice);
		System.out.println(str);
	}
	
	public static String getFeeling(int price) {
		if(price >= 10000) {
			return "너무 비싸다";
		} 
		
		return getFeeling2(price);
	}
	
	public static String getFeeling2(int price) {
		if(price >= 8000) {
			return "조금 비싸다";
		} 
		
		return "적정하거나 싼 편이다";

	}

}
