package mission03;

import java.util.Random;
import java.util.Scanner;

class Selectnum {

	
	public int selectnum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("Enter 1 or 2");
		System.out.println("1. Odd");
		System.out.println("2. Even");
		int selectedNum = sc.nextInt();

		return selectedNum;
	}
}

public class OddsAndEvens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Selectnum s = new Selectnum();

		System.out.println("Enter your name");
		String playerName = sc.nextLine();

		int playerScore = 0;
		int computerScore = 0;

		System.out.println("Hi, " + playerName + ".");
		System.out.println("Your score: " + playerScore);
		System.out.println("Computer's score: " + computerScore);
		s.selectnum();
//==========================반복문 시작=============================
		while (playerScore < 5 && computerScore < 5) {

			if (s.selectnum() == 1) {
				int rNum1 = rd.nextInt(19) + 1;
				System.out.println("Computer picked: " + rNum1);
				if (rNum1 % 2 == 1) {
					System.out.println("You Win!");
					playerScore++;
				}
				if (rNum1 % 2 == 0) {
					System.out.println("You Lose!");
					computerScore++;
				}
			}

			if (s.selectnum() == 2) {
				int rNum2 = rd.nextInt(19) + 1;
				System.out.println("Computer picked: " + rNum2);
				if (rNum2 % 2 == 1) {
					System.out.println("You Lose!");
					computerScore++;
				}
				if (rNum2 % 2 == 0) {
					System.out.println("You Win!");
					playerScore++;
				}
			}

		}
	}
}
