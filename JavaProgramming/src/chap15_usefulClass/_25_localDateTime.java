package chap15_usefulClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _25_localDateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 3, 24);
		LocalTime time = LocalTime.of(16, 4, 30);
		
		//of 메소드를 이용한 LocalDateTime 객체 생성
		LocalDateTime ldt1 = LocalDateTime.of(date, time);
		//atDate, atTime 메소드 사용
		LocalDateTime ldt2 = date.atTime(time);
		LocalDateTime ldt3 = time.atDate(date);
		
		//현재 날짜와 시간의 LocalDateTime 객체 생성
		LocalDateTime ldt4 = LocalDateTime.now();
		
		//LocalDateTime => LocalDate, LocalTime으로 분리
		LocalDate ld = ldt3.toLocalDate();
		LocalTime lt = ldt3.toLocalTime();
		
		System.out.println(ldt1); //2023-03-24T16:04:30 => T: 타임존 표시
		System.out.println(ldt2);
		System.out.println(ldt4);
		System.out.println(ld + ", " + lt);
	}

}
