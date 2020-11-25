package clockonstatusbar;

import java.awt.*;
import java.awt.event.*;

import java.util.Date;
import java.text.SimpleDateFormat;


class ClockOnStatusBar {

	public static void main(String[] args) {
		
		
		Frame f = new Frame();
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String clock = sdf.format(now);
		
		f.setVisible(true);
		
		while (true) {
			f.setTitle(clock);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
			}
		}
		
		
		
	}

}
