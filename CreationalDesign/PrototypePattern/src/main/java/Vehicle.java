public abstract class Vehicle {

    private String model;
    private String color;

    protected Vehicle(Vehicle vehicle) {
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    protected Vehicle() {
    }

    public abstract Vehicle clone();
}
