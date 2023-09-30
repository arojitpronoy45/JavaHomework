package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("-------Sister-------");
		Sister sister = new Sister();
		sister.sister("17", 18, 19);
		sister.sister(1, 2, "3", 4, 5);
		sister.sister(5, "6", 7, 8, 9);
		Sister.sister(10, "13", 14, 15);
		sister.sister(14, "24", 13, 55, "244");

		System.out.println("-------Niece-------");
		Niece niece = new Niece();
		niece.sister("17", 18, 19);
		niece.sister(1, 2, "3", 4, 5);
		niece.sister(5, "6", 7, 8, 9);

	}

}
