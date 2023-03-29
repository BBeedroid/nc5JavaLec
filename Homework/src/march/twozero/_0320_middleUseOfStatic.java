package march.twozero;

import march.twozero.twentieth.*;

public class _0320_middleUseOfStatic {

	public static void main(String[] args) {
		//1번 문제
		int[] intArr = {1, 2, 3, 4, 5};
		
		double[] dbArr = ArrayUtility.intToDouble(intArr);
		
		System.out.println();
		
		ArrayUtility.doubleToInt(dbArr);
		
		System.out.println();
		
		//2번 문제
		int[] s1 = {2, 4, 6};
		int[] s2 = {1, 3, 5};
		
		ArrayUtility2.concat(s1, s2);
	
		
	}

}
