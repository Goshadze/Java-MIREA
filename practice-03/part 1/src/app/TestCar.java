package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args){
        Car car = new Car("BMW", "A123BC", "чёрный", 2015, "Иван", "INS-001");
        ElectricCar electricCar = new ElectricCar("Tesla", "B456DE", "белый", 2022, "Пётр", "INS-002", 75.5);

        System.out.println(car);
        System.out.println(electricCar);

        car.setYear(2018);
        car.setOwnerName("Сидор");
        car.setInsuranceNumber("INS-010");
        electricCar.setBatteryCapacity(100.0);

        System.out.println("Ёмкость батареи: " + electricCar.getBatteryCapacity());
        System.out.println(car);
        System.out.println(electricCar);
    }
}
