package chap15_usefulClass;

import java.util.Calendar;

public class _18_calendar {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		String[] days = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"}; 
		
		//HOUR는 오전, 오후 상관없이 0부터 11로 시간을 표시한다
		System.out.println("현재 시간 " + today.get(Calendar.HOUR) + ":"
					+ today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));
		//HOUR_OF_DAY는 0부터 23으로 시간을 표시한다
		System.out.println("현재 시간 : " + today.get(Calendar.HOUR_OF_DAY));
		//AM_PM은 오전(0), 오후(1)로 표시한다
		System.out.println("오전 or 오후 : " + today.get(Calendar.AM_PM));
		
		System.out.println("올해 년도 : " + today.get(Calendar.YEAR));
		//월은 0(1월)부터 시작한다
		System.out.println("현재 월 : " + today.get(Calendar.MONTH));
		System.out.println("올해의 몇 번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번 달의 몇 번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		//요일은 1부터 시작한다, 1(일요일) ~ 7(토요일)
		System.out.println("오늘의 요일 : " + days[today.get(Calendar.DAY_OF_WEEK)]);
		
		Calendar oneDay = Calendar.getInstance();
		oneDay.set(2023, 0, 11, 22, 53, 32);
		
		System.out.println("oneDay의 요일 : " + days[oneDay.get(Calendar.DAY_OF_WEEK)]);
		
		System.out.println("oneDay는 " + oneDay.get(Calendar.YEAR) + "년 "
					+ (oneDay.get(Calendar.MONTH) + 1) + "월 "
					+ oneDay.get(Calendar.DATE) + "일");
		System.out.println(toString(oneDay));
		
	}
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년 "
				+ (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DATE) + "일";
	}
}
