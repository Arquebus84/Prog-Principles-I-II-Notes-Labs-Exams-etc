//import java.lang.Number.*;
public class RationalClass {
	//Rational class is used for representing and processing rational numbers
	
	
	/**
		[java.lang.Number]__________________________
													|
												[Rational]
		[		<<interface>>			]_ _ _ _ _ _|
		[java.lang.Compareable<Rational>]
	 */
	

	//Subclass of java.lang.Number
	/**
			Rational
		-numerator: long
		-denominator: long
		+Rational()
		+Rational(numerator: long, denominator: long)
		+getNumerator(): long
		+getDenominator(): long
		+add(secondRational: Rational): Rational
		+subtract(secondRational: Rational): Rational
		+multiply(secondRational: Rational): Rational
		+divide(secondRational: Rational): Rational
		+toString(): String
		-gcd(n: long, d: long): long				//Method is private since it's only for internal use of Rational class
	 */
	
	
	public static void main(String[] args) {
		//Rational a = new Rational(2, 4);
	}

}
