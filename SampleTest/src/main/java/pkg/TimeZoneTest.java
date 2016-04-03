package pkg;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

import org.joda.time.DateTimeZone;


public class TimeZoneTest {

	public TimeZoneTest() {
		// TODO Auto-generated constructor stub
	}
	public static final List<String> unsupportedTimezones = Arrays.asList("SystemV/HST10",
			"SystemV/YST9",
			"SystemV/YST9YDT",
			"SystemV/PST8",
			"SystemV/PST8PDT",
			"SystemV/MST7",
			"SystemV/MST7MDT",
			"SystemV/CST6",
			"SystemV/CST6CDT",
			"SystemV/EST5",
			"SystemV/EST5EDT",
			"SystemV/AST4",
			"SystemV/AST4ADT",
			"Asia/Riyadh87",
			"Asia/Riyadh88",
			"Asia/Riyadh89",
			"Mideast/Riyadh87",
			"Mideast/Riyadh88",
			"Mideast/Riyadh89"//,
			/*"Antarctica/Troll",
			"Asia/Chita",
			"Asia/Srednekolymsk",
			"Pacific/Bougainville"*/);
	
	/* CST6CDT~EST5EDT~PST8PDT~MST7MDT~SystemV/AST4ADT~SystemV/CST6CDT~SystemV/EST5EDT~SystemV/MST7MDT~SystemV/PST8PDT~SystemV/YST9YDT~Asia/Calcutta **/
	
	public static void main(String[] args) {
		//String tzString = "AKDT"; // not working
		//String tzString = "SGT";
		//String tzString = "CEST";
		//String tzString = "EEST";
		//String tzString = "AKST";
		//String tzString = "MYT";
		//String tzString = "IST";
		//String tzString = "SGT";
		String tzString = "CNT";
		//String tzString = "BET";
				
		TimeZone tz1 = TimeZone.getTimeZone(tzString);
		
		
		
		System.out.println("tz1=" + tz1 + ":::" + DateTimeZone.forTimeZone(tz1).getID());
		System.out.println("=====================");
		
		//-----
//		try {
//			DateTimeZone dtz = DateTimeZone.forID(tzString);
//			System.out.println("dtz=" + dtz);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			DateTimeZone dtz1 = DateTimeZone.forID(DateTimeZone.forTimeZone(tz1).getID());
//			System.out.println("dtz1=" + dtz1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		for (final String tz : TimeZone.getAvailableIDs()) {
			if(!unsupportedTimezones.contains(tz)){
				TimeZone jTimeZone = TimeZone.getTimeZone(tz);
				System.out.println(tz + ":::" + DateTimeZone.forTimeZone(jTimeZone).getID());
			}
        }
		
		
		
	}

}
