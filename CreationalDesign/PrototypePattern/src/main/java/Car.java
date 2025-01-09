public class Car extends Vehicle {

    private Long topSpeed;

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    public Car() {

    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
