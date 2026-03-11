
public class Generics {

	/**If you have a class that needs to print out a specific data type (Integer), then you would
	 * 		create a class that would do that (look and IntegerPrinter class)
	 * 
	 * 	Generics are used to make the type of data type to print to be more dynamic
	 * 		* First define a type parameter by using inequality operators <>	and then
	 * 			write the type parameter in-between them:	<T>
	 * 		* Use T as the standard conventional letter for type
	 * 		* The T (type parameter) represents the type of thing that the Printer class
	 * 			will be able to hold and print; which will be type T
	 * 
	 * 		* Gives ability to create printers for ANY data type
	 * 		* Printer class is a generic printer for any type we want.
	 */
	
	public static void main(String[] args) {
		// Test1 printing Integer
		IntegerPrinter printer = new IntegerPrinter(24);
		System.out.println(printer.toString());

		// Test2 generic Printer class
		//Generic type T will be replaced with Double in order to print out the value of that data type
		Printer<Double> doublePrinter = new Printer<>(44.8);	
		System.out.println(doublePrinter.toString());
		
		// Test 3 print anything of generic type
		Integer intA = 6;
		printType(intA);
		
		//Test 4, more than one generic type (at very bottom)
		Extras<String, Integer> extraWords = new Extras("List Size:", 24);
		System.out.println(extraWords.toString());
	}
	
	// Method for printing a generic type T by first defining parameter type before void 
	//		(similar to doing public static int)
	public static <T> void printType(T thing2Print) {
		System.out.println(thing2Print + "");
	}

}

class IntegerPrinter{
	Integer int2Print;
	
	public IntegerPrinter(Integer int2Print) {	//Modified constructor
		this.int2Print = int2Print;
	}
	
	public Integer getInteger() {
		return int2Print;
	}
	
	@Override
	public String toString() {
		return String.format("%d", getInteger());
	}
}

//Printer class with generic type T
class Printer<T>{
	T type2Print;		//Use to define what type it could be
	
	public Printer(T type2Print) {
		this.type2Print = type2Print;
	}
	
	public T getType() {
		return type2Print;
	}
	
	@Override
	public String toString() {
		return String.format(getType() + "");
	}
}

class Extras<T, E>{
	T type1;
	E type2;
	public Extras(T t, E e) {
		this.type1 = t;
		this.type2 = e;
	}
	
	@Override
	public String toString() {
		return String.format("Type1 value: " + this.type1 + "%nType2 Value: " + this.type2);
	}
}