public class Bus extends Vehicle{

    private String doors;

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
