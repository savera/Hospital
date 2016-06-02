public class GeneralPractitioner extends Doctor {

	public boolean makesHouseCalls() {

		return true;
	}

	public void doMedicine() {

		for(Patient p : patients){
			
			p.feelsCared = true; 
			
		}
		
	}

}
