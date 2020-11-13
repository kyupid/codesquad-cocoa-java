
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

		System.out.println("Hi, " + playerName);
		System.out.println("Let's start the game");
		System.out.println("----------------------");

		while (true) {
			pick();
			bet();
		}
		
	}

	public static void pick() {
		System.out.println("Pick 1. Odd 2. Even");
		pickedNum = s.nextInt();

		r = new Random();
		rNum = r.nextInt(20);

	}

	public static void win() {
		if (pickedNum == 1) {
			System.out.println("Computer picked: " + rNum);

			if (rNum % 2 == 1) {
				System.out.println("You Win!");

			}
		}
	}
	
	public static void lose() {
		if (pickedNum == 2) {
			System.out.println("Computer picked: " + rNum);
		
			if (rNum % 2 == 0) {
				System.out.println("You Win");
			}
		}
	}

	public static void bet() {
		System.out.println("Enter the amount to bet.");
		System.out.println("Maximum bet: " + Math.min(playerMoney, computerMoney));
		betAmount = s.nextInt();

	}

}
