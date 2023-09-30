package hw12Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Columbia University from Regular class  ------------------------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.chemistry();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.lawInfo();
		columbiaUniversity.caring();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.classSize();
		columbiaUniversity.gymnasium();
		columbiaUniversity.vocationalInfo();
		
		System.out.println("\n--------------------- University Abstract Class ------------------------\n");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();

		

		System.out.println("\n--------------------- Abstract Class MedicalSchool ------------------------\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();

		System.out.println("\n--------------------- Abstract Class NursingSchool ------------------------\n");
		NursingSchool nursingSchool = new ColumbiaUniversity();
		nursingSchool.hygiene();
		nursingSchool.caring();
		nursingSchool.maths();
		nursingSchool.aeronauticalInfo();
		nursingSchool.computerLab();

		System.out.println("\n--------------------- Abstract Class RockefellerUniversity ------------------------\n");
		RockefellerUniversity rockefellerUniversity = new ColumbiaUniversity();
		rockefellerUniversity.maths();
		rockefellerUniversity.aeronauticalInfo();
		rockefellerUniversity.computerLab();
		rockefellerUniversity.mechanicalLab();
		rockefellerUniversity.computerLab();
		rockefellerUniversity.aeronauticalInfo();

		System.out.println("\n--------------------- Abstract Class EngineeringSchool ------------------------\n");
		EngineeringSchool engineeringSchool = new ColumbiaUniversity();
		engineeringSchool.mechanicalLab();
		engineeringSchool.anthropology();

	}

}
