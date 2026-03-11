package DataFieldEncapsulationTest;

public class LabelTest {
	private String name;
	private boolean active;
	private int quantity;

	public String getName() {
		// write appropriate code here
		return name;
	}

	public boolean setName(String newName) {
		// write appropriate code here
		if (newName != null && newName != "") {
            name = newName;
			return true;
		}else {
			return false;
		}
	}

	public boolean isActive() {
		// write appropriate code here
		return active;
	}

	public void setActive(boolean activity) {
		// write appropriate code here
		active = (activity == false)? false : true;
	}

	public int getQuantity() {
		// write appropriate code here
		return quantity;
	}

	public boolean setQuantity(int newQuantity) {
		// write appropriate code here
		if(newQuantity >= 0){
            quantity = newQuantity;
            return true;
        }else{
            return false;
        }
	}
	
	public static void main(String[] args) {
		LabelTest obj1 = new LabelTest();
		//Check Activity
		System.out.println("\nActivity:");
		obj1.setActive(false);
		System.out.println(obj1.isActive());
		
		//Check name
		System.out.println("\nName:");
		System.out.println(obj1.setName("Hammer"));
		System.out.println(obj1.getName() + "\n");
		
		//Quantity
		System.out.println("\nQuantity:");
		System.out.println(obj1.setQuantity(-2));
		System.out.println(obj1.getQuantity());
		
	}

}
