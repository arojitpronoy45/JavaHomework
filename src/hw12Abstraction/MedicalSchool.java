package hw12Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	// non-abstract method
	public void anatomyLab() {
		System.out.println("This is an Anatomoy Lab method");

	}

	public abstract void biochemistryLab(); // abstract method

}

// An abstract class can only inherit one abstract class or one regular class
// An abstract class cannot inherit an interface by extends keyword
// only one inheritance is possible in an abstract class