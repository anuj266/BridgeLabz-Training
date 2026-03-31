package extras;

import java.time.ZoneId;
import java.time.*;

public class ZoneDateTime {
	public static void main(String[] args) {
		ZonedDateTime IST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(IST);
		ZonedDateTime PST = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(PST);
		ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println(GMT);
	}
}