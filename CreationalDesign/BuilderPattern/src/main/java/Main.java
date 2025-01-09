public class Main {


    public static void main(String[] args) {
//        CarBuilder builder = new CarBuilder().id(123L).brand("RE").model("Hunter").color("black");
//        Car car = builder.build();
//
//        Builder carSchemaBuilder = new

        Director director = new Director();
        CarBuilder builder = new CarBuilder().id(123L);

        director.buildRE(builder);

        Car car = builder.build();

        //Director director = new Director();
        CarSchemaBuilder carSchemaBuilder = new CarSchemaBuilder().id(123L);

        director.buildHero(carSchemaBuilder);

        CarSchema carSchema = carSchemaBuilder.build();
    }

}
