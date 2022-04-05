package ro.unibuc.facade;


public class DrawShapes {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape triangle;

    public DrawShapes() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        triangle = new Triangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }
}
