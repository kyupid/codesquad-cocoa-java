package mission04;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Hhmmss clock = new Hhmmss();
//		clock.run();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Year?");
		int year = scan.nextInt();
		System.out.println("Month?");
		int month = scan.nextInt();
		System.out.println("Date?");
		int date = scan.nextInt();
		scan.close();
		
		Cal calendar = new Cal(year, month, date);
		calendar.run();
	}
}