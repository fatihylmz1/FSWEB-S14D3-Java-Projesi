public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int
                         cylinders) {
        super(name, description);
        this.avgKmPerLitre= avgKmPerLitre;
        this.cylinders=cylinders;
    }

    @java.lang.Override
    public void startEngine() {
        System.out.println("Starting Gas Engine for " + super.getName());
    }
}
