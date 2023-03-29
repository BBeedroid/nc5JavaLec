package march.onesix;

import java.util.Random;

public class _0316_middle {

	public static void main(String[] args) {
		/*1. 배열 20개 선언 후 20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
	    인덱스의 홀수 번째는 앞에서부터 출력하고, 짝수 번째는 뒤에서부터 출력*/
		int[] arr = new int[20];
		
		Random rd = new Random();
		
		System.out.print("순서대로 출력: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
			
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.print(arr[arr.length - i - 2] + ", "); //인덱스는 0에서 시작한다!
		}
		
		System.out.println();
		
//		for(int i = arr.length - 1; i >= 0; i--) {
//			if(i % 2 == 1)
//			System.out.print(arr[i] + ", ");
//		}
				
		
		/*for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] % 2 == 0)
				reverseArr[i] = arr[i];
			
				for(int j = arr.length - 1; j > 0 ; j--) {
					if(arr[i] % 2 == 1)
						okayArr[j] = arr[i];
					
						System.out.print(okayArr[j] + ", ");
						break;		
				}
				System.out.print(reverseArr[i] + ", ");
		}*/
		
		


		
		/*for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			if(arr[i] % 2 == 0) {
				reverseArr[j] = arr[i];
			} else if (arr[i] % 2 != 0) {
				okayArr[i] = arr[i];
			}
			System.out.print(okayArr[i] + ", " + reverseArr[j] + ", ");
		}*/
	}
}