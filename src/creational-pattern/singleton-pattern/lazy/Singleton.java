public class Singleton {

    private static Singleton singleton;

    private Singleton() {};

    public static Singleton getInstance() {

        if(singleton == null) {
            singleton = new Singleton();
        }

        return  singleton;

    }

    public void printMethod() {
        System.out.println("Hey I am singleton");
    }
}