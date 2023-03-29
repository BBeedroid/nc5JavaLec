package chap18_enum;

import java.lang.reflect.Method;

import chap18_enum.enums.MethodMonth;

public class _05_methodOfEnum {

	public static void main(String[] args) {
		MethodMonth.printMonth(5);
		
		MethodMonth aug = MethodMonth.AUG;
		aug.printAddMonth(3);
		aug.printAddMonth(36);

	}

}
