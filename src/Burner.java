
public class Burner {
	
	public enum Temperature {
		COLD, WARM, HOT, BLAZING
	}
	
	public static final int TIME_DURATION = 2;
	
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	
	public Burner() {
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
		timer = 0; 
	}
	

	public Temperature getMyTemperature() {
		return myTemperature;
	}


	public void plusButton() {
				switch (mySetting) {
		case OFF:
			mySetting = Setting.LOW;
			break;
		case LOW:
			mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			mySetting = Setting.HIGH;
			break;
		case HIGH:
			//do nothing;
			break;
		}
		timer = TIME_DURATION;	
	}

	public void minusButton() {
		switch (mySetting) {
		case HIGH:
			mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			mySetting = Setting.LOW;
			break;
		case LOW:
			mySetting = Setting.OFF;
			break;
		case OFF:
			//do nothing;
			break;
		}
		timer = TIME_DURATION;

	public void updateTemperature() {
		// TODO Auto-generated method stub
		
	}

}
