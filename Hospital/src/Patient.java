
public class Patient {

	boolean pulseChecked = false;

	public boolean feelsCaredFor() {

		return pulseChecked;
	}

	public void checkPulse() {

		pulseChecked = true;

	}

}
