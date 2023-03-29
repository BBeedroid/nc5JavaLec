package march.twofour;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _0324_middle {

	public static void main(String[] args) throws ParseException {
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Calendar로 변환가능)
		Scanner sc = new Scanner(System.in);
		System.out.println("yyyy-MM-dd 형식으로 날짜를 입력하세요.");
		String str1 = sc.nextLine();

		//형식에 맞게 입력 강제
		String pattern = "[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])";
		
		Pattern pt = Pattern.compile(pattern);
		Matcher mt = pt.matcher(str1);

		//String => Calendar
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = new Date();
		dt = sdf1.parse(str1);
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(dt);
		
		//3일 뒤로 변경
//		cal1.add(Calendar.DAY_OF_MONTH, 3);
		
		//Calendar => SimpleDateFormat
		dt = new Date(cal1.getTimeInMillis());
		
		//결과 출력
//		if (mt.matches())
//			System.out.println("입력하신 날짜를 출력합니다." + sdf1.format(dt));
//		else {
//			System.out.println("날짜를 다시 입력해주세요.");
//			str1 = sc.nextLine(); //처음부터 다시 시작하게 하는 방법 모름
//		}
		
//	     2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//	     사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
		String[] days = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		System.out.println("입력하신 날짜와 요일을 출력합니다." + sdf1.format(dt)
												+ " " + days[cal1.get(Calendar.DAY_OF_WEEK)]);
		sc.close();

//	     3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.

	}

}
