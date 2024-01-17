public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");

        car.startEngine();

        car.accelerate();

        car.brake();
        System.out.println("*********************************");

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        mitsubishi.startEngine();

        mitsubishi.accelerate();

        mitsubishi.brake();
        System.out.println("*********************************");

        Car ford = new Ford(6, "Ford Falcon");

        ford.startEngine();

        ford.accelerate();

        ford.brake();
        System.out.println("*********************************");


        Car holden = new Holden(6, "Holden Commodore");

        holden.startEngine();

        holden.accelerate();

        holden.brake();

        System.out.println("****************************");
        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "Runs on gasoline", 10.5, 4);
        CarSkeleton electricCar = new ElectricCar("Electric Car", "Powered by electricity", 150.0, 500);
        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "Combines gas and electric power", 8.0, 300, 4);

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    private static void testCar(CarSkeleton car) {
        car.startEngine();
        car.drive();
        System.out.println("Car type: " + car.getClass().getSimpleName());
        System.out.println();
        
    }

}