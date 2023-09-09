public class RoundedShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "RoundedSquare":
                return new RoundedSquare();
            default:
                return new RoundedRectangle();
        }
    }
}