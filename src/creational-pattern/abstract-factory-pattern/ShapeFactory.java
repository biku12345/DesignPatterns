public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        switch (shape) {

            case "Square":
                return new Square();
            default:
                return new Rectangle();
        }
    }
}