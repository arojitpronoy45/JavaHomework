package hw12Abstraction;

public interface University extends College, Hospital {
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
	 * Yes, an interface can inherit other interfaces 
	 * an interface cannot be inherited by a regular or abstract class by extends key
	 * word // More than one inheritance is possible
	 * 
	 * 
	 */

}
