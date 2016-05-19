import java.util.ArrayList;
import java.util.List;

public class Doctor {
	
	List<Patient> patients = new ArrayList<Patient>(); 

	public boolean performsSurgery() {
		
		return false;
	}

	public boolean makesHouseCalls() {
		
		return false;
	}

	public void assignPatient(Patient patient) {
		
	patients.add(patient);
		
	}

	public List<Patient> getPatients() {
		
		return patients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}

}
