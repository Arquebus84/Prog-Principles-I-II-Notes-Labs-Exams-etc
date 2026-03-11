
public class Records {
	//Can use 'record' to simplify coding in order to create a simple object to hold data
	
	record NumberList(String name, int numOfPeople) {};	//Could also place this line in main method
	
	public static void main(String[] args) {
		
		NumberList nList = new NumberList("Lorenzo", 1);
		
		//int t = 34;
		//Object obj = new Object();
		
//		public int getNumOfPeople() {
//			return numOfPeople;
//		}
		
		System.out.println(nList.name());
		System.out.println(nList.numOfPeople());
		
		//Record object with accessor and mutator methods
		record Student(String name) {
			public String getName(){return name; }
			public void setName(String newName) {newName = name; }
		}
	}
	
	
	/**Default Constructor, Compact Constructor, and Additional Constructors*/
	record Teacher(){
		
		public Teacher() {
			
		}
	}
	
	/**Records Restrictions*/
	/*	You can define a record and use a record like a class, except:
	 		* A record cannot extend classes, but can implement an interface
	 		* A record cannot declare instance data fields
	 		* Parameters from the record header are automatically made as final data fields in a record. However, you can still declare
	 			static data fields in a record and you can define instance or static methods in a record
	 		* A record is implicitly final, so you cannot extend a record
	 		* a record can't be abstract
	 */
	

}
