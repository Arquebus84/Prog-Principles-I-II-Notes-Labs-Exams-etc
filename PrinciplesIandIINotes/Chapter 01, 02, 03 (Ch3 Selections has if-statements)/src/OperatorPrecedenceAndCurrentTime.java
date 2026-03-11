
public class OperatorPrecedenceAndCurrentTime {

	public static void main(String[] args) {
		//Precedence (Top are first and Bottom are calculated last)
		/**
		 * 		var++, var--
		 * 		+, - (unary plus and minus), ++var, --var (pre-increment and pre-decrement)
		 * 		(type)(Casting) such as (int) 9.4 / 3.6
		 * 		! the not condition
		 * 		*, /, % (multiply, divide, modulo)
		 * 		+, - (binary addition and subtraction)
		 * 		<, <=, >, >= (relational)
		 * 		==, != (equality)
		 * 		^ (exclusive or)
		 * 		&& (and)
		 * 		|| (or)
		 * 		=, +=, -=, *=, /=, %= (assignment operators) 
		 */
		
		double a = 9.4;
		System.out.println((int) (a / 3.6)); //Type casting
		//This is the UNIX epoch time (displays the total milliseconds from jan1, 1970) *Greenwich Mean Time is about 4 hours above Georgia
		System.out.println("UNIX epoch (uncalculated) " + System.currentTimeMillis());
		//Total seconds
		long totalSec = (System.currentTimeMillis() / 1000);
		System.out.println("Total seconds " + totalSec);
		
		//Current second
		long currentSec = (totalSec % 60);
		System.out.println("Current second " + currentSec);
		
		//Total minutes = total seconds / 60
		long totalMin = (totalSec / 60);
		System.out.println("Total minutes " + totalMin);
		
		//Current minute = total minutes % 60
		long currentMin = (int)(totalMin % 60);
		System.out.println("Current minute " + currentMin);
		
		//Total hours = total minutes / 60
		long totalHrs = (int)(totalMin / 60);
		System.out.println("Total hours " + totalHrs);
		
		//Current hour = total hours % 24
		long currentHrs = (int)(totalHrs % 24);
		System.out.println("Current hour " + currentHrs);
	}

}
