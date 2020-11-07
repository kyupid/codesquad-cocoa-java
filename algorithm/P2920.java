package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class P2920 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[8];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int[] ascending = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] descending = { 8, 7, 6, 5, 4, 3, 2, 1 };
		
		//배열이 동일한지 비교하려면 Arrays.equals를 사용한다
		//모드 배열 형에 대해 사용가능하다.
		//다차원 배열의 동일성을 확인하려면 Arrays.deepEquals를 사용한다
		//메소드를 사용하는것 말고 for문을 이용해 확인할 방법은 없나?
		
		if (Arrays.equals(a, ascending)) {
			System.out.println("ascending");
		}else if(Arrays.equals(a, descending)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		
		
		
		}

	}

