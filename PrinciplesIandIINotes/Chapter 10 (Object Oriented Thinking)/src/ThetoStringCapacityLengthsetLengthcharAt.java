
public class ThetoStringCapacityLengthsetLengthcharAt {
	
	//*You can append a String to a StringBuffer even if the resulting new String exceeds the capacity
	
	/**
			java.lang.StringBuilder
		+toString(): String
		+capacity(): int				//Returns the current number of characters the string builder is able to store without 
											increasing its size *(use the length() in order to gain the last character: stringBuilder.length() - 1)
		+charAt(index: int): char
		+length(): int					//*length is always less than or equal to the builder's capacity (Use to gain the last character of the array)
		+setLength(newLength: int): void
		+substring(startIndex: int): String
		+substring(startIndex: int, endIndex: int): String
		+trimToSize(): void				//Used to reduce the capacity to the actual size (used to save memory space in case capacity 
											is too large)
	*/
	
	//Can use StringBuilder(initialCapacity) to create a new StringBuilder with specific number of characters
	
	public static void main(String[] args) {
		StringBuilder stringA = new StringBuilder("25");
		stringA.append("Welcome In!");	//Adds a collection of characters to stringA, but the capacity is to large
		stringA.trimToSize(); //Changes the capacity from 25 to 13
		System.out.println(stringA.capacity()); 
		
		
		StringBuilder stringB = new StringBuilder("Java and C++");
		System.out.println(stringB.charAt(stringB.length() - 1));
			
	}
}
