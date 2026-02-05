
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
	}

	public void updateTemperature() {
		if(timer != 0) {
			timer -= 1;
			int tempGoal = 0;
			int tempReal = 0;
			if(timer == 0) {
				switch (mySetting) {
				case HIGH:
					tempGoal = 3;
					break;
				case MEDIUM:
					tempGoal = 2;
					break;
				case LOW:
					tempGoal = 1;
					break;
				case OFF:
					tempGoal = 0;
					break;
				}
				switch (myTemperature) {
				case BLAZING:
					tempReal = 3;
					break;
				case HOT:
					tempReal = 2;
					break;
				case WARM:
					tempReal = 1;
					break;
				case COLD:
					tempReal = 0;
					break;
				}
				if(tempGoal > tempReal) {
					switch (myTemperature) {
					case BLAZING:
						break;
					case HOT:
						myTemperature = Temperature.BLAZING;
						break;
					case WARM:
						myTemperature = Temperature.HOT;
						break;
					case COLD:
						myTemperature = Temperature.WARM;
						break;
					}
				timer = TIME_DURATION;
				} else if(tempGoal < tempReal) {
					switch (myTemperature) {
					case BLAZING:
						myTemperature = Temperature.HOT;
						break;
					case HOT:
						myTemperature = Temperature.WARM;
						break;
					case WARM:
						myTemperature = Temperature.COLD;
						break;
					case COLD:
						break;
					}
					timer = TIME_DURATION;
				}
			}
		}
	}
	
	public void display() {
		System.out.print(mySetting + ".....");
		switch (myTemperature) {
		case BLAZING:
			System.out.println("VERY HOT! DON'T TOUCH!");
			break;
		case HOT:
			System.out.println("CAREFUL");
			break;
		case WARM:
			System.out.println("warm");
			break;
		case COLD:
			System.out.println("cooool");
			break;
		}
	}

}
