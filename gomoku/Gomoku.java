package gomoku;

import java.awt.*;
import java.awt.event.*;


class Gomoku extends Frame implements MouseListener {
	
	final int LINE_NUM = 9; //오목판 줄 수
	final int LINE_WIDTH = 30; //오목판 줄 간격
	final int BOARD_SIZE = LINE_WIDTH * (LINE_NUM-1); // 오목판의 크기
	final int STONE_SIZE = (int)(LINE_WIDTH * 0.8); // 돌의 크기
	
	final int X0; // 오목판 시작위치 x좌표
	final int Y0; // 오목판 시작위치 y좌
	
	final int FRAME_WIDTH; // Frame의 폭
	final int FRAME_HEIGHT; // Frame의 높
	
	Image img = null; 
	Graphics gImg = null;
	
	public Gomoku(String title) {
		super(title);
		
		//Event Handler를 등록한다
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent we) {
				System.exit(0);
			}
		});
		
		setVisible(true);
		
		// Inset 은 여백을 주는 
		Insets insets = getInsets(); //화면에 보이기전에는 Insets의 값을 얻을수없다
		
		// 오목판 그려질 위치 (LEFT, TOP)의 좌표 X0, Y0를 지정한다.
		X0 = insets.left + LINE_WIDTH;
		Y0 = insets.top + LINE_WIDTH;
		
		// Frame의 크기를 계산한다.
		FRAME_WIDTH = BOARD_SIZE + LINE_WIDTH*2 + insets.left + insets.right;
		FRAME_HEIGHT = BOARD_SIZE + LINE_WIDTH*2 + insets.top + insets.bottom;
		
		//Frame을 화면의 (100, 100)의 위치에 계산된 크기로 보이게 한다.
		setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
		
		img = createImage (FRAME_WIDTH, FRAME_HEIGHT);
		gImg = img.getGraphics();
		
		setResizable(false);
		drawBoard(gImg);
	} // Gomoku (String title)
	
	public void drawBoard (Graphics g) {
		for(int i = 0; i<  LINE_NUM; i++) { //대충 오목판그리는 코드
			g.drawLine(X0, Y0 + i*LINE_WIDTH, X0+BOARD_SIZE, Y0+i*LINE_WIDTH);
			g.drawLine(X0+i*LINE_WIDTH, Y0, X0+i*LINE_WIDTH, Y0+BOARD_SIZE);
		}
	}
	
	public void paint (Graphics g) {
		if(img == null) return;
		
		g.drawImage(img, 0, 0, this); //가상화면에그려진 그림을 Frame에 복사
	}
	
	public void mousePressed(MouseEvent e) { //Mouse Listener
		int x = e.getX(); //마우스 포인터의 x좌표
		int y = e.getY(); // 마우스 포인터의 y좌표
		/*
		(1) . 아래의 로직에 맞게 코드를 작성하시오
		1. x y . 와 의 값이 오목판의 밖을 벗어난 곳이면 돌을 그리지 않는다
		2. x y .( ) 와 의 값을 클릭한 곳에서 가장 가까운 교차점으로 변경한다 반올림
		3. x y (STONE_SIZE) . 와 의 값에서 돌의 크기 의 절반을 빼야 클릭한 곳에 돌이 그려진다
		4. , (x,y) 눌러진 버튼이 마우스 왼쪽 버튼이면 의 위치에 검은 돌을 그리고
		눌러진 버튼이 마우스 오른쪽 버튼이면 의 위치에 흰 돌을 그린다 , (x,y) .
		( .) 흰 돌을 그릴 때 검은 색 테두리도 같이 그린다
		5. repaint() . 를 호출한다
		*/
		
	
		// 1. if x and y don't cross the line
		if ( X0 <= x && x <= X0 + BOARD_SIZE && Y0 <= y && y <= Y0 + BOARD_SIZE ) {
			
			// 2. x and y is changed to the closest intersection.
			if (x % LINE_WIDTH != 0) {
				x = (int)(Math.round((double)(x)/10) * 10);
				if ( x % LINE_WIDTH != 0 ) {
					x = x + 10;
					if (x % LINE_WIDTH != 0 ) {
						x = x - 20;
					}
				}
			}
			if (y % LINE_WIDTH != 0) {
				y = (int)(Math.round((double)(y)/10) * 10);
				if ( y % LINE_WIDTH != 0 ) {
					y = y + 10;
					if (y % LINE_WIDTH != 0 ) {
						y = y - 20;
					}
				}
			}
			System.out.println("test2 " + "x:" + x + "y:" + y);
			
			// 3. It draws the stone.
			gImg.setColor(Color.white);
			gImg.fillOval(x - STONE_SIZE/2, y - STONE_SIZE/2, STONE_SIZE, STONE_SIZE);
			
			
			//4. 
			if(e.getModifiers() == e.BUTTON3_MASK) {
				gImg.setColor(Color.black);
				gImg.fillOval(x - STONE_SIZE/2, y - STONE_SIZE/2, STONE_SIZE, STONE_SIZE);

			}
		}else {
			return;
		}
		repaint();
	}
	
	public void mouseClicked(MouseEvent e) {} // MouseListener
	public void mouseEntered(MouseEvent e) {} // MouseListener
	public void mouseExited(MouseEvent e) {} // MouseListener
	public void mouseReleased(MouseEvent e) {} // MouseListener
	

	public static void main(String[] args) {
		new Gomoku("Omok Test");
	}

}
