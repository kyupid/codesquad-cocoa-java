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
				{ "오", "육", "칠", "팔", "구", "분" },
				};

		LocalTime cT = LocalTime.now();
		int h = cT.getHour();
		int m = cT.getMinute();
		int s = cT.getSecond();
		
		for (int i = 0; i < clock.length; i++) {
			for (int j = 0; j < clock[0].length; j++) {
				clock[i][j] = "🤣";
			}
		}
//		for (int i = 0; i < clock.length; i++) {
//			for (int j = 0; j <clock[0].length; j++) {
//				System.out.print(clock[i][j]);
//			}System.out.println();
//		}		이따가 조건 넣어주고 마지막에 !!

		if (13 <= h && h <= 23) {
			h = h - 12;
		}
		if (h == 0 && m == 0) {
			clock[3][0] = "자";
			clock[4][0] = "정";
		}
		if (h == 12 && m == 0) {
			clock[4][0] = "정";
			clock[5][0] = "오";
		}
		if (h == 1) {
			clock[0][0] = "한";
			clock[2][5] = "시";
		}
		if (h == 2) {
			clock[0][1] = "두";
			clock[2][5] = "시";
		}
		if (h == 3) {
			clock[0][2] = "세";
			clock[2][5] = "시";
		}
		if (h == 4) {
			clock[0][3] = "네";
			clock[2][5] = "시";
		}
		if (h == 5) {
			clock[0][4] = "다";
			clock[0][5] = "섯";
			clock[2][5] = "시";
		}
		if (h == 6) {
			clock[1][0] = "여";
			clock[1][1] = "섯";
			clock[2][5] = "시";
		}
		if (h == 7) {
			clock[1][2] = "일";
			clock[1][3] = "곱";
			clock[2][5] = "시";
		}
		if (h == 8) {
			clock[1][4] = "여";
			clock[1][5] = "덟";
			clock[2][5] = "시";
		}
		if (h == 9) {
			clock[2][0] = "아";
			clock[2][1] = "홉";
			clock[2][5] = "시";

		}
		if (h == 10) {
			clock[2][2] = "열";
			clock[2][5] = "시";
		}
		if (h == 11) {
			clock[2][2] = "열";
			clock[2][3] = "한";
			clock[2][5] = "시";
		}
		if (h == 12) {
			clock[2][2] = "열";
			clock[2][4] = "두";
			clock[2][5] = "시";
		}

		if (m / 10 == 1) {
			clock[3][5] = "십";
		}
		if (m / 10 == 2) {
			clock[3][1] = "이";
			clock[3][5] = "십";
		}
		if (m / 10 == 3) {
			clock[3][2] = "삼";
			clock[3][5] = "십";
		}
		if (m / 10 == 4) {
			clock[3][3] = "사";
			clock[3][5] = "십";
		}
		if (m / 10 == 5) {
			clock[3][4] = "오";
			clock[3][5] = "십";
		}
		if (m % 10 == 1) {
			clock[4][1] = "일";
		}
		if (m % 10 == 2) {
			clock[4][2] = "이";
		}
		if (m % 10 == 3) {
			clock[4][3] = "삼";
		}
		if (m % 10 == 4) {
			clock[4][4] = "사";
		}
		if (m % 10 == 5) {
			clock[4][5] = "오";
		}
		if (m % 10 == 6) {
			clock[5][1] = "육";
		}
		if (m % 10 == 7) {
			clock[5][2] = "칠";
		}
		if (m % 10 == 8) {
			clock[5][3] = "팔";
		}
		if (m % 10 == 9) {
			clock[5][4] = "구";
		}
		if (m != 0) {
			clock[5][5] = "분";
		}
		
		while (true) {
			for (int i = 0; i < clock.length; i++) {
				for (int j = 0; j < clock[0].length; j++) {
					System.out.print(clock[i][j]);
				}
				System.out.println();
			}//for() end
			try {
				Thread.sleep(60000);
			}catch (Exception ex) {
			}//try catch() end
		}//while() end
		
	}
}