package chap02_exempliGratia;

import java.text.DecimalFormat;
import java.text.NumberFormat; //수에 대한 전반적인 format 기능을 제공하는 클래스
import java.util.Locale;
/*Locale 객체는 특정 지리적, 국가적, 또는 문화적 지역을 나타내기 위한 것
default 국가로 설정되어 있지 않을 때 Locale 클래스를 이용해 임의의 객체를 생성해 준 후 이용한다*/

public class _02_DecimalFormat {

	public static void main(String[] args) {
		//변환할 값
		double dNum = 12345.6789;
		
		//10진수 - 빈 자리 0으로 채움
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(dNum));
		
		df = new DecimalFormat("0000000.0000000");
		System.out.println(df.format(dNum));
		
		//10진수 - 빈 자리 채우지 않음
		df = new DecimalFormat("###");
		System.out.println(df.format(dNum));
		
		df = new DecimalFormat("#########.#####");
		System.out.println(df.format(dNum));	
		
		//10진수 - # 0 조합 / 단위 구분을 위한 ,콤마 추가
		df = new DecimalFormat("#,###.00000");
		System.out.println(df.format(dNum));
		
		//100을 곱한 후 문자에 % 붙임
		df = new DecimalFormat("#.##%");
		System.out.println(df.format(dNum));
		
		df = new DecimalFormat("0.00%");
		System.out.println(df.format(dNum));
		
		//통화표시 \u00A4(원화)
		df = new DecimalFormat("\u00A4####.##");
		System.out.println(df.format(dNum));
		
		df = new DecimalFormat("\u00A40000.00");
		System.out.println(df.format(dNum));
		
		//NumberFormat을 이용하여 통화 표시를 지정할 수 있다
		//Locale을 사용하여 국가 지정시 해당 국가의 통화 기호 및 자리수 구분까지 가능하다
		NumberFormat nf = NumberFormat.getCurrencyInstance( Locale.KOREA );
		//소수점 2자리까지 지정
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(dNum));
		
	}

}
