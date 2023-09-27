package hw10Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("John Doe");
		employee.setAge(54);
		employee.setSex('M');
		employee.setCitizen(true);

		System.out.println("Employe Name: " + employee.getName() + "\nEmploye Age: " + employee.getAge()
				+ "\nEmployee Sex: " + employee.getSex() + "\nUS Citizen: " + employee.isCitizen());

	}
}
