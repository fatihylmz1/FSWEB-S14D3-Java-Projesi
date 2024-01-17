import java.util.Objects;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true; // Default engine value for all cars
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4; // Default wheels value for all cars
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("the car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }

    public void accelerate() {
        System.out.println("the car is accelerating");
    }

    public void brake() {
        System.out.println("the car is braking");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }
}