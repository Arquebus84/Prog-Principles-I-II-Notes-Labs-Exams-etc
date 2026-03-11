import java.util.*;
public class GregorianCalendarClass {
	//GregorianCalendar is concrete subclass of abstract Calendar class
	
	/**
			java.util.Calendar
		#Calendar()
		+get(field: int): int
		+set(field: int, value: int): void
		+set(year: int, month: int, dayOfMonth: int): void
		+getActualMaximum(field: int): int
		+add(field: int, amount: int): void
		+getTime(): java.util.Date
		+setTime(date: java.util.Date): void		
	 */
	
	//Subclass:
	
	/**
			java.util.GregorianCalendar
		+GregorianCalendar()
		+GregorianCalendar(year: int, month: int, dayOfMonth: int)
		+GregorianCalendar(year: int, month: int, dayOfMonth: int, hour:int, minute: int, second: int)
	 */
	
	//**NOTE for GregorianCalendar month; from 0 to 11 is Jan. to Dec.
	
	//NOTE: These are the field constants in Calendar class:
	/*
		YEAR				* year of calendar
		MONTH				* month of calendar (with 0 for january)
		DATE				* day of calendar
		HOUR				* hour of calendar (12-hr notation)
		HOUR_OF_DAY			* hour of calendar (24-hr notation)
		MINUTE				* minute of calendar
		SECOND				* second of calendar
		DAY_OF_WEEK			* day within the week (1 for Sunday)
		DAY_OF_MONTH		* same as DATE
		DAY_OF_YEAR			* day number in year (1 for first day of the year)
		WEEK_OF_MONTH		* week number within month (1 for first week)
		WEEK_OF_YEAR		* week number within year (1 for first week)
		AM_PM				* indicates AM or PM (0 for AM and 1 for PM)
	 */
	
	public static void main(String[] args) {
		TestCalendar test = new TestCalendar();
		test.getClass();
		
		Calendar[] calendars = new Calendar[10];
		//calendars[0] = new Calendar();			//This is a compile error because Calendar is abstract class
		calendars[1] = new GregorianCalendar();
	}
	
}

class TestCalendar{
	public TestCalendar() {
		// Construct a Gregorian calendar for the current date and time
	    Calendar calendar = new GregorianCalendar();
	    System.out.println("Current time is " + new Date());
	    System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
	    System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
	    System.out.println("DATE: " + calendar.get(Calendar.DATE));
	    System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
	    System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
	    System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
	    System.out.println("SECOND: " +  calendar.get(Calendar.SECOND));
	    System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
	    System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
	    System.out.println("DAY_OF_YEAR: " +  calendar.get(Calendar.DAY_OF_YEAR));
	    System.out.println("WEEK_OF_MONTH: " +  calendar.get(Calendar.WEEK_OF_MONTH));
	    System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
	    System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
	    
	    // Construct a calendar for December 25, 1997
	    Calendar calendar1 = new GregorianCalendar(1997, 11, 25);
	    String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	    System.out.println("December 25, 1997 is a " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
	}
}