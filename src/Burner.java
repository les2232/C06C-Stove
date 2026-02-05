
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

	public void plusButton() {
		// TODO Auto-generated method stub
		
	}

	public void minusButton() {
		// TODO Auto-generated method stub
		
	}

	public void updateTemperature() {
		// TODO Auto-generated method stub
		
	}

}
