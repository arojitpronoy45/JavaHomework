package hw4JavaVariables;

public class AboutMe {
	public String myName; // variable declared
	public byte myAge;
	public short myBirthYear;
	public int myYearlySalary;
	public long myDesiredBankBalance;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean usCitizen;

	public AboutMe() {
		// constructor initialized
		System.out.println(":------------ This is all about Myself ------------:");

	}

	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Birthyear: " + myBirthYear
				+ "\nM Yearly Salary: " + myYearlySalary + "\nMy Desired Bank Balance: " + myDesiredBankBalance
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nMy Gender: " + myGender + "\nUS Citizen: "
				+ usCitizen);
	}
}
