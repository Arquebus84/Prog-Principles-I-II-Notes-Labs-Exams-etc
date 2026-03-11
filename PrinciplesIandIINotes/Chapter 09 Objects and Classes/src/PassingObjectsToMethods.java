import java.util.Date;

public class PassingObjectsToMethods {
	//Passing objects to a method is to pass the reference of the object
	
	//Java uses exactly one mode of passing arguments: pass-by-value
	
	/**Like passing an array, passing an object is actually passing the reference of the object. The following passes the myCircle object as an argument
		to the printCircle method
	*/
	/*
		public static void main(String[] args) {
    		// Circle is defined in Listing 9.8
    		Circle myCircle = new Circle(5.0);
    		printCircle(myCircle);
  		}
 
  		public static void printCircle(Circle c) {
    		System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
  		}	
	*/
	/**The object myCircle is passed to c in the printCircle() method; the c references the myCircle object*/
	
	//*How the class PassObject works:
	/**
		Stack												|								|		Heap
															|								|
	Activation record for the printAreas method				|		Pass by Value			|		
	int times: 5				//Connected to n			|	(here is the value 5)		|
	Circle c: reference			//Connected to myCircle		|								|	c and myCircle reference the
	___________________________________________				|								|	Circle object
															|		Pass by Value			|
	Activation record for the main method					|	(here, the value is	the		|
	int n: 5					//Connected to times		| 	reference for the object)	|
	Circle myCircle: reference	//Connected to c			|								|
	*/
		
	/*Check the class PassObject in the PassingObjectsTest package*/
	
	//Examples
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		t1.display();
		t2.display();
	}
}

//Classes
class Test1{	//Test1 is connected to Count (Look down)
	public void display() {
		Count myCount = new Count();
		int times = 0;

		for (int i = 0; i < 100; i++)
			increment(myCount, times);

		System.out.println("myCount.count = " + myCount.count);
		System.out.println("times = " + times);
	}

	public static void increment(Count c, int times) {
		c.count++;
		times++;
	}
}

class Count{
	int count;

	Count(int c) {
		count = c;
	}

	Count() {
		count = 1;
	}
}

class Test2 {	//Test2 is connected to the Date class
	public void display() {
		Date date = new Date(1234567);
		m1(date);
		System.out.print(date.getTime() + " ");

		m2(date);
		System.out.println(date.getTime());
	}

	public static void m1(Date date) {
		date = new Date(7654321);
	}

	public static void m2(Date date) {
		date.setTime(7654321);
	}
}
