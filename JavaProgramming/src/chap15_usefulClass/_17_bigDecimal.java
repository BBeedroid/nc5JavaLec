package chap15_usefulClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class _17_bigDecimal {

	public static void main(String[] args) {
		//BigDecimal 객체 생성
		BigDecimal bd1 = new BigDecimal(1.732);
		BigDecimal bd2 = BigDecimal.valueOf(3.145);
		BigDecimal bd3 = new BigDecimal("12.111222333");
		
		//반올림 모드
		//divide: 나눌 때 오차가 발생할 수 있으므로 반올림 모드를 지정한다
		//MathContext(int precision) => 연산에 사용할 총 자릿수이며 정수의 자릿수도 포함한다
		System.out.println(bd2.divide(bd1, new MathContext(4, RoundingMode.CEILING)));
		//setScale: 소수점 자릿수를 재설정한다
		//.145 3자리에서 1자리 수로 변경
		System.out.println(bd2.setScale(1, RoundingMode.FLOOR));
		//.732 3자리에서 2자리 수로 변경하는데 양수이면 올림, 음수이면 내림
		System.out.println(bd1.setScale(2, RoundingMode.UP));
		//.111222333 9자리에서 3자리 수로 변경하는데 양수이면 내림, 음수이면 올림
		System.out.println(bd3.setScale(3, RoundingMode.DOWN));
	}

}
