public class ShapeArray {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 6);

        Shape[] shapeArray = {triangle, circle, rectangle};

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}