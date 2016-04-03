package pkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;



public class TestTimeZoneConversion {

	public TestTimeZoneConversion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		
		//SGT,IST,CEST,EEST,AKST,MYT,AKDT,MYT,ICT,GST,SAST,HKT,ICT,
		
		String dtAKDT="09/19/2013 11:00 AM AKDT";//matching
												//in DB   19-APR-12 09.00.00.000000000 PM EST
												//in Java  04/20/2012 13:00 PM EST
		/*---------conversion using crs time zone----
		date before conversion is: 09/19/2013 02:00 AM AKDT
		date after conversion is : 09/19/2013 02:00 AM AKDT

		--WITH GMT
		date before conversion is: 09/19/2013 02:00 AM AKDT
		date after conversion is : 09/19/2013 10:00 AM +00:00
		
		*/
 
		String dtSGT="04/20/2012 10:00 AM SGT";//matching
												//in DB   19-APR-12 09.00.00.000000000 PM EST
												//in Java 04/19/2012 21:00 PM EST

		String dtCEST="04/20/2012 10:00 AM CEST";//not matching
												//in DB   20-APR-12 04.00.00.000000000 AM EST
												//in Java 04/20/2012 03:00 AM EST
		
		
		String dtEEST="04/02/2012 10:10 PM EEST";//not matching
													//in DB   20-APR-12 03.00.00.000000000 AM EST
													//in Java 04/20/2012 02:00 AM EST
		/*---------conversion using crs time zone----
		date before conversion is: 07/31/2010 04:23 PM EEST
		date after conversion is : 07/31/2010 18:53 PM IST
		--WITH GMT
		date before conversion is: 07/31/2010 04:23 PM EEST
		date after conversion is : 07/31/2010 13:23 PM +00:00
		*/
 
		
		
		String dtAKST="01/02/2013 12:30 AM AKST";//not matching
												//in DB   20-APR-12 01.00.00.000000000 PM EST
												//in Java 04/20/2012 14:00 PM EST
		/*---------conversion using crs time zone----
		date before conversion is: 01/02/2013 11:00 AM AKST
		date after conversion is : 01/02/2013 11:00 AM AKST*/
 
		
		
		String dtMYT="04/20/2012 10:00 AM MYT";//matches 
												//in DB   19-APR-12 09.00.00.000000000 PM EST
												//in Java 4/19/2012 21:00 PM EST
		
		String dtICT="04/20/2012 10:00 AM ICT";//matches 
												//in DB   19-APR-12 10.00.00.000000000 PM EST
												//in Java 04/19/2012 22:00 PM EST
		
		String dtGST="04/20/2012 10:00 AM GST";//not matches 
												//in DB   20-APR-12 02.00.00.000000000 AM EST
												//in Java 04/20/2012 01:00 AM EST
		
		String dtSAST="04/20/2012 10:00 AM SAST";//matches 
												//in DB   20-APR-12 03.00.00.000000000 AM EST
												//in Java 04/20/2012 03:00 AM EST
		
		String dtHKT="04/20/2012 10:00 AM HKT";//matches 
												//in DB   19-APR-12 09.00.00.000000000 PM EST
												//in Java 04/19/2012 21:00 PM EST
		
		String dtIST="04/20/2012 10:00 AM IST";//matches 
												//in DB   19-APR-12 11.30.00.000000000 PM EST
												//in Java 04/19/2012 23:30 PM EST
	
		
		String dtMST="04/20/2012 10:00 AM MST";//not matches 
												//in DB   20-APR-12 10.00.00.000000000 AM EST
												//in Java 04/20/2012 12:00 PM EST
			
		String dateFormat = "MM/dd/yyyy kk:mm aaa z";
		System.out.println("date before conversion is: "+dtEEST);
		
		
		String[] dateTimeArray = dtEEST.split(" ");
		String tzString = dateTimeArray[dateTimeArray.length - 1];
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm aa z");
		formatter.setTimeZone(TimeZone.getTimeZone(tzString));
		String finaldate =getDateInUserTimeZoneAndFormat(formatter.parse(dtEEST), "Asia/Istanbul",dateFormat);
		
		System.out.println("date after conversion is : "+finaldate);
	

	}

	 public static String getDateInUserTimeZoneAndFormat(Date date, String timezone, String dateFormat) {
		 
		 //convertToString(new DateTime(date), format, timeZone);
		 //return getDateTimeFormatter(format, timeZone).print(dateTime);
		 
		   return DateTimeFormat.forPattern(dateFormat).withZone(timeZoneForID(timezone)).print(new DateTime(date));
	    }
	
	 
	 public static DateTimeZone timeZoneForID(final String timezoneID) {
	        try {
	            return DateTimeZone.forID(timezoneID);
	        } catch (final Exception e) {
	            return DateTimeZone.forTimeZone(TimeZone.getTimeZone(timezoneID));
	        }
	    }
}
