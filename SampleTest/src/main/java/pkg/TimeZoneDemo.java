package pkg;

import java.util.*;

public class TimeZoneDemo {
	
   public static void main( String args[] ){
       
	   // create time zone object    
	   /** no region found issue TZ  */
	  // TimeZone timezone = TimeZone.getTimeZone("Etc/UCT");
	  // TimeZone timezone = TimeZone.getTimeZone("Etc/Universal");
	  // TimeZone timezone = TimeZone.getTimeZone("Africa/Juba");
	   	//TimeZone timezone = TimeZone.getTimeZone("America/North_Dakota/Beulah");
	  // TimeZone timezone = TimeZone.getTimeZone("Antarctica/Rothera");
	   //TimeZone timezone = TimeZone.getTimeZone("Antarctica/Vostok");
	  // TimeZone timezone = TimeZone.getTimeZone("Pacific/Ponape");
	   //TimeZone timezone = TimeZone.getTimeZone("UCT");
	   //TimeZone timezone = TimeZone.getTimeZone("Zulu");
	   //TimeZone timezone = TimeZone.getTimeZone("Pacific/Pohnpei");
	   //TimeZone timezone = TimeZone.getTimeZone("Pacific/Truk");
	   //TimeZone timezone = TimeZone.getTimeZone("Pacific/Yap");
	  TimeZone timezone = TimeZone.getTimeZone("Universal");
	   
	   
	   
	   
	   
	   
	   /** no data found issue TZ **/ 
	 //  TimeZone timezone = TimeZone.getTimeZone("Etc/GMT 0");
	 //TimeZone timezone = TimeZone.getTimeZone("Etc/GMT 1");
	 //TimeZone timezone = TimeZone.getTimeZone("Etc/GMT 2");
	 //TimeZone timezone = TimeZone.getTimeZone("Etc/GMT 3");
	 //TimeZone timezone = TimeZone.getTimeZone("Etc/GMT 4");
	 //TimeZone timezone = TimeZone.getTimeZone("Etc/GMT 5");
	// TimeZone timezone = TimeZone.getTimeZone("Estados Unidos / Alaska");
	 //TimeZone timezone = TimeZone.getTimeZone("Etc/GMT 7");
	 //TimeZone timezone = TimeZone.getTimeZone("Etc/GMT 8");
	 //TimeZone timezone = TimeZone.getTimeZone("Etc/GMT 11");
	 //TimeZone timezone = TimeZone.getTimeZone("Mideast/Riyadh");
	 
	   
	   
	   
/* Mapping working for faulty TZ
 * "Africa/Juba" --:Africa/Asmara
	'08/24/2015 06:30 PM-->2015-08-24T10:30:00
	
 * "Etc/UCT" --Etc/GMT0
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
 * 
 * "Etc/Universal" --Etc/GMT0
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
 * 
 * "America/North_Dakota/Beulah" --America/Bahia_Banderas or America/Chicago
	'08/24/2015 06:30 PM-->2015-08-24T18:30:00
 * 
 * "Antarctica/Rothera" --'America/Araguaina'
	'08/24/2015 06:30 PM-->2015-08-24T16:30:00
	
	"Antarctica/Vostok" --'Asia/Almaty'
	'08/24/2015 06:30 PM-->2015-08-24T07:30:00
	
	"Pacific/Ponape" --'Antarctica/Macquarie'
	'08/24/2015 06:30 PM-->2015-08-24T02:30:00
	
	"Pacific/Pohnpei" --'Antarctica/Macquarie'
	'08/24/2015 06:30 PM-->2015-08-24T02:30:00
	
	"Pacific/Truk" --'Asia/Magadan'
	'08/24/2015 06:30 PM-->2015-08-24T01:30:00
	
	"Pacific/Yap" --'Asia/Magadan'
	'08/24/2015 06:30 PM-->2015-08-24T01:30:00
	
	"Universal" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	

	"UCT" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
 * 	"Zulu" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00

 * ---------------------------------------------------------
 * 
 * 
 * 
 *  "Etc/GMT 0" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
 * 
 * 
 * "Etc/GMT 2" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
	"Etc/GMT 1" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
	"Etc/GMT 3" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
	"Etc/GMT 4" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
	"Etc/GMT 5" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
	"Etc/GMT 7" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
	"Etc/GMT 8" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
	"Etc/GMT 11" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
	"Estados Unidos / Alaska" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
	"Mideast/Riyadh" --'Etc/GMT0'
	'08/24/2015 06:30 PM-->2015-08-24T13:30:00
	
 * */	      
	 
	 
	   // checking offset value for date    
	   System.out.println("time zone name:" +timezone.getDisplayName());
	   System.out.println("time zone getRawOffset:" +timezone.getRawOffset());
	   System.out.println("time zone getClass:" +timezone.getClass());
	  
	   System.out.println("time zone Id:" +timezone.getID());
	   System.out.println("Offset value:" + timezone.getOffset(Calendar.ZONE_OFFSET));
	   
	   for(String s:timezone.getAvailableIDs(timezone.getRawOffset())){
		   System.out.println("time zone getAvailableIDs:" +s);
	   }
   }    
}