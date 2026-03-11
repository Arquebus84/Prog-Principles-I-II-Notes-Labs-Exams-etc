import java.util.Scanner;

public class RedoAssign03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//x is between a and b means a<x<b
		//However, in this case, using these boundaries on Math.random(), it means that a<=x<=b
		//By default, if you type (int)(Math.random() * 4); it will randomly generate any integer that is or is between 0 and 3. 4 integers includes 0
		
		/*for(int i = 0; i < 20; i++) {
			//Lower boundary
			int a = 1;
			//Upper boundary
			int b = 10;
			int x = (int)(b * Math.random() + a);
			System.out.println(x);
		}*/
		
		double sandCost = 2.75;
		double bevCost = 0.5;		
		double sandAmount, bevAmount;
		
		System.out.print("Enter the number of beverages: ");
		bevAmount = input.nextInt();		
		
		if(bevAmount == 0) {
			System.out.println("ERROR: A quantity of zero is not allowed.\n");
			System.out.print("Enter the number of beverages: ");
			bevAmount = input.nextInt();		
			System.out.println("Ordered: " + bevAmount + " beverages\n");
		}
		
		System.out.print("Enter the number of sandwiches: ");
		sandAmount = input.nextInt();	
		System.out.println("Ordered: " + sandAmount + " sandwiches\n");
		
		double subTotal = (sandCost * sandAmount) + (bevCost * bevAmount);
		double totalPrice = subTotal * 1.15;
		
		System.out.println((bevAmount == 0 || sandAmount == 0)?"Your order total could not be calculated due to a zero quantity for an" + 
				" item.": "The subtotal of " + bevAmount + " beverages and " + sandAmount + " sandwiches is" +
				" $" + subTotal + ".\nWith tax, the total is $" + totalPrice + "."); 
		
		/*
		if(bevAmount == 0 || sandAmount == 0) {
			System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
		}else {
			System.out.println("The subtotal of " + bevAmount + " beverages and " + sandAmount + " sandwiches is $" + subTotal + ".\nWith tax, the total is $" + totalPrice + ".");
		}	*/					
	}
}
