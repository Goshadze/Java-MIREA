package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args){
        Car car = new Car("BMW", "A123BC", "black", 2015, "Ivan", "INS-001");
        ElectricCar electricCar = new ElectricCar("Tesla", "B456DE", "white", 2022, "Petr", "INS-002", 75.5);

        System.out.println(car);
        System.out.println(electricCar);

        car.setYear(2018);
        car.setOwnerName("Sidor");
        car.setInsuranceNumber("INS-010");
        electricCar.setBatteryCapacity(100.0);

        System.out.println("Battery capacity: " + electricCar.getBatteryCapacity());
        System.out.println(car);
        System.out.println(electricCar);
    }
}
