package algorithm.test;

import java.awt.*;

public class Calculator {
	public static void main(String[] args) {
		Frame f = new Frame("Calculator");
		TextField tf = new TextField("0");
		tf.setEditable(false);
		f.setSize(190, 160);
		f.setLocation(300, 300);
		
		f.add("North", tf);
		Panel numPanel = new Panel();
		Button[] numButtons = null; // Button타입의 배열을 생
		numPanel.setLayout(new GridLayout(4, 5, 4, 4)); // numPanel의 Layout을 GridLayout으로 바로 지정
		numPanel.setBackground(Color.lightGray);
		f.add("Center", numPanel); // frame에다가 BorderLayout을써서 Cetner에다가 numPanel을 지정
		
		String numStr[] = { "7", "8", "9", "/", " CE ",
							"4", "5", "6", "*", "BS",
							"1", "2", "3", "-", "1/x",
							"0", "+/-", ".", "+", "=" }; //배열에 numPanel에 넣을거 지정
		numButtons = new Button[numStr.length]; //numStr.length만큼 길이의 numButtons 생성
		for (int i = 0; i < numStr.length; i++) {
			numButtons[i] = new Button(numStr[i]); // for문으로차례대로 numButtons의 String을 지정해줌
			numButtons[i].setForeground(Color.blue); // setForeground는 무슨의미?
			numPanel.add(numButtons[i]); //이것도 이해가안되네 Panel은 그냥 빈공간아니었나? 근데 여기에 add?
		}
		
		f.setVisible(true);
	}
	//[참고] 참고 많은 수의 을 가지고 작업을 해야 하기 때문에 배열과 반복문을 이용하여 코드를 간단히 했다 이렇게
	//하는 것이 Button 의 이름 또는 순서를 바꾸는데 더 용이하다
}