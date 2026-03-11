package DefaultTests;

import java.util.*;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		
		//Search through string, find repeating characters, store them in HashMap 
//		System.out.println(lengthOf("abcabcbb")+ "\n");
//		System.out.println(lengthOf("bbbb")+ "\n");
		//System.out.println(lengthOf("au")+ "\n");
//		System.out.println(lengthOf("pwwkew")+ "\n");
//		System.out.println(lengthOf("rritrid")+ "\n");

		System.out.println(LengthOfLongest("pwwkew")+ "\n");
	}
	
	public static int lengthOf(String s) {
		HashMap<String, Integer> map = new HashMap<>();
//		HashMap<HashMap<Character, Integer>, Integer> submap = new HashMap<>();
		StringBuilder builder = new StringBuilder();
		int longest = 0, k =0;
		
		if(s.length() == 1) {
			return 1;
		}
		
		for(int a = 0; a < s.length(); a++){//char c : s.toCharArray()) {
			HashMap<Character, Integer> sub = new HashMap<>();
			for(int h = a; h < s.length(); h++) {
				if(!sub.containsKey(s.charAt(h))) {
//					map.put(c, k++);
//					builder.append(c);
					sub.put(s.charAt(h), h);
				}else {
					System.out.println(s.substring(a, h));
					map.put(s.substring(a, h), k++);
					longest = (s.substring(a, h).length() > longest)? s.substring(a, h).length() : longest;
					break;
				}
			}
		}
		
		System.out.println(map.toString());
		
//		System.out.println("Index of substring: " + j);
		System.out.println(builder.toString());
		
		return longest;
	}

	
	//Will be in O(n) time 
	/**The nested while loop will only remove the elements from the Set*/
	public static int LengthOfLongest(String s) {
		HashSet<Character> set = new HashSet<>();
		StringBuilder builder = new StringBuilder();
		int l = 0;
		int longest = 0;
		
		for(int c = 0; c < s.length(); c++) {
//			if(!set.contains(s.charAt(c))) {
//				builder.append(s.charAt(c));
//				set.add(s.charAt(c));
//			}
			
			while(set.contains(s.charAt(c))) {
				set.remove(s.charAt(l));
				builder.replace(0, l, "");
				l++;
			}
			
			int window = (c - l) + 1;
			longest = Math.max(longest, window);
			
			set.add(s.charAt(c));
			builder.append(s.charAt(c));
		}
		
		System.out.println(builder.toString());
		return longest;
	}
}
