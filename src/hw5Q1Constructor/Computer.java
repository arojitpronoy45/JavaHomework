package hw5Q1Constructor;

public class Computer {

	public String brandName;
	public String model;
	public String operatingSytem;
	public int computerPrice;
	public char Grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from the default Constructor of Computer class");
	}

	public Computer(String brandName, String Model, String operatingSystem, int computerPrice, char Grade,
			boolean madeInUSA) {
		this.brandName = brandName;
		this.model = Model;
		this.operatingSytem = operatingSystem;
		this.computerPrice = computerPrice;
		this.Grade = Grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brandName + ", Model: " + model + ", Operating System: " + operatingSystem
				+ ", Price: $" + computerPrice + ", Grade: " + Grade + " and Made in the USA? Ans: " + madeInUSA);

	}

}
