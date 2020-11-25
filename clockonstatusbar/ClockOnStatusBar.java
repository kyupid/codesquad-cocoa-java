package clockonstatusbar;

import java.awt.*;
import java.awt.event.*;

import java.text.SimpleDateFormat;
import java.util.Date;

class ClockOnStatusBar extends Frame{
	
	ClockOnStatusBar(String title) {
		super(title);
		
		setSize(300, 300);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		
		ClockOnStatusBar c = new ClockOnStatusBar("ClockOnStatusBar"); 
	}

}
