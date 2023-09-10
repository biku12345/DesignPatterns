public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    public void print() {
        System.out.println("hey I am Synchronized Singleton");
    }
}