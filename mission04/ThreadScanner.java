package mission04;

import java.util.Scanner;

class ThreadScanner extends Thread{

	public void run() {
		Scanner scan = new Scanner(System.in);
		String sc = scan.next();
//		scan.close(); // if scan is closed exceptions occur.
		if (sc != null) {
			Hhmmss.exitClock = true;
		}
	}
}
