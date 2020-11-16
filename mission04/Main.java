package mission04;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
		 String[][] clock = {
				 {"한", "두", "세", "네", "다", "섯"},
				 {"여", "섯", "일", "곱", "여", "덟"},
				 {"아", "홉", "열", "한", "두", "시"},
				 {"자", "이", "삼", "사", "오", "십"},
				 {"정", "일", "이", "삼", "사", "육"},
				 {"오", "오", "칠", "팔", "구", "분"}
				 			};
		 
		 LocalTime cT = LocalTime.now();
			
		 if (cT.getHour() == 0) {
			 System.out.println(clock[3][0] + clock[4][0]);
				 
			 }
		 if (cT.getHour() == 1) {
			 
		 }
		 
	
	}
	}
