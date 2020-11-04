package mission01;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter your first number");
	int n = scanner.nextInt();
	
	System.out.println("Enter your last number");
	int n2 = scanner.nextInt();

	 for (int j = n; j <= n2; j++ ) {
		 for (int i = 1; i < 10; i++ ) {
			 System.out.println(j + " x " + i + " = " + j * i);
		 }
	 }
	 scanner.close();
	}
}
