package clockonstatusbar;

import java.awt.*;
import java.awt.event.*;


class ClockOnStatusBar extends Frame{
	
	ClockOnStatusBar(String title) {
		super(title);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	


	public static void main(String[] args) {
		
		Clock ck = new Clock();
		ClockOnStatusBar c = new ClockOnStatusBar(ck.clock()); 
	}

}
