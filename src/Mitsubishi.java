class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(super.getName()+" engine is starting");
        System.out.println(getClass().getSimpleName());

    }

    @Override
    public void accelerate() {
        System.out.println(super.getName() + " is accelerating");

    }

    @Override
    public void brake() {
        System.out.println(super.getName() + " is braking");
    }
}