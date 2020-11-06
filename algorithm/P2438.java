package algorithm;

import java.util.Scanner;

public class P2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String star = "*";
		
		for ( int i = 1; i <= N; i++ ) {
				
				System.out.println(star);
				star += "*";
				/*
				 * 이전 별갯수의 딱 하나의 별만 추가하면 되니까..
				 * star라는 변수를 사용하지말고 그냥 직접 별을 그려서 붙이면 되겠네
				 */
				
		}
		sc.close();
	}

}
