package hw12Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {

	// default constructor
	public NursingSchool() {

	}

	// Non abstract Method
	public void hygiene() {
		System.out.println("This is an Hygiene method");

	}

	public abstract void caring(); // abstract method

}
