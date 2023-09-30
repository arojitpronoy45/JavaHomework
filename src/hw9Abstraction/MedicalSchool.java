package hw9Abstraction;

public abstract class MedicalSchool {
	// yes we can create a construct inside an Abstract Class
	public MedicalSchool() {

	}

	// non-abstract method
	public void anatomyLab() {
		System.out.println("This is an Anatomoy Lab method");

	}

	public abstract void biochemistryLab(); // abstract method

}
