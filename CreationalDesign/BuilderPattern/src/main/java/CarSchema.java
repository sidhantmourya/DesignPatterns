public class CarSchema {

    private Long id;
    private String brand;
    private String model;
    private String color;


    CarSchema(Long id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
}