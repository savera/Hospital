import java.util.ArrayList;
import java.util.List;

public class Hospital {

	List<Doctor> docs = new ArrayList<Doctor>(); 
	
	List<Patient> patients = new ArrayList<Patient>();
	
	public List<Doctor> getDoctors() {
		
		return docs;
	}

	public void addPatient(Patient patient) {
		
		patients.add(patient);
		
	}

	public List<Patient> getPatients() {
		
		return patients;
	}

	public void assignPatientsToDoctors() {
		
		
	}

	public void addDoctor(Surgeon surgeon) {
		
		docs.add(surgeon); 
		
	}

	public void addDoctor(GeneralPractitioner generalPractitioner) {
	
		docs.add(generalPractitioner); 
		
	}
}
