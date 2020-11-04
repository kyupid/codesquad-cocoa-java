package mission02;

import java.util.Scanner;

public class Indian {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("생년월일을 차례대로 입력해주세요.");
			
			int year = s.nextInt();
			int month = s.nextInt();
			int day = s.nextInt();
			
			String y, m, d;
			
			if (year%10 == 0) {
				y = "시끄러운";
			}
		
			if (year%10 == 1) {
				y = "푸른";
			}
			
			if (year%10 == 2) {
				y = "어두운";
			}
			
			if (year%10 == 3) {
				y = "조용한";
			}
			
			if (year%10 == 4) {
				y = "웅크린";
			}
			
			if (year%10 == 5) {
				y = "푸른";
			}
			
			if (year%10 == 6) {
				y = "지혜로운";
			}
			
			if (year%10 == 7) {
				y = "용감";
			}
			
			if (year%10 == 8) {
				y = "날카로운";
			}
			
			if (year%10 == 9) {
				y = "욕심많은";
			}

	}
}
