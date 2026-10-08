package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.setOwnerName("Ivan");
        car.setInsuranceNumber("INS-001");
        car.setEngineType("Petrol");

        ElectricCar electricCar = new ElectricCar();
        electricCar.setOwnerName("Petr");
        electricCar.setInsuranceNumber("INS-002");
        electricCar.setBatteryCapacity(75.5);

        System.out.println(car.getOwnerName() + " " + car.getInsuranceNumber() + " " + car.getEngineType());
        System.out.println(electricCar.getOwnerName() + " " + electricCar.getInsuranceNumber() + " " + electricCar.getEngineType() + " " + electricCar.getBatteryCapacity());
    }
}
