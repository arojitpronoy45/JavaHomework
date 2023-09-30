package hw11Abstraction;

public class ColumbiaUniversity {
	public void chemistry() {
		System.out.println("This is a Chemistry method");
	}
	// we cannot call an abstract class inside a regular class
	/*
	 * public abstract void biology();
	 */

	// default constructor
	public ColumbiaUniversity() {

	}
}

// Yes, a regular class can inherit another abstract class or regular class by extends keyword
// A regular class cannot inherit an interface by extends keyword
// One inheritance is possible by a regular class