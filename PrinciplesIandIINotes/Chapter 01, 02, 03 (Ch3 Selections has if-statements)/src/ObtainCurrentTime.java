
public class ObtainCurrentTime {
	public static void main(String[] args) {
		//Remember that currentTimeMillis() is returns the total milliseconds since UNIX Epoch (Jan 1, 1970, 12:00 a.m.)
		//It can also be used to calculate the Greenwich Mean Time (GMT)
		//currentTimeMillis is approximately 1203183068328 milliseconds
		long totalMillisSeconds = System.currentTimeMillis();
		long totalSeconds = totalMillisSeconds / 1000; //Returns total seconds (1,000 milliseconds in 1 second)
		long totalMinutes = totalSeconds / 60; //Returns total minutes
		long totalHours = totalMinutes / 60; //Returns total hours
		long totalDays = totalHours / 24;
		long totalWeeks = totalDays / 7;
		long totalMonths = totalWeeks / 3;
		long totalYears = totalMonths / 12;
		
		long currentSecond = totalSeconds % 60; //Returns current second
		long currentMinute = totalMinutes % 60; //Returns current minute
		long currentHour = totalHours % 24 - 5; //Returns current hour
		long currentDay = totalDays % 24 + 2;
		long currentWeek = totalWeeks % 7 - 4;
		long currentMonth = totalMonths % 3 + 9;
		long currentYear = totalYears % 12 + 2017;
		
		System.out.println("Current hour: minute: second is " + (currentHour) + ":" + currentMinute + ":" + currentSecond);		
		System.out.println("The current day: week: month: year is " + currentDay + ":" + currentWeek + ":" + currentMonth + ":" + currentYear);
	}	
}
