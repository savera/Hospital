public class GeneralPractitioner extends Doctor {

	public boolean makesHouseCalls() {

		return true;
	}

	public void doMedicine() {

		Patient pat = new Patient();

		pat.feelsCared = true;

	}

}
