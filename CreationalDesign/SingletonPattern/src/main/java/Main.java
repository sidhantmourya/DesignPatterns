public class Main {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance("Hello");
        System.out.println(s.getStr());
        s = Singleton.getInstance("234");
        System.out.println(s.getStr());
    }
}
