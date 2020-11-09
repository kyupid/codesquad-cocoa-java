package mission03;

import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {

	public static void youLose() {
		System.out.println("You Lose!");
		System.out.println("===========================");
	}
	
	public static void youWin() {
		System.out.println("You Win!");
		System.out.println("===========================");
	}
	
	public static void selectNumPrint() {
		System.out.println("Enter 1 or 2");
		System.out.println("1. Odd");
		System.out.println("2. Even");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("Enter your name");
		String playerName = sc.nextLine();

		int playerScore = 0;
		int computerScore = 0;

		System.out.println("Hi, " + playerName + ".");
		System.out.println("Your score: " + playerScore);
		System.out.println("Computer's score: " + computerScore);
		System.out.println("===========================");
//==========================반복문 시작=============================
		while (playerScore < 5 && computerScore < 5) {
			selectNumPrint();
			int selectedNum = sc.nextInt();
			if (selectedNum == 1) {
				int rNum1 = rd.nextInt(19) + 1;
				System.out.println("Computer picked: " + rNum1);
				if (rNum1 % 2 == 1) {
					youWin();
					playerScore++;

				}
				if (rNum1 % 2 == 0) {
					youLose();
					computerScore++;
				}
			}

			if (selectedNum == 2) {
				int rNum2 = rd.nextInt(19) + 1;
				System.out.println("Computer picked: " + rNum2);
				if (rNum2 % 2 == 1) {
					youLose();
					computerScore++;
				}
				if (rNum2 % 2 == 0) {
					youWin();
					playerScore++;
				}
			}

		}
	}
}
