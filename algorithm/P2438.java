package algorithm;

import java.util.Scanner;

public class P2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String star = "*";
		
		for ( int i = 1; i <= N; i++) {
				
				System.out.println(star);
				star = star.concat(star);
				/*
				 * concat 이라는 문자를 이어붙이는 메소드를 찾았다
				 * 이런식으로 실행해보니까 2의 제곱으로 별이 늘어났다
				 * 이렇게하면 이전에있는 별에 별이 하나 추가된다고 생각했는데
				 * 손코딩을 해보니까 쉽게 내가 틀렸다는 것이 이해갔다.
				 */
				
		}
		sc.close();
	}

}
