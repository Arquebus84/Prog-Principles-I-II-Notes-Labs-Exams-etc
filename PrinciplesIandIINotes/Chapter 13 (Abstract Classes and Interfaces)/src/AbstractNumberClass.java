import java.util.ArrayList;
import java.math.*;

public class AbstractNumberClass {
//Number is an abstract superclass for numeric wrapper classes, BigInteger, and BigDecimal
	
	/**
			java.lang.Number
		+byteValue(): byte
		+shortValue(): short
		+intValue(): int
		+longValue(): long
		+floatValue(): float
		+doubleValue(): double
		
		//Each of these methods return the primitive data value from Number object
		
Wrapper, BigInteger and BigDecimal classes are subclasses of Number:
	 * Double, Float, Long, Integer, Short, Byte, BigInteger, BigDecimal


	 */
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Number a = new Integer(22);
		//Integer b = new Number(23); **Cannot be done b/c Number is abstract class
		System.out.println(a);
		
		BigDecimal bigD = new BigDecimal("2333333.6666666");	//BigDecimal being instance of Number		
		System.out.println(bigD instanceof Number);			//returns true
		
		System.out.println(bigD.doubleValue());		//Returns the double value from BigDecimal object
		
		numberTest();
	}
	
	//Examples
	@SuppressWarnings({"unused", "removal"})
	public static void numberTest() {
		
		//This class is below this method
		LargestNumber largestNumberTest = new LargestNumber();
		largestNumberTest.getClass();
		
		Number numberRef = new Integer(0);
		//Double doubleRef = (Double)numberRef;		//Runtime ClassCastException occurs with this statement
		
		Number[] numberArray = new Integer[2];
		//numberArray[0] = new Double(1.5);			//Runtime ArrayStoreException occurs
		
		Number x = new Integer(3);
	    System.out.println(x.intValue());
	    //System.out.println(x.compareTo(new Integer(4)));	//x does not have a compareTo method, because Number is abstract class
	}
	
}

//Example with getting the largest number
class LargestNumber {
	public LargestNumber() {
		
		//Create array list of type Number
		ArrayList<Number> list = new ArrayList<>();
		
		list.add(45); // Add an integer
	    list.add(3445.53); // Add a double
	    // Add a BigInteger
	    list.add(new BigInteger("3432323234344343101")); 
	    // Add a BigDecimal
	    list.add(new BigDecimal("2.0909090989091343433344343")); 
	    
	    System.out.println("The largest number is " + getLargestNumber(list));
	}
	
	public Number getLargestNumber(ArrayList<Number> list) {
		if(list == null || list.size() == 0) {
			return 0;
		}
		
		Number number = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(number.doubleValue() < list.get(i).doubleValue()) {
				number = list.get(0);
			}
		}
		
		return number;
	}
}
