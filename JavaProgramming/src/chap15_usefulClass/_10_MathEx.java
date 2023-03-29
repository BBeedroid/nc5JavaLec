package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		//사용자가 5개 정수 입력 => 배열 저장	
		Scanner sc = new Scanner(System.in);
		
		int[] inputArr = new int[5];
		
		System.out.println("정수 5개 입력");
		for(int i = 0; i < inputArr.length; i++) {
			inputArr[i] = sc.nextInt();
		}
		
		//Math.max와 Math.min을 이용하여 최댓값, 최솟값 구하기
		int max = inputArr[0];
		int min = inputArr[0];
		
		for(int i = 1; i < inputArr.length; i++) {
			max = Math.max(max, inputArr[i]);
			min = Math.min(min, inputArr[i]);
		}
		
		System.out.println("최댓값: " + max + " 최솟값: " + min);
		
		sc.close();
	}

}
