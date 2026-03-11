package OverridingOverloadingMethodsEx;

public class OverrideToString {

	public static void main(String[] args) {
		Overrider B = new Overrider();
		System.out.println(B.toString());
	}
}

class Reference{
	
	public String toString() {
		return "Message this!";
	}
}

class Overrider extends Reference{
	String extra = "Don't message this!";
	
	@Override
	public String toString() {
		return extra;
	}
}
