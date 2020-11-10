package mission03;

import java.util.Random;
import java.util.Scanner;

import mission03.IndianRandomNames;

class IndianRandomNames {

	static Random rd = new Random();

	public static String getIndianYear() {
	
		String[] y = {"말 많은", "푸른", "어두운", "조용한", 
				"웅크린", "백색", "지혜로운", "용감한",
				"날카로운", "욕심많은"};
	
		
		return y[rd.nextInt(y.length) - 1];
		}

	public static String getIndianMonth() {
		String[] m = { "늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛", "말", "돼지", "하늘", "바람" };

		return m[rd.nextInt(m.length + 1) - 1];
	}

	public static String getIndianDay() {
		String[] d = { "와(과) 함께 춤을", "의 기상", "은(는) 그림자 속에", "의 화신", "의 노예", "의 마법사", "의 환생", "의 죽음", "아래에서", "를(을) 보라",
				"이(가) 노래하다", "의 그림자", "의 일격", "에게 쫓기는 남자", "의 행진", "의 왕", "의 유령", "을 죽인자", "는(은) 맨날 잠잔다", "처럼", "의 고향",
				"의 전사", "은(는) 나의 친구", "의 노래", "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "를(을) 쓰러뜨린 자", "의 혼",
				"은(는) 말이 없다" };

		return d[rd.nextInt(d.length + 1) - 1];
	}

}


class C {

	static String computerName =  "\"" + IndianRandomNames.getIndianYear() + " " + IndianRandomNames.getIndianMonth() + IndianRandomNames.getIndianDay() + "\"";

	
	static double playerAmount = 100;
	static double computerAmount = 120;

	static int betAmount;

	static double numStage = 1;
	static int numTry;

	public static void CalculateYouLose() {
		numTry++;
		System.out.println("You Lose!");
		System.out.println("===========================");
		System.out.println("======" + "Stage " + numStage + " - " + numTry + "========");
		computerAmount += betAmount;
		playerAmount -= betAmount;
		printAmount();
		printLineToDevideContents();

	}

	public static void CalculateYouWin() {
		numTry++;
		System.out.println("You Win!");
		System.out.println("===========================");
		System.out.println("======" + "Stage " + numStage + " - " + numTry + "========");
		playerAmount += betAmount;
		computerAmount -= betAmount;
		printAmount();
		printLineToDevideContents();

	}

	public static void printSelectNum() {
		System.out.println("1번 혹은 2번을 입력하세요.");
		System.out.println("1. 홀  2. 짝");
		printLineToDevideContents();

	}

	public static void printLineToDevideContents() {
		System.out.println("===========================");
		System.out.println("===========================");
	}

	public static void printAmount() {
		System.out.println("나의 보유 금액: " + "$" + playerAmount);
		System.out.println(computerName + "의 금액: " + "$" + computerAmount);
	}
}

public class OddsAndEvens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();


		System.out.println("이름을 입력하세요.");
		String playerName = sc.nextLine();

		System.out.println("안녕하세요, " + playerName + ".");
		System.out.println("홀짝 게임에 오신 것을 환영합니다.");
		System.out.println(C.numStage + "번째 " + "보스는 " + C.computerName + " 입니다.");
		System.out.println();
		C.printAmount();
		C.printLineToDevideContents();

//==========================반복문 시작=============================

		while (C.numStage < 9) {
			if (C.playerAmount <= 0) {
				break;
			}

			while (true) {
				C.printSelectNum();
				int selectedNum = sc.nextInt();
				C.printLineToDevideContents();

				System.out.println("베팅 금액을 입력하세요.");
				System.out.println("최대 배팅 금액: " + "$" + Math.min(C.playerAmount, C.computerAmount));
				C.printLineToDevideContents();
				C.betAmount = sc.nextInt();
				while (C.betAmount <= 0 || C.betAmount > Math.min(C.playerAmount, C.computerAmount)) {
					System.out.println("베팅 한도를 초과했습니다.");
					System.out.println("베팅 금액을 다시 입력할래?");
					C.betAmount = sc.nextInt();
				}

				if (selectedNum == 1) {

					int rNum1 = rd.nextInt(19) + 1;
					C.printLineToDevideContents();
					System.out.println(C.computerName + "(이)가 고른 숫자: " + rNum1);

					if (rNum1 % 2 == 1) {
						C.CalculateYouWin();

					}
					if (rNum1 % 2 == 0) {
						C.CalculateYouLose();
					}
				}

				if (selectedNum == 2) {

					int rNum2 = rd.nextInt(19) + 1;
					C.printLineToDevideContents();
					System.out.println(C.computerName + "(이)가 고른 숫자" + rNum2);

					if (rNum2 % 2 == 1) {
						C.CalculateYouLose();
					}
					if (rNum2 % 2 == 0) {
						C.CalculateYouWin();
					}
				}

				if (C.playerAmount <= 0) {
					System.out.println("=========Game Over=========");
					C.printLineToDevideContents();
					break;
				}

				// =======새로운 스테이지========
				if (C.computerAmount <= 0) {
					C.numStage++;
					System.out.println("===========================");
					System.out.println(C.numStage+ "번째 " + "보스는 " + C.computerName + " 입니다.");
					C.numTry = 0;
					C.computerAmount = Math.round(C.playerAmount * Math.pow(1.2, C.numStage));
					System.out.println("Stage " + C.numStage + "로 이동합니다.");
					System.out.println();
					C.printAmount();
					break;
				}

			}
		}
		sc.close();
	}
}
