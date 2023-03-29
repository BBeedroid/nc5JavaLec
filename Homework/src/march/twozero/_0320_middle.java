package march.twozero;

public class _0320_middle {
		//1. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
		static double[] intToDouble(int[] source) { // int배열을 double배열로 변환
			double[] arr1 = new double[source.length];
			for (int i = 0; i < source.length; i++) {
				arr1[i] = (double)Math.ceil(source[i]);
			}
			return arr1;
		}

		static int[] doubleToInt(double[] source) { // double배열을 int배열로 변환
			int[] arr2 = new int[source.length];
			for (int i = 0; i < source.length; i++) {
				arr2[i] = (int)Math.ceil(source[i]);
			}
			return arr2;
		}

		/*2. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요
		  static int[] concat(int[] s1, int[] s2);	s1과 s2를 연결한 새로운 배열 리턴
		  static int[] remove(int[] s1, int[] s2);	s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴*/



}
