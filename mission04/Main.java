package mission04;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	static void selectClockOrCal() {
		
		System.out.println("clock or cal");
		System.out.print(">>");
		String ClockOrCal = scan.next();
		
		if (ClockOrCal.equals("clock")) {
			
			Hhmmss clock = new Hhmmss();
			clock.run();
		}
		else if (ClockOrCal.equals("cal")) {
			
			//현재날짜의 달력
			Cal calendar = new Cal();
			calendar.run();
			
			System.out.println("\n다른 달력 보고싶어?");
			System.out.print(">>");
			String temp =  scan.next();
			
			if (temp != null) {
			System.out.println("Year?");
			int year = scan.nextInt();
			System.out.println("Month?");
			int month = scan.nextInt();
			
			//보고싶은 달력
			Cal calendar2 = new Cal(year, month);
			calendar2.run();
			}
		}
		else {
			selectClockOrCal();
		}
	}

	public static void main(String[] args) {

		selectClockOrCal();

		

	}
}