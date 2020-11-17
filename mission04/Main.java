package mission04;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {

		String[][] clock = {
				{ "한", "두", "세", "네", "다", "섯" },
				{ "여", "섯", "일", "곱", "여", "덟" },
				{ "아", "홉", "열", "한", "두", "시" },
				{ "자", "이", "삼", "사", "오", "십" },
				{ "정", "일", "이", "삼", "사", "오" },
				{ "오", "육", "칠", "팔", "구", "분" } 
				};

		LocalTime cT = LocalTime.now();
		int h = cT.getHour();
		int m = cT.getMinute();

		if (h == 0) {
			System.out.println(clock[3][0] + clock[4][0]);
		}
		if (h == 1 || h == 13) {
			System.out.println(clock[0][0] + clock[2][5]);
		}
		if (h == 2 || h == 14) {
			System.out.println(clock[0][1] + clock[2][5]);
		}
		if (h == 3 || h == 15) {
			System.out.println(clock[0][2] + clock[2][5]);
		}
		if (h == 4 || h == 16) {
			System.out.println(clock[0][3] + clock[2][5]);
		} // 1시에서 4시까지중복

//		 if (0 < hour && hour < 5) {
//			 System.out.println(clock[0][hour-1] + clock[2][5]);
//		 }
//		 
//		 if (12 < hour && hour < 17) {
//			 System.out.println(clock[0][hour-1] + clock[2][5]);
//		 }

		if (h == 5 || h == 17) {
			System.out.println(clock[0][4] + clock[0][5] + clock[2][5]);
		}
		if (h == 6 || h == 18) {
			System.out.println(clock[1][0] + clock[1][1] + clock[2][5]);
		}
		if (h == 7 || h == 19) {
			System.out.println(clock[1][2] + clock[1][3] + clock[2][5]);
		}
		if (h == 8 || h == 20) {
			System.out.println(clock[1][4] + clock[1][5] + clock[2][5]);
		}
		if (h == 9 || h == 21) {
			System.out.println(clock[2][0] + clock[2][1] + clock[2][5]);
		} // 5~9시까지중복

		if (h == 10 || h == 22) {
			System.out.println(clock[2][2] + clock[2][5]);
		}

		if (h == 11 || h == 23) {
			System.out.println(clock[2][2] + clock[2][3] + clock[2][5]);
		}
		if (h == 12) {
			System.out.println(clock[2][2] + clock[2][4] + clock[2][5]);
		}

		
		if (m / 10 == 1) {
			System.out.println(clock[3][5]);
		}
		if (m / 10 == 2) {
			System.out.println(clock[3][1] + clock[3][5]);
		}
		if (m / 10 == 3) {
			System.out.println(clock[3][2] + clock[3][5]);
		}
		if (m / 10 == 4) {
			System.out.println(clock[3][3] + clock[3][5]);
		}
		if (m / 10 == 5) {
			System.out.println(clock[3][4] + clock[3][5]);
		}
		
		if (m % 10 == 1) {
			System.out.println(clock[4][1]);
		}
		if (m % 10 == 2) {
			System.out.println(clock[4][2]);
		}
		if (m % 10 == 3) {
			System.out.println(clock[4][3]);
		}
		if (m % 10 == 4) {
			System.out.println(clock[4][4]);
		}
		if (m % 10 == 5) {
			System.out.println(clock[4][5]);
		}
		if (m % 10 == 6) {
			System.out.println(clock[5][1]);
		}
		if (m % 10 == 7) {
			System.out.println(clock[5][2]);
		}
		if (m % 10 == 8) {
			System.out.println(clock[5][3]);
		}
		if (m % 10 == 9) {
			System.out.println(clock[5][4]);
		}
		
		if (m != 0) {
			System.out.println(clock[5][5]);
		}
		
		
	}
}
