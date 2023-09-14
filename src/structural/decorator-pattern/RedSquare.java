public class RedSquare extends ShapeDecorator{

    private  Shape shape;

    public RedSquare(Shape shape) {
        this.shape = shape;
    }

    @Override
    public int getPrice() {
        return shape.getPrice()+20;
    }
}