package mission03moneymanager;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


class User {

	public void run() {
		login();
	}
	
	private int login() {
		Scanner sc = new Scanner(System.in);
		Map<String, String> user = new HashMap<>();
		user.put("kyu", "1234");
		
		while(true) {
			System.out.println("아이디와 패스워드를 입력해주세요.");
			System.out.print("아이디 >> ");
			String userId = sc.next();
			System.out.print("패스워드 >> ");
			String userPw = sc.next();
			
			if (!user.containsKey(userId)) {
				System.out.println("존재하지 않는 아이디입니다.");
				continue;
			}
			else {
				if (!user.get(userId).equals(userPw)) {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				else {
					System.out.println("접속 성공!");
					return 1;
				}
			}
		}
	}
	

	

}
