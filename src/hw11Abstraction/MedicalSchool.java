package hw11Abstraction;

/*
// An abstract class can inherit only one abstract class or one regular class by extends key word
// An abstract class can't inherit an Interface by extends key word
// implements keyword is used to inherit Interface in abstract class
// an abstract class can inherit more than one Interface
// an abstract class cannot inherit a regular class or abstract class by implements keyword
 */
public abstract class MedicalSchool extends NursingSchool {
	// non-abstract method
	public void anatomyLab() {
		System.out.println("This is an Anatomoy Lab method");

	}

	public abstract void biochemistryLab(); // abstract method

}

// An abstract class can only inherit one abstract class or one regular class
// An abstract class cannot inherit an interface by extends keyword
// only one inheritance is possible in an abstract class