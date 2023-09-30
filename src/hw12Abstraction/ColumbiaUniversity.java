package hw12Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	public void chemistry() {
		System.out.println("This is a Chemistry method");
	}
	// we cannot call an abstract class inside a regular class
	/*
	 * public abstract void biology();
	 */

	// default constructor
	public ColumbiaUniversity() {

	}
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void biochemistryLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caring() {
		// TODO Auto-generated method stub
		
	}
}

// Yes, a regular class can inherit another abstract class or regular class by extends keyword
// A regular class cannot inherit an interface by extends keyword
// One inheritance is possible by a regular class