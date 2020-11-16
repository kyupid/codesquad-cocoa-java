package mission03moneymanager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class MoneyManager {

	private static Scanner sc = new Scanner(System.in);
	private static int select;

	void selectFunction() {
		System.out.println("\n(1)입력 (2)삭제 (3)수정 (4)월별 데이터 확인 (0)돌아가기 ");
		select = sc.nextInt();

		switch (select) {
		case 1:
			one();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 0:
			zero();
			break;
		default:
			selectFunction();
			break;
		}
	}

	private void zero() {
		User user = new User();
		User.loginStatus = 1;
		user.entrance();
	}

	private void one() {
		System.out.println("날짜(yyyymmdd)를 입력해주세요.");
		int inputDate = sc.nextInt();
		// to-do: yyyymmdd 형식으로만 받도록나중에만들기
		System.out.println("내용을 입력해주세요.");
		String inputComment = sc.next();
		System.out.println("수입 액수를 입력해주세요.");
		int inputIncome = sc.nextInt();
		System.out.println("지출 액수를 입력해주세요.");
		int inputExpense = sc.nextInt();

		
		try (FileWriter fw = new FileWriter("test.txt"); BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(String.valueOf(inputDate) + " ");
			bw.write(inputComment + " ");
			bw.write(String.valueOf(inputIncome + " "));
			bw.write(String.valueOf(inputExpense));
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
