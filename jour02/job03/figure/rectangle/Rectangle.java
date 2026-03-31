package jour02.job03.figure.rectangle;

import jour02.job03.figure.Figure;

public class Rectangle extends Figure {
    protected double width;
    protected double height;

    public Rectangle(double width, double height, double x, double y) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
