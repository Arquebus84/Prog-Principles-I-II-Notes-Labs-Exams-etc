package DefaultTests;

public class AppendCharactersToStringSubsequence {

	public static void main(String[] args) {
		
		//System.out.println(prefix("coaching", "coding"));
		prefix("coaching", "coding");
		prefix("abcde", "a");
		prefix("z", "abcde");
		prefix("a", "a");
		prefix("lbg", "g");
		prefix("a", "z");
		prefix("dj", "xnb");
		prefix("rhax", "ln");
	}
	
	public static void prefix(String a, String b) {
		
		int prefixMax = 0;
		int j = 0;
		StringBuilder builder = new StringBuilder();
//		int maxLength = Math.max(a.length(), b.length());
//		String longString = (a.length() > b.length())? a : b;
//		String shortString = (a.length() < b.length())? a : b;
//		for(int c = 0; c < a.length(); c++) {
//			
//			if(c >= b.length() || (a.charAt(c) != b.charAt(c))) {
//				prefixMax = c;
//				break;
//			}else {
//				j++;
//			}
//		}
		int c = 0;
		while(j < b.length() && c < a.length()) {
			if(a.charAt(c) == b.charAt(j)) {
				j++;
				c++;
			}else {
				c++;
			}
		}
		prefixMax = j;
		
		builder.append(a);
		builder.append(b.substring(prefixMax));
		System.out.println(builder.toString());
		System.out.println("index: " + prefixMax + " Substring length: " + (b.length() - j));
	}

}
