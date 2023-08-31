package hw4JavaVariables;

public class AboutMe {
	// variable declared
	public String myName; 
	public byte myAge;
	public short myBirthYear;
	public int myYearlySalary;
	public long myDesiredBankBalance;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean usCitizen;

	// Constructor declared
	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");

	}
	// method implemented
	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Birthyear: " + myBirthYear
				+ "\nM Yearly Salary: " + myYearlySalary + "\nMy Desired Bank Balance: " + myDesiredBankBalance
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nMy Gender: " + myGender + "\nUS Citizen: "
				+ usCitizen);
	}
}
