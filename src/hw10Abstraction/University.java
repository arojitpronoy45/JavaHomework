package hw10Abstraction;

public interface University {
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {

	}

	public static void library() {

	}

	// an interface cannot have constructor
	/*
	 * public University() {
 	// Only one keyword is used for the inheritance in interface
 	// An interface cannot inherit a regular class or an abstract class by extends keyword
 	// more than one interface is possible by extends keyword separated by coma
	 * 
	 * 
	 */

}
