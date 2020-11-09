package mission03;

import java.util.Random;
import java.util.Scanner;

class C {

	static double playerAmount = 100;
	static double computerAmount = 120;

	static int betAmount;

	public static void youLose() {
		System.out.println("You Lose!");
		System.out.println("===========================");
		computerAmount += betAmount;
		playerAmount -= betAmount;
		System.out.println("Your amount: " + playerAmount);
		System.out.println("Computer's amount: " + computerAmount);
		System.out.println("===========================");

	}
	
	public static void youWin() {
		System.out.println("You Win!");
		System.out.println("===========================");
		playerAmount += betAmount;
		computerAmount -= betAmount;
		System.out.println("Your amount: " + playerAmount);
		System.out.println("Computer's amount: " + computerAmount);
		System.out.println("===========================");

	}

	public static void selectNumPrint() {
		System.out.println("Enter 1 or 2");
		System.out.println("1. Odd  2. Even");

	}
}

public class OddsAndEvens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("Enter your name");
		String playerName = sc.nextLine();

		System.out.println("Hi, " + playerName + ".");
		System.out.println("Your amount: " + C.playerAmount);
		System.out.println("Computer's amount: " + C.computerAmount);
		System.out.println("===========================");

//==========================반복문 시작=============================

		double numStage = 1;

		while (numStage < 9) {
			if (C.playerAmount <= 0) {
				break;
			}

			while (true) {
				C.selectNumPrint();
				int selectedNum = sc.nextInt();

				System.out.println("Enter your bet amount");
				System.out.println("You can bet max: " + Math.min(C.playerAmount, C.computerAmount));
				C.betAmount = sc.nextInt();

				if (selectedNum == 1) {
					int rNum1 = rd.nextInt(19) + 1;
					System.out.println("===========================");
					System.out.println("Computer picked: " + rNum1);
					if (rNum1 % 2 == 1) {
						C.youWin();

					}
					if (rNum1 % 2 == 0) {
						C.youLose();
					}
				}

				if (selectedNum == 2) {
					int rNum2 = rd.nextInt(19) + 1;
					System.out.println("===========================");
					System.out.println("Computer picked: " + rNum2);
					if (rNum2 % 2 == 1) {
						C.youLose();
					}
					if (rNum2 % 2 == 0) {
						C.youWin();
					}
				}

				if (C.playerAmount <= 0) {
					System.out.println("=========Game Over=========");
					System.out.println("===========================");
					System.out.println("Your amount: " + C.playerAmount);
					System.out.println("Computer's amount: " + C.computerAmount);
					break;
				}

				// =======새로운 스테이지========
				if (C.computerAmount <= 0) {
					numStage++;
					C.computerAmount = Math.round(C.playerAmount * Math.pow(1.2, numStage));
					System.out.println("Stage " + numStage);
					System.out.println("Your amount: " + C.playerAmount);
					System.out.println("Computer's amount: " + C.computerAmount);
					break;
				}

			}
		}
		sc.close();
	}
}
