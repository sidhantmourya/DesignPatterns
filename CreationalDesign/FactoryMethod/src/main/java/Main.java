public class Main {

    public static void main(String[] args) {
        Restaurant vegResto = new VegBurgerRestaurant();
        vegResto.orderBurger();

        Restaurant chickenBurger = new ChickenBurgerRestaurant();
        chickenBurger.orderBurger();
    }

}
