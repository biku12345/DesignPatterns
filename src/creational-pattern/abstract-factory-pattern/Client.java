public class Client {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryProducer.getFactory(true);

        Shape shape = abstractFactory.getShape("RoundedSquare");

        shape.draw();



    }
}