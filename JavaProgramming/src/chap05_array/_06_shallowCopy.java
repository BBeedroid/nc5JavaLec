package chap05_array;

public class _06_shallowCopy {

	public static void main(String[] args) {
		int[] intArr1 = {1, 2, 3, 4, 5};
		
		//얕은 복사
		int[] intArr2 = intArr1;
		
		System.out.println(intArr1); //@주소값이 결과에 뜸
		System.out.println(intArr2);
		System.out.println(intArr1 == intArr2);
		
		//값을 변경하면 상호 영향을 준다
		intArr1[0] = 20;
		intArr2[4] = 30;
		System.out.println(intArr1[4]);
		System.out.println(intArr2[0]);
		

	}

}
