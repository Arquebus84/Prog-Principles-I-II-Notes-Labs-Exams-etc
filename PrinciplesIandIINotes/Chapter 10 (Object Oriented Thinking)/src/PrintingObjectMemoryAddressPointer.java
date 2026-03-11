
public class PrintingObjectMemoryAddressPointer {

	public static void main(String[] args) {
		ObjectEx obj = new ObjectEx();

		System.out.println(obj);			//Prints out the objectName as toString ObjectEx@372f7a8d
		System.out.println(obj.hashCode());		//Prints out the address: 925858445
	}

}

class ObjectEx{
	public ObjectEx() {
		
	}
}