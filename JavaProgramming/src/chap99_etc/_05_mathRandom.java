package chap99_etc;

public class _05_mathRandom {

	public static void main(String[] args) {
		//난수 발생 첫 번째 방법
		//Math.random() 사용: 0 <= Math.random() < 1 사이의 난수 발생
		System.out.println(Math.random());

		//2. 1 <= 난수 < 11
		//0 <= Math.random() * 10 < 10
		//1 <= (int)(Math.random() * 10) + 1 < 11
		int rand = (int)(Math.random() * 10) + 1;
		System.out.println(rand);
		
		//3. 1~45까지 난수 발생기
		//0 + 1 <= 변수 < 45 + 1
		int rand2 = (int)(Math.random() * 45) + 1; 
		System.out.println(rand2);
		
		//4. 200~299까지 난수 발생기
		//0 <= 변수 < 100
		int rand3 = (int)(Math.random() * 100) + 200;
		System.out.println(rand3);
		
		//공식: a~b까지 랜덤
		//(int)(Math.random() * (b - a + 1)) + a;
		
	}

}
