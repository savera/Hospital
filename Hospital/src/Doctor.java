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

	public void assignPatient(Patient patient) throws DoctorFullException {

		patients.add(patient);

		if (patients.size() > 3) {

			throw new DoctorFullException("Too many patients");

		}

	}

	public List<Patient> getPatients() {

		return patients;
	}

	public void doMedicine() {

	}

}
