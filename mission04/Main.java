package mission04;

import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static int year, month;

	static void inputYearNMonth() {
		System.out.println("\n\n다른 달력 보고싶어?");
		System.out.print(">>");
		String temp = scan.next();

		if (temp != null) {
			System.out.println("Year?");
			System.out.print(">>");
		 	year = scan.nextInt();
			System.out.println("Month?");
			System.out.print(">>");
			month = scan.nextInt();
			while (1 > month || month > 12) {
				System.out.println("Month?");
				System.out.print(">>");
				month = scan.nextInt();
				if (0 < month && month < 13) {
					break;
				}
			}
		}

		if (0 < month && month < 13) {
			Cal calendar2 = new Cal(year, month);
			calendar2.run();
			selectClockOrCal();
		} 

	}

	static void selectClockOrCal() {

		System.out.println("\n\nclock or cal");
		System.out.print(">>");
		String ClockOrCal = scan.next();
		
		if (ClockOrCal.equals("clock")) {

			Hhmmss clock = new Hhmmss(); //hhmmss 는 thread
			clock.run();
			
		} else if (ClockOrCal.equals("cal")) {

			// 현재날짜의 달력
			Cal calendar = new Cal();
			calendar.run2();

			// 보고싶은 달
			inputYearNMonth();
			Cal calendar2 = new Cal(year, month);
			calendar2.run();
			selectClockOrCal();
		}
	}

	public static void main(String[] args) {

		selectClockOrCal();

	}
}