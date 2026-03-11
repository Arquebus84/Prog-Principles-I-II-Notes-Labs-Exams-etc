import java.util.Scanner;
public class AngleOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//NOTE: the Math class does not need to be imported because it is in the java.lang package, which is automatically imported
		
		//Remember the law of cosines: c^2 = a^2 + b^2 -2ab(cos(C))
		//to compute the angle, use inverse cosine: C = arccos((a^2 + b^2 - c^2) / (2ab))
		//Remember that in java, arccosine() is acos()
		
		//Enter the 3 coordinate points (x,y)
		System.out.println("Enter 3 points on a coordinate plane (x,y)");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		//compute the three sides; use the distance formula to compute the distance between each points:
		//Distance = sqrt[(x2 - x1)^2 + (y2 - y1)^2]
		double a = Math.sqrt((y2 - y3) * (y2 - y3) + (x2 - x3) * (x2 - x3));
		double b = Math.sqrt((y1 - y3) * (y1 - y3) + (x1 - x3) * (x1 - x3));
		double c = Math.sqrt((y1 - y2) * (y1 - y2) + (x1 - x2) * (x1 - x2));
		
		//compute angle of the sides with law of cosine: (REMEMBER: it is set to radians; convert it to degrees)
		double A = Math.toDegrees(Math.acos((c * c + b * b - a * a) / (2 * c * b)));
		double B = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
		double C = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
		
		//Display the calculation:
		System.out.print("The three angles are: " + Math.round(A * 100) / 100.0 + 
				"\n" + Math.round(B * 100) / 100.0 + "\n" + Math.round(C * 100) / 100.0);
		
		input.close();
	}
}
