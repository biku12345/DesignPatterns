public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public void print() {
        System.out.println("He I am Eager Singleton");
    }
}