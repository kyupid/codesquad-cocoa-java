package personal;

import java.util.Arrays;
import java.util.Scanner;

class Game {
	Scanner scan = new Scanner(System.in); // 마지막에 닫아주기
	String[][] map = new String[11][11];
	private int x = 5;
	private int y = 5;

	void init() {

		for (String[] e : map) {
			Arrays.fill(e, "□  ");
		}

		map[5][5] = "🌚 ";

		for (String[] e : map) {
			for (String e2 : e) {
				System.out.print(e2);
			}
			System.out.println();
		}
	}

	void run() {
		init();
		while (true) { // 조건문 boolean으로 지뢰나 몬스터 만났을때.
			inputWasd();
			movePlayer();
		}
	}

	void inputWasd() {
		char wasd = scan.next().charAt(0);

		switch (wasd) {
		case 'w':
			y -= 1;
			break;
		case 'a':
			x -= 1;
			break;
		case 's':
			y += 1;
			break;
		case 'd':
			x += 1;
			break;
		default:
			run();
			break;

		}
	}

	void movePlayer() {
		for (int i = 0; i < 12; i++) {
			System.out.println();
		}
			
		for (String[] e : map) {
			Arrays.fill(e, "□  ");
		}

		map[y][x] = "🌚 ";

		for (String[] e : map) {
			for (String e2 : e) {
				System.out.print(e2);
			}
			System.out.println();
		}
	}

}
