package hw9Abstraction;

public abstract class NursingSchool {

	// default constructor
	public NursingSchool() {

	}

	// Non abstract Method
	public void hygiene() {
		System.out.println("This is an Hygiene method");

	}

	public abstract void caring(); // abstract method

}
