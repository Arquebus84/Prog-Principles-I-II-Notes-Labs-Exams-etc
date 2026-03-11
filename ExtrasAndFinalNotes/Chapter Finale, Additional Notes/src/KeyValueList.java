
public class KeyValueList {
	/**
	 * 		Recall Unicode:
	 * 
	 *  Characters		:	Code Value in Decimal	:	Unicode Value
	 *	 '0' - '9'		:	48 to 57				:	\u0030 to \u0039
	 *	 'A' - 'Z'		:	65 to 90				:	\u0041 to \u005A
	 *	 'a' - 'z'		:	97 to 122 				: 	\u0061 to \u007A
	 * 
	 */

	public static void main(String[] args) {
		String m = "Hello There";	//Need to contract the string in order to remove white spaces
		//Using the hashcode (unique value) use modulo size to find it's key place
		//System.out.println("\"" + m + "\" hash: " + (m.replaceAll("\\s", "")).hashCode() % 10);
		
		MapTest<String, Integer> map = new MapTest<>();
		
		/**With the capacity being 20 Matt and Lillith have the same index (collision)*/
		/**With the capacity being 10 Jacob and Milly have the same index (collision)
		 * 		Matt, Tony, Lillith, and Hope also have the same index*/
		map.insert("Matt"); map.insert("Jacob"); map.insert("Milly"); map.insert("Tony");
		map.insert("Philip"); map.insert("Christian"); map.insert("Lillith"); map.insert("Hope");
		//map.insert("Grace"); map.insert("Steven"); map.insert("Theodore");
		
		map.displayMap();
	}
	
	//	V will be the value returned (represented as integer) and K will be the look-up key (object)
	// Convert the generic value into a hash and then find the hash value
	private static class MapTest<K, V>{
		V value;
		K key;
		static int capacity = 10;
		int size;
		K[] list;
		
		public MapTest() {
			this(capacity);
		}
		public MapTest(int size) {
			list = (K[])(new Object[size]);
		}
		
		public void insert(K key) {			//public void insert(K key, V value) {
			if(size == Size()) {
				System.out.println("Reached Maximum Capacity");
				return;
			}
			
			int hashValue = Math.abs(key.hashCode()%Size());
			System.out.print(hashValue + " ");
			if(list[hashValue] != null) {						//Check the collision (two hashCodes are the same)
				while(hashValue < list.length && list[hashValue] != null) {
					if(hashValue == list.length-1) {			// If the hash equals the index of the last element, Move to first element
						//System.out.println("Moved to start");
						insertFromStart(key);
						return;					//Return out of the method when this occurs
					}
					hashValue++;
				}
				list[hashValue] = key;
			}else {
				list[hashValue] = key;
			}
			size++;
		}
		
		public void insertFromStart(K key) {
			int start = 0;
			while(list[start] != null) {
				start++;
			}
			list[start] = key;
			return;
		}
		
		public int Size() {
			return list.length;
		}
		
		public void displayMap() {
			System.out.println();
			for(int i = 0; i < list.length; i++) {
				System.out.print(list[i] + " ");
			}
		}
	}
	
	private static class Key<K>{	// The Key object will have a value, and a reference to the next key object
		K key;
		Key nextKeyAddress;
		
		public Key(K key) {
			this.key = key;
		}
	}
}
