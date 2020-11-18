package mission04;

import java.util.Calendar;

public class Cal {
	Calendar cal = Calendar.getInstance();

	private int year;
	private int month;
	
	Cal() {}
	
	Cal(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	private void getYmd() {
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
	}

	
	private void init() {
		cal.set(Calendar.DATE, 1); // Date를 1로 설정
		int nFirstDayOfMonth = cal.get(Calendar.DAY_OF_WEEK); // 무슨 Day인지 get.

		System.out.println(month + "월\n"); // 무슨 Month인지 출력
		System.out.println("일\t" + "월\t" + "화\t" + "수\t" + "목\t" + "금\t" + "토\n");
		for (int i = 1; i < nFirstDayOfMonth; i++) { // 시작하는 공백을 채우기위한
			System.out.println("ㅁ\t");
		}
	}
	
	void run() {
		init();
		getYmd();
		
		
	}
	

}
