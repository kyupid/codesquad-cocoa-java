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
	
class Clock {
	String Clock() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String clock = sdf.format(now);
		return clock;
	}
}

	public static void main(String[] args) {
		
		//not working
		ClockOnStatusBar c = new ClockOnStatusBar(new Clock()); 
	}

}
