package hw11UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n---------- default constructor initialized from The parent Class Father -----------");
		Father father1 = new Father();

		System.out.println("\n---------- parameterized constructor initialized from The parent Class Father -----------");
		Father father = new Father("Pronoy Sarker", "Sarker", 2188458, 'M', true);

		System.out.println("\n---------- void type method initialized from The parent Class Father -----------");
		father.father();

		System.out.println("\n---------- parameterized method initialized from The parent Class Father -----------");
		father.fatherInfo("Pronoy Sarker", "Sarker", 2188458, 'M', true);

		System.out.println("\n---------- default constructor initialized from The child Class Daughter -----------");
		Daughter daughter1 = new Daughter();

		System.out.println("\n---------- parameterized constructor initialized from The child Class Daughter -----------");
		Daughter daughter2 = new Daughter("August", 22);

		System.out.println("\n---------- void type method initialized from The child Class Daughter -----------");
		daughter1.daughter();

		System.out.println("\n---------- parameterized method initialized from The child Class Daughter -----------");
		daughter2.daughterInfo("September", 24);

	}
}