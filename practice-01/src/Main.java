public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(); // конструктор по умолчанию
        Car car2 = new Car("Lada Vesta", 2018); // частичный конструктор
        Car car3 = new Car("Toyota Camry", "A123BC", "black", 2021); // полный конструктор

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.setModel("Kia Rio");
        car1.setLicense("B456DE");
        car1.setColor("white");
        car1.setYear(2015);

        System.out.println("После заполнения через сеттеры: " + car1);
        System.out.println(car1.getModel() + " возраст: " + car1.getAge() + " лет");
        System.out.println(car2.getModel() + " возраст: " + car2.getAge() + " лет");
        System.out.println(car3.getModel() + " возраст: " + car3.getAge() + " лет");
    }
}
