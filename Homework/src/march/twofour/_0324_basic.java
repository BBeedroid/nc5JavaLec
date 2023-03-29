package march.twofour;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _0324_basic {

	public static void main(String[] args) {
//		Calendar 객체를 오늘날짜로 생성하세요.
		Calendar cal1 = Calendar.getInstance();
//		1. 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
		cal1.set(2020, 4, 8);
		System.out.println(cal1.get(Calendar.YEAR) + "년 "
					+ cal1.get(Calendar.MONTH) + "월 " 
					+ cal1.get(Calendar.DAY_OF_MONTH) + "일");
//		2. 위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤로 변경하고 출력하세요.
		cal1.add(Calendar.YEAR, 5);
		cal1.add(Calendar.MONTH, 2);
		cal1.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(cal1.get(Calendar.YEAR) + "년 "
				+ cal1.get(Calendar.MONTH) + "월 " 
				+ cal1.get(Calendar.DAY_OF_MONTH) + "일");


//		Calendar 객체를 오늘날짜로 생성하세요.
		Calendar cal2 = Calendar.getInstance();
//		1. 오늘날짜를 2023-03-24 형식으로 출력하세요.
		Date dt1 = new Date(cal2.getTimeInMillis());
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf1.format(dt1));
//		2. 오늘 날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		System.out.println(sdf2.format(dt1));
	}

}
