package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args){
        Vehicle car = new Car("Beha", "123456", "red", 2015, "Ivan", "INS-001");
        Vehicle electricCar = new ElectricCar("Tesla", "654321", "white", 2022, "Petr", "INS-002", 75.5);

        System.out.println(car);
        System.out.println(electricCar);

        car.setColor("blue");
        car.setEngineType("Petrol");
        electricCar.setOwnerName("Sidor");
        ((ElectricCar) electricCar).setBatteryCapacity(100);

        System.out.println(car);
        System.out.println(electricCar);
    }
}
