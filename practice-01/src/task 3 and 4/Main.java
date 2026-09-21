class Main {
    public static void main(String[] args){
        Car Car1 = new Car();
        Car Car2 = new Car("Beha", "123456", "red", 2015);
        Car Car3 = new Car("Beha", "red");

        Car2.toString();
        System.out.println(Car2.toString());
    }
}
