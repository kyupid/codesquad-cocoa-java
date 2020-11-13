
//테스트입니다
package mission03refactoring;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private static Random r;
	private static Scanner s;
	private static String playerName;
	private static int rNum;
	private static int playerMoney = 100;
	private static int computerMoney = 120;
	private static int pickedNum;
	private static int betAmount;

	public static void start() {
		System.out.println("Name?");
		s = new Scanner(System.in);
		playerName = s.next();

		System.out.println("\nHi, " + playerName);
		System.out.println("Let's start the game");
		System.out.println("----------------------");

		while (true) {
			pick();
		}

	}

	private static void pick() {
		int i = 0;
		i++;
		System.out.println("턴"+i);
		System.out.println("\nPick 1. Odd 2. Even");
		pickedNum = s.nextInt();
		createRNum();
		bet();

		if (pickedNum == 1) {
			System.out.println("\nComputer picked: " + rNum);
			if (rNum % 2 == 1) {
				System.out.println("You Win");
			}
			if (rNum % 2 == 0) {
				System.out.println("You Lose");
			}
		
		if (pickedNum == 2) {
			System.out.println("\nComputer picked: " + rNum);
			if (rNum % 2 == 1) {
				System.out.println("You Lose");
			}
			if (rNum % 2 == 0) {
				System.out.println("You Win");
			} 
		}
		}
	}

	private static void createRNum() {

		r = new Random();
		rNum = r.nextInt(20);
		System.out.println("테스트" + rNum); // 테스트용

	}

	private static void bet() {
		System.out.println("\nEnter the amount to bet.");
		System.out.println("Maximum bet: " + Math.min(playerMoney, computerMoney));
		betAmount = s.nextInt();

	}
}
