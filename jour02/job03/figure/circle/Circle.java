package jour02.job03.figure.circle;

import jour02.job03.figure.Figure;

public class Circle extends Figure {

    protected double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public boolean isInside(double x, double y) {
        if ((x - this.x) * (x - this.x) +
                (y - this.y) * (y - this.y) <= radius * radius) {
            return true;
        } else {
            return false;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
