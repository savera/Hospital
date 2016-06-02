import java.util.ArrayList;
import java.util.List;

public class Hospital {

	List<Doctor> docs = new ArrayList<Doctor>();

	List<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {

		docs.add(doctor);

	}

	public void addDoctor(Surgeon surgeon) {

		docs.add(surgeon);

	}

	public void addDoctor(GeneralPractitioner generalPractitioner) {

		docs.add(generalPractitioner);

	}

	public List<Doctor> getDoctors() {

		return docs;
	}

	public void addPatient(Patient patient) {

		patients.add(patient);

	}

	public List<Patient> getPatients() {

		return patients;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {

		int patientsPerDoctor = patients.size() / docs.size();

		int patientsAssigned = 0;

		for (Doctor d : docs) {

			for (int i = 0; i < patientsPerDoctor; i++) {

				d.assignPatient(patients.get(patientsAssigned));
				
				patientsAssigned++;

			}

		}
		int remainingPatients = patients.size() - patientsAssigned;

		System.out.println(patients.size());

		for (int i = 0; i < remainingPatients; i++) {
			
			docs.get(i).assignPatient(patients.get(patientsAssigned));
			
			patientsAssigned ++;

		}

	}

}
