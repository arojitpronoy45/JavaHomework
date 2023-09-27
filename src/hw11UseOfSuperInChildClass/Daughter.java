package hw11UseOfSuperInChildClass;

public class Daughter extends Father {

	public String bMonth;
	public int age;

	public Daughter() {

		super.father();
		super.fatherInfo("Lucas Brown", "Sarker", 2188458, 'M', true);

		super.fName = "Brown";

		System.out.println("Family Name? Ans: " + fName);

		System.out.println("This is a default constructor from the Child class Employee");
	}

	public Daughter(String bMonth, int age) {
		// super();

		super.father();
		super.fatherInfo("Liam Wilson", "Wilson", 2188458, 'M', true);
		System.out.println("Family Name? Ans: " + fName + " Birth Month: " + bMonth + " Age: " + age);

		super.fName = "Wilson";
		super.Age = 24;

	}

	public void daughter() {
		System.out.println("This is a void type method from the Parent Class Father");

	}

	public void daughterInfo(String bMonth, int age) {

		this.bMonth = bMonth;
		this.age = age;
		System.out.println("Family Name? Ans: " + fName + " Birth Month: " + bMonth + " Age: " + age);

	}

}
