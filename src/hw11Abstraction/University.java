package hw11Abstraction;

/*
 * //An Interface can inherit more than one Interface (separated by comma) by extends keyword
//An Interface can't inherit a regular class or an abstract class by extends keyword
//implements keyword can't be used for inheritance inside Interface
*/
public interface University extends College {
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {

	}

	public static void library() {

	}

	// an interface cannot have constructor
	/*
	 * public University() { Yes, an interface can inherit other interfaces an
	 * interface cannot be inherited by a regular or abstract class by extends key
	 * word // More than one inheritance is possible
	 * 
	 * 
	 */

}
