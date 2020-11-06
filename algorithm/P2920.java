package algorithm;

import java.util.Scanner;

public class P2920 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[8];
		
		//for문으로 배열에 standard input
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int[] ascending = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] decending = { 8, 7, 6, 5, 4, 3, 2, 1 };
		
		for (int i2 = 0; i2 < a.length; i2++) {
			if (a[i2] == ascending[i2]) {
				if (a[7] == ascending[7]) {
					System.out.println("ascending");
					break;
				}
				continue;
			}else{
				System.out.println("mixed");
			}
		}
		
		for (int i3 = 0; i3 < a.length; i3++) {
			if (a[i3] == decending[i3]) {
				if (a[7] == decending[7]) {
					System.out.println("decending");
				}
				continue;
		}
		
		}

	}
}
