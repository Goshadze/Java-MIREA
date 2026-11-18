package bikeproject;

public class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;

	public Bike(){
	}//end constructor

	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
	}//end constructor

	public void printDescription()
	{
		System.out.println("\n" + MAKE + "\n"
				          + "Руль: " + this.handleBars + ", рама: " + this.frame
                          + ", передач: " + this.NumGears
                          + "\nСедло: " + this.seatType + ", шины: " + this.tyres);
	}//end method printDescription

}//end class Bike
