package algorithm;

import java.awt.*;

public class bingo55 {

	public static void main(String[] args) {

		Frame f = new Frame("Bingo");
		f.setSize(500, 500);
		f.setLayout(new GridLayout(5, 5));
		
		String[] numStr = {"참새", "두루미", "황새", "비둘기", "까오기",
				"오리", "타조", "부엉이", "올빼미", "뱁새", "꿩", "닭",
				"구관조", "잉꼬", "매", "거위", "독수리", "콘돌", "봉황",
				"공작", "까치", "까마귀", "앵무새", "꾀꼬리", "고니"};
		
		Button[] b = null;
		b = new Button[numStr.length]; //b의 길이를 만들어주고
		for (int i = 0; i < numStr.length; i++) {
			b[i] = new Button(numStr[i]);
			f.add(b[i]);
		}
		
		
		
		
		
		f.setResizable(false);
		f.setVisible(true);

	}
}
