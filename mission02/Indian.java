package mission02;

import java.util.Scanner;

public class Indian {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("생년월일을 차례대로 입력해주세요.");
			
			int birth = s.nextInt();
			int month = s.nextInt();
			int day = s.nextInt();
			
			if (birth%10 == 0) {
				System.out.println("시끄러운");
			}
			

	}

}
