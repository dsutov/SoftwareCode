package SoftDevLec6;

public class ShapeDecoratorTester {

    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border.");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Circle with red border");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Rectangle with red border");
        redRectangle.draw();

        Shape blueCircle = new BlueShapeDecorator(new Circle());
        Shape blueRectangle = new BlueShapeDecorator(new BlueShapeDecorator(new Rectangle()));

        System.out.println("Circle with blue border");
        blueCircle.draw();

        System.out.println("Rectangle with blue border");
        blueRectangle.draw();
    }
}
