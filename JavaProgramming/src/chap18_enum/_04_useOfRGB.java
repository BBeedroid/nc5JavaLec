package chap18_enum;

import chap18_enum.enums.RGB;

public class _04_useOfRGB {

	public static void main(String[] args) {
		RGB red = RGB.RED;
		RGB green = RGB.valueOf("GREEN");
		RGB blue = Enum.valueOf(RGB.class, "BLUE");
		
		System.out.println("빨간색은 " + red.getRgbNum1() + ", " + red.getRgbNum2() + ", " + red.getRgbNum3());
		System.out.println("초록색은 " + green.getRgbNum1() + ", " + green.getRgbNum2() + ", " + green.getRgbNum3());
		System.out.println("파란색은 " + blue.getRgbNum1() + ", " + blue.getRgbNum2() + ", " + blue.getRgbNum3());
		
		red.makeWhite();
		green.makeWhite();
		blue.makeWhite();
	}

}
