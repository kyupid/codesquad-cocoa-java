package algorithm.bingo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHandler implements ActionListener {

	
	public void actionPerformed (ActionEvent e) {
		String id = T.tfId.getText();
		String password = T.tfPwd.getText();
		if (!id.equals("kyu")) {
			System.out.println("아이디가 틀렸습니다");
			//id를 다시 입력할수있또록 focus를 다시준
			T.tfId.requestFocus();
			T.tfId.selectAll(); // tfId에 입력된 text가 선택되게 한다.
		}else if (!password.equals("asdf")){
			System.out.println("비밀번호가 틀렸습니다");
			
			//비번을 다시 입력할수있도록 focus를 다시준다
			T.tfPwd.requestFocus();
			T.tfPwd.selectAll();
		}else {
			System.out.println(id + "님이 성공적으로 로그인했습eㅏ");
		}
;	}
	
}
