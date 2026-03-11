
public class StringDemo {
	public static void main(String[] args) {
		String message = "Hello There!";
		String trimMessage = (message.trim());

		System.out.println(message.length());
		//Returns letter(character) at 1; which is e in Hello
		System.out.println(message.charAt(1));
		
		System.out.println(message.toUpperCase());
		System.out.println(trimMessage);
		
		//Remove white spaces by using the replaceAll method
		String connected = message.replaceAll("\\s", "");	//Regular expression
		System.out.println(connected);
	}
}
