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
		
		first = new Button("<<");
		prev = new Button("<");
		next = new Button(">");
		last = new Button(">>");
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		

		//버튼에 이벤트 리스너를 추가한
		first.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				//CardLayout의 첫번째 slide (Panel)이 보이도록 한다
				card.first(slide);
			}
		});
		prev.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				//CardLayout의 첫번째 slide (Panel)이 보이도록 한다
				card.previous(slide);
			}
		});
		next.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				//CardLayout의 첫번째 slide (Panel)이 보이도록 한다
				card.next(slide);
			}
		});
		last.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				//CardLayout의 첫번째 slide (Panel)이 보이도록 한다
				card.last(slide);
			}
		});
		
		card1 = new Panel();
		card1.setBackground(Color.gray);
		card1.add(new Label("This is a first page."));
		card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("This is a second page"));
		card3 = new Panel();
		card3.setBackground(Color.blue);
		card3.add(new Label("This is a third page"));
		card4 = new Panel();
		card4.setBackground(Color.cyan);
		card4.add(new Label("This is a fourth page"));
		card5 = new Panel();
		card5.setBackground(Color.pink);
		card5.add(new Label("This is a fifth page"));
		
		
	}
	
	public static void main(String[] args) {
		CardLayoutEventTest a = new CardLayoutEventTest("CardLayoutEventTest");

	}

}
