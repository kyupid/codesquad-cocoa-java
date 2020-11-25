package clockonstatusbar;

import java.awt.*;
import java.awt.event.*;

import java.util.Date;
import java.text.SimpleDateFormat;


class ClockOnStatusBar {

	public static void main(String[] args) {
		
		
		Frame f = new Frame();
		f.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				Date now = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				String clock = sdf.format(now);
				while (true) {
					f.setTitle(clock);
					try {
						Thread.sleep(1000);
					}catch (Exception ex) {
					}
				}
			}
			
		});
		f.setVisible(true);
		
		
		
		
		
	}

}
