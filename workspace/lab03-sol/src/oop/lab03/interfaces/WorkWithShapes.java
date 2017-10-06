package oop.lab03.interfaces;

public class WorkWithShapes {

    private static final double CIRCLE_RADIUS = 3d;
    private static final double SQUARE_EDGE = 5d;
    private static final double RECT_WIDTH = 2d;
    private static final double RECT_HEIGHT = 4d;
    private static final double TRIANGLE_EDGE_1 = 4d;
    private static final double TRIANGLE_EDGE_2 = 3d;
    private static final double TRIANGLE_EDGE_3 = 5.2;
    private static final double TRIANGLE_H = 3d;

    private WorkWithShapes() { }

    private static String shapeDetails(final Shape s) {
        return "Perimeter = " + s.getPerimeter() + ", area = " + s.getArea();
    }

    public static void main(final String[] args) {
        final Shape circle = new Circle(CIRCLE_RADIUS);

        final Polygon square = new Square(SQUARE_EDGE);
        final Polygon rectangle = new Rectangle(RECT_WIDTH, RECT_HEIGHT);
        final Polygon scaleneTriangle = new Triangle(TRIANGLE_EDGE_1, TRIANGLE_EDGE_2,
                TRIANGLE_EDGE_3, TRIANGLE_H);

        System.out.println("Circle with radius " + CIRCLE_RADIUS + ": " + shapeDetails(circle));
        System.out.println("Square with edge " + SQUARE_EDGE + ": " + shapeDetails(square));
        System.out.println("Rectangle with edges (" + RECT_WIDTH + ", " + RECT_HEIGHT + "): "
                + shapeDetails(rectangle));
        System.out.println("Scalene triangle with parameters (" + TRIANGLE_EDGE_1 + ", " + TRIANGLE_EDGE_2 + ", "
                + TRIANGLE_EDGE_3 + ", " + TRIANGLE_H + "): " + shapeDetails(scaleneTriangle));
    }
}
