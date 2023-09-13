public class RoundSquare extends ShapeDecorator{

    private Shape shape;

    public RoundSquare(Shape shape) {
        this.shape = shape;
    }

    @Override
    public int getPrice() {
        return shape.getPrice() + 400;
    }
}