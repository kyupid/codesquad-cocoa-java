package algorithm;

import java.util.Scanner;

public class P1000 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// A와 B는 0과 10사이이다. 라는 조건문을 줬음
		if  ( 0 < A && 0 < B && A < 10 && B < 10 ) {
			
			System.out.println(A + B);
			
		}
	}

}
