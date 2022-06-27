package SampleProject1.SampleProject1;

public class SubClass extends SuperClass {

	void function() {
		System.out.println("SubClass Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass overrides = new SubClass();
		overrides.function();
		SuperClass overrides2 = new SuperClass();
		overrides2.function();

	}

}
