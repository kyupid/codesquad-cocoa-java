package mission04;

import java.util.Calendar;

public class Cal {
	Calendar cal = Calendar.getInstance();

//   Function colored today
//	private static final String ANSI_GREEN = "\u001B[32m";
//	private static final String ANSI_RESET = "\u001B[0m";
//	private final int today = cal.get(Calendar.DATE);
	private int year;
	private int month;

	Cal() {
	}

	Cal(int year, int month) {
		this.year = year;
		this.month = month;
	}

	private void setYm() {
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1); // month 는 0부터11까지
	}

	private void getCurrentYm() {
		this.year = cal.get(Calendar.YEAR);
		this.month = cal.get(Calendar.MONTH) + 1;
	}

	private void init() {

		cal.set(Calendar.DATE, 1); // Date를 1로 설정
		int nFirstDayOfMonth = cal.get(Calendar.DAY_OF_WEEK); // 무슨 Day인지 get.

		System.out.println("\n" + year + "년" + " " + month + "월\n"); // 무슨 Month인지 출력
		System.out.println("일\t" + "월\t" + "화\t" + "수\t" + "목\t" + "금\t" + "토\n");

		for (int i = 1; i < nFirstDayOfMonth; i++) { // 시작하는 공백을 채우기위한
			System.out.print("  \t");

		}
	}

	void run() {
		setYm();
		init();
		printDates();

	}

	void run2() {
		getCurrentYm();
		init();
		printDates();
	}

	private void printDates() {

		int endDate = cal.getActualMaximum(Calendar.DATE);
		for (int i = 1; i <= endDate; i++) {

//			Function colored today
//			if (i == today) {
//				System.out.print(ANSI_GREEN + "test" + ANSI_RESET + "");
//			}
			cal.set(Calendar.DATE, i);
			System.out.print(i + "\t");

			int j = cal.get(Calendar.DAY_OF_WEEK); // 요일을 검사한다
			if (j % 7 == 0) { // 검사한게 토(7)의 배수이면 개행한다.
				System.out.println();
			}
		}
	}

}
