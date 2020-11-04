package mission02;

import java.util.Scanner;

class IndianNames {
	
	String[] indianNameResult = { "", "", "" };
	
	public void indianYear(int year) {
	
		String[] y = {"말 많은", "푸른", "어두운", "조용한", 
				"웅크린", "백색", "지혜로운", "용감한",
				"날카로운", "욕심많은"};
	
		int i = year%10;
		y[i] = indianNameResult[0];
		}
	
	public void indianMonth(int month) {
		String[] m = {"늑대", "태양", "양", "매", "황소", "불꽃", "나무", 
				"달빛", "말", "돼지", "하늘", "바람"};
		
	
		m[month - 1] = indianNameResult[1];
		
		}
	
	public void indianDay(int day) {
		String[] d = {"와(과) 함께 춤을", "의 기상", "은(는) 그림자 속에",
				"의 화신", "의 노예", "의 마법사", "의 환생", "의 죽음",
				"아래에서", "를(을) 보라", "이(가) 노래하다", "의 그림자",
				"의 일격", "에게 쫓기는 남자", "의 행진", "의 왕", "의 유령",
				"을 죽인자", "는(은) 맨날 잠잔다", "처럼", "의 고향", "의 전사",
				"은(는) 나의 친구", "의 노래", "의 정령", "의 파수꾼", "의 악마",
				"와(과) 같은 사나이", "를(을) 쓰러뜨린 자", "의 혼", "은(는) 말이 없다"};
		
		d[day - 1] = indianNameResult[2];
		
		}
	
}

public class Indian {
	
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			System.out.println("생년월일을 차례대로 입력해주세요.");
			
			int year = s.nextInt();
			int month = s.nextInt();
			int day = s.nextInt();
			
			IndianNames loadNames = new IndianNames();
			
			
			s.close();

	}
	
}