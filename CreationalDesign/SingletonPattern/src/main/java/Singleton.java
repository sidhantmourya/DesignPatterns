public class Singleton {

    private static volatile Singleton instance;
    private final String str;

    public Singleton(String str) {
        this.str = str;
    }

    public static Singleton getInstance(String data)
    {
        Singleton res = instance;
        if(res == null)
        {
            synchronized (Singleton.class)
            {
                res = instance;
                if(res == null)
                {
                    instance = res = new Singleton(data);
                }
            }
        }
        return res;
    }

    public String getStr() {
        return str;
    }
}
