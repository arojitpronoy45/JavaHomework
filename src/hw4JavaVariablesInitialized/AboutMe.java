package hw4JavaVariablesInitialized;

public class AboutMe {
	public String myName = "Arojit Pronoy"; // variable declared
	public byte myAge = 22;
	public short myBirthyear = 32767;
	public int myYearlySalary = 2147483647;
	public long myDesiredBankBalance = 9223372036854775807l;
	public float myHeight = 1.65473f;
	public double myGrade = 3.4665636567;
	public char myGender = 'M';
	public boolean usCitizen = true;

	public AboutMe() {
		// constructor initialized
		System.out.println(":------------ This is all about Myself ------------:");
	}

	public void aboutMe() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Birthyear: " + myBirthyear
				+ "\nM Yearly Salary: " + myYearlySalary + "\nMy Desired Bank Balance: " + myDesiredBankBalance
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nMy Gender: " + myGender + "\nUS Citizen: "
				+ usCitizen);
	}
}