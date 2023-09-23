public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {

        System.out.println("Triangle Shape !!!");
        color.applyColor();
    }
}
