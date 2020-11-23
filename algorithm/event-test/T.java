package algorithm.bingo;


import java.awt.*;
import java.awt.event.*;

class T extends Frame {

	Label lid;
	Label lpwd;
	static TextField tfId;
	static TextField tfPwd;
	static Button ok;
	
	T(String title) {
		super(title); // Frame(String title)을 호출한다
		
		lid = new Label ("ID :", Label.RIGHT); // 
		lpwd = new Label ("Password :", Label.RIGHT);
		
		//약 10개의 글자를 입력할수있는 TextField 형
		tfId = new TextField(10);  //TextField에 작성하는 글자수를 제한하는게 아닌듯함
		tfPwd = new TextField(10); // 실제로받는 값이 10개이하??
		tfPwd.setEchoChar('*'); // 입력 값 대신 '*'가 보이도록 한다
		
		ok = new Button("OK");
		//OK버튼과 TextField의 이벤트처리를 위한 Listener를 추가해준다
		
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout()); //LayoutManager 를 FlowLayout으로
		add(lid); //Frame을 상속받았기때문에 .을 안붙여도 add메소드를 통해 Component들을 Frame에포함시킬수있
		add(tfId);
		add(lpwd);
		add(tfPwd);
		add(ok);
		setSize(450, 65);
		setVisible(true); // Frame이 화면에 보이게한
	}
	
}
