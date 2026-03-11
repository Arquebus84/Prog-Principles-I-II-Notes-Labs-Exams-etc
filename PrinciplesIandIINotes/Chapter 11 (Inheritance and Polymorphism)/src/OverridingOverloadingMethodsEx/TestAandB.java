package OverridingOverloadingMethodsEx;

public class TestAandB {
	public static void main(String[] args) {
		new B1();
		new B2();
	}
}

class A1 {
	int i = 7;

	public A1() {
		System.out.println("i from A is " + i);
	}

	public void setI(int i) {
		this.i = 2 * i;
	}
}
class B1 extends A1 {
	public B1() {
		setI(20);
	}

	@Override
	public void setI(int i) {
		this.i = 3 * i;
	}
}

class A2 {
	int i = 7;

	public A2() {
		setI(20);
		System.out.println("i from A is " + i);
	}

	public void setI(int i) {
		this.i = 2 * i;
	}
}
class B2 extends A2 {
	public B2() {
	}

	@Override
	public void setI(int i) {
		this.i = 3 * i;
	}
}