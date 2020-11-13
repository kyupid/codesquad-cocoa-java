package mission03moneymanager;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


class User {
	
	static int loginStatus; 

	void run() {
		login();
		if (loginStatus == 1) {
			System.out.println("\n(1)가계부 들어가기 (2)가계부 요약");
			Scanner sc = new Scanner(System.in);
			int entrance = sc.nextInt();
			
			if (entrance == 1) {
			MoneyManager mm = new MoneyManager();
			mm.selectFunction();
			}
			
			if (entrance == 2) {
				System.out.println("가계부 요약구 현한 것을 이 라인에 입력 ");
			}
			sc.close();
		}
	}
	
	private int login() {
		Scanner sc = new Scanner(System.in);
		Map<String, String> user = new HashMap<>();
		user.put("kyu", "1234");
		
		while(true) {
			System.out.println("\n아이디와 패스워드를 입력해주세요.");
			System.out.print("아이디 >> ");
			String userId = sc.next();
			System.out.print("패스워드 >> ");
			String userPw = sc.next();
			
			if (!user.containsKey(userId)) {
				System.out.println("존재하지 않는 아이디입니다.");
			}
			else {
				if (!user.get(userId).equals(userPw)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				else {
					System.out.println("접속 성공!");
					sc.close();
					return loginStatus = 1;
				}
			}
		}
		}

}
