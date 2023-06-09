package chap15_usefulClass;

import java.math.BigDecimal;
import java.util.Calendar;

public class _19_differenceOfTwoDate {

	public static void main(String[] args) {
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d2.set(2022, 2, 11);
		
		//getTimeInMillis(): 지정된 날짜를 long 타입 밀리세컨드로 리턴한다
		
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		System.out.println("d2부터 d1까지 " + (diff / 1000) + "초가 지났습니다."); //초 단위
		System.out.println("d2부터 d1까지 " + (diff / (1000 * 60)) + "분이 지났습니다."); //분 단위
		System.out.println("d2부터 d1까지 " + (diff / (1000 * 60 * 60)) + "시간이 지났습니다."); //시간 단위
		System.out.println("d2부터 d1까지 " + (diff / (1000 * 60 * 60 * 24)) + "일이 지났습니다."); //일 단위
		//내부 계산이 int 타입 범위를 넘어서 음수 발생 => (long) 타입 형변환 필요
		System.out.println("d2부터 d1까지 " + (diff / ((long)1000 * 60 * 60 * 24 * 30)) + "달이 지났습니다."); //달 단위
		System.out.println("d2부터 d1까지 " + (diff / ((long)1000 * 60 * 60 * 24 * 30 * 12)) + "년이 지났습니다."); //연 단위
		
		System.out.println("몇 년 몇 달 며칠 몇 시간 몇 분 몇 초 지났습니다.");
		long year = diff /
				((long)1000 * 60 * 60 * 24 * 365);
		diff = diff %
				((long)1000 * 60 * 60 * 24 * 365);
		long month = diff /
				((long)1000 * 60 * 60 * 24 * 30);
		diff = diff %
				((long)1000 * 60 * 60 * 24 * 30);
		long date = diff /
				((long)1000 * 60 * 60 * 24);
		diff = diff %
				((long)1000 * 60 * 60 * 24);
		long hour = diff /
				((long)1000 * 60 * 60);
		diff = diff %
				((long)1000 * 60 * 60);
		long minute = diff /
				((long)1000 * 60);
		diff = diff %
				((long)1000 * 60);
		long second = diff /
				(long)1000;
		
		System.out.println(year + "년 " + month + "달 " + date + "일 " + hour + "시간 "
				+ minute + "분 " + second + "초 지났습니다.");
	}

}
