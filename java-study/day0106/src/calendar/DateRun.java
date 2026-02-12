package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {
	public static void main(String[] args) {
		//Date 클래스는 날짜를 표현한다.
		//그레고리력 기준 시간: 1970.1.1 0시0분0초 ~ 현재시간, 초로 환산한다.
		Date now = new Date();
		String strNow = now.toString();
		
		System.out.println("strNow = " + strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow1 = sdf.format(now);
		System.out.println("strNow1 = " + strNow1);
	}
}
