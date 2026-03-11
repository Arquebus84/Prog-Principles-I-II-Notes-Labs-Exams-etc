
public class PrintSeriesOnNewLines {

	public static void main(String[] args) {
		/**Technique on printing a list of characters per line with i being incremented by 1 if((i % CONSTANTNUMBER) == 0), then print a number on a new line*/
		
		final int PER_LINE = 10;
		for(int i = 1; i <= 50; i++) {
			if(i % PER_LINE == 0) {
				System.out.println(i + "\t ");
			}else {
				System.out.print(i + "\t ");
			}
		}
	}

}
