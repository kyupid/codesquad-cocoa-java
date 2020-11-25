package clockonstatusbar;

import java.text.SimpleDateFormat;
import java.util.Date;

class Clock {
	String clock() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String clock = sdf.format(now);
		return clock;
	}
}