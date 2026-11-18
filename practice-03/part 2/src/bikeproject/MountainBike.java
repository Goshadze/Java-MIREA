package bikeproject;

public class MountainBike extends Bike implements MountainParts {

	private String suspension, type;
	private int frameSize;

	public MountainBike()
	{
		this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
	}//end constructor

	public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			            String suspension, String type, int frameSize) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}//end constructor

	public String getSuspension(){
		return suspension;
	}

	public void setSuspension(String newValue){
		suspension = newValue;
	}

	public String getType(){
		return type;
	}

	public void setType(String newValue){
		type = newValue;
	}

	public void printDescription()
	{
		super.printDescription();
		System.out.println("Горный велосипед. Тип: " + this.type + ", подвеска: " + this.suspension
                + ", размер рамы: " + this.frameSize + " дюймов.");

	}//end method printDescription
}//end class MountainBike
