import java.util.ArrayList;
import java.util.List;

public class Hospital {

	List<Doctor> docs = new ArrayList<Doctor>(); 
	
	public List<Doctor> getDoctors() {
		
		return docs;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	public List<Doctor> getPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

	public void addDoctor(Surgeon surgeon) {
		
		docs.add(surgeon); 
		
	}

	public void addDoctor(GeneralPractitioner generalPractitioner) {
	
		docs.add(generalPractitioner); 
		
	}

	

}
