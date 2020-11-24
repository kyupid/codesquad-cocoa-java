package example;

import java.awt.*;
import java.awt.event.*;

class CardLayoutEventTest extends Frame {
	Button first, prev, next, last;
	Panel buttons;
	Panel slide;
	Panel card1, card2, card3, card4, card5; // slide에 포함될 Panel들
	CardLayout card;
	
	CardLayoutEventTest (String title) {
		super(title); //조상인 Frame의 생성자 Frame(String title)을 호출 이걸 그대로 가져다쓸거다?
		
		//화면을 담을 Panel을 담는다.
		slide = new Panel();
		card = new CardLayout();
		slide.setLayout(card);
		
		//버튼을 담을 Panel을 담는다.
		buttons = new Panel();
		buttons.setLayout(new FlowLayout());
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
