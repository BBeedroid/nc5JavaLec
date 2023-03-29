package march.onefive;

public class _0315_basic {

	public static void main(String[] args) {
		//1. 10 ~ 1까지 거꾸로 while문으로 출력
		int iNum1 = 11;
		
		while(iNum1 > 1) {
			iNum1--;
			System.out.println(iNum1);
		}
				
		//2. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		int iNum2 = 10;
		
		do {
			System.out.println(iNum2);
			iNum2 -= 1;
		} while(iNum2 > 0);

		//3. 10 ~ 1까지 거꾸로 for문으로 출력
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		//4. 1 ~ 100까지 합을 while문으로 출력
		int sum1 = 0;
		int iNum3 = 1;
		
		while(iNum3 <= 100) {
			sum1 += iNum3;
			iNum3++;
		}
		
		System.out.println(sum1);
		
		//5. 1 ~ 100까지 합을 do ~ while문으로 출력
		int sum2 = 0;
		int iNum4 = 1;
		
		do {
			sum2 += iNum4;
			iNum4++;
		} while(iNum4 <= 100);
		
		System.out.println(sum2);
		
		//6. 1 ~ 100까지 합을 for문으로 출력
		int sum3 = 0;
		
		for(int j = 1; j <= 100; j++) {
			sum3 += j;
		}
		
		System.out.println(sum3);
		
	}

}
