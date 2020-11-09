package algorithm;

import java.util.Random;
import java.util.Scanner;


public class P2920Messedup {

	public static void main(String[] args) {
		
		
		Random rd = new Random();
		
		int[] dajangjo = new int[8];
		
		for ( int i = 0; i < 8; i++ ) {
			dajangjo[i] = rd.nextInt(8);
			
			//Check for duplicate numbers
			for ( int j = 0; j < i; j++ ) {
				if ( dajangjo[j] == dajangjo[i]) {
					i--;
					break;
				}
			}
	
		}
		//잘 나오는지 확인
		for ( int intname = 0; intname < 8; intname++ ) {
			System.out.print(dajangjo[intname]);
		}
		System.out.println();
		
		//ascending
		String s = "";
		for ( int k = 0; k < dajangjo.length - 1; k++ ) {
			if ( dajangjo[k] == dajangjo[k + 1] - 1) {
				s = "ascending";
			}
			else if ( dajangjo[k] == dajangjo[k + 1] + 1 ) {
				s = "descending";
			}
			else {
				s = "mixed";
				break;
			}System.out.println(s);
		}
		
		
	
	
	}
}

		
		/*
		 * 숫자 8개를 랜덤으로 입력받아야한다.
		 * 1. 길이가 8인 배열을 생성한다
		 * 2. 그 배열 안에 랜덤으로 숫자를 차례대로 집어넣는다. 어떻게 랜덤으로 숫자를 나오게 하지?!! -> 랜덤클래
		 * 3. 인덱스 0부터 7까지 차례대로 어떤 순서로 나왔는지 판별하고
		 * 		문제에서 요구하는대로 ascending, descending or mixed를 출력한다. 
		 */
		
		/*
		 * 랜덤 클래스에서 나온 숫자를 for문에 의해 dajangjo의 0번인덱스부터 7번인덱스까지 차례대로 넣는다.
		 * 아 근데 숫자는 한번씩만 나와야하는데...어떻게 해결하지? -> 셋클래스, for문
		 * 마지막 for문으로 겹치는 숫자가 있는지 검사했음 일단 겹치지 않는 숫자 8개가 배열에 담겼
		 */
			
			

	


