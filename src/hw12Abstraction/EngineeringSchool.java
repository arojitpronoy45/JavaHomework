package hw12Abstraction;

public abstract class EngineeringSchool extends NYUniversity {
	// non abstract method and implemented
	public void mechanicalLab() {
		System.out.println("This is Mechanical Lab method");
	}

	public abstract void computerLab();
}
