package vehicles;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(){
        engineType = "Electric";
    }

    public double getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }
}
