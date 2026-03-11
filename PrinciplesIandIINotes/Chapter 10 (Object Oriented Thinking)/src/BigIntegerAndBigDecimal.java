import java.math.*;

public class BigIntegerAndBigDecimal {
	//BigInteger and BigDecimal classes are immutable
	/**BigInteger and BigDecimal classes can be used to represent integers or decimal numbers of any size and precision*/
	
	//Ex: the numbers need to be defined in quotations
	
	//	BigInteger i1 = new BigInteger("1000000000000");
	//	BigDecimal d1 = new BigDecimal("10000000.00445554");
	
	/**	There is no limit to the precision of BigDecimal object. the divide method may throw an ArithmeticException, if the result 
			cannot be terminated. However, you can use the overloaded: 
				+divide(BigDecimal d, int scale, RoundingMode roundingMode)
			method to specify a scale and rounding mode to avoid this exception; scale is the max number of digits after the decimal point.	
	*/
	//Ex:	
	public static void divideExample() {
		BigDecimal d1 = BigDecimal.valueOf(234444.4455);
		BigDecimal d2 = new BigDecimal("23.44");
		BigDecimal d3 = d1.divide(d2, 3, RoundingMode.HALF_UP); //	d1 / d2
		
		System.out.println("d1 / d2 = " + d3);
	}
	
	//BigInteger.ONE is a constant defined in the BigInteger class; it's the same as BigInteger("1")
	
	
	//Examples	
	public static void main(String[] args) {
		divideExample();
		
		
		BigInteger c = BigInteger.ONE;
		for(int i = 1; i <= 5; i++) {
			c = c.multiply(new BigInteger(i + ""));
			System.out.print(c);
		}
		BigInteger b1 = new BigInteger("2000000");
		//BigInteger bigInt = new BigInteger(234);
		//BigInteger bigInt = BigInteger.valueOf("234");
		BigInteger bigInt = BigInteger.valueOf(234);
		BigInteger a = b1.multiply(bigInt);
		
		System.out.println(a);
		System.out.println(c);
		
		BigInteger b = BigInteger.valueOf(1);
		b = b.multiply(b);
		
		
		BigDecimal d1 = new BigDecimal("2344.3444");
		BigDecimal d2 = new BigDecimal("9875678.5");
		
		BigDecimal d3 = new BigDecimal(22);
		BigDecimal d4 = d1.add(d2);
		BigDecimal d5 = BigDecimal.valueOf(13);		
		d3.add(d4);	//This expression can return a BigDecimal object that is the addition of two objects of BigDecimal type
		
		System.out.println(d3 + "\n" + d5);
		
		divideBig();
	}
	
	public static BigInteger returnBig() {
		return new BigInteger("11111999912345678912345");
	}
	
	public static void divideBig() {
		BigDecimal b1 = new BigDecimal("40000000");
		BigDecimal b2 = new BigDecimal("20000000");
		
		//b1 = b1.divide(b2);
		b1 = b1.divide(b2, 20, RoundingMode.HALF_UP);
		System.out.println(b1);
	}
}
