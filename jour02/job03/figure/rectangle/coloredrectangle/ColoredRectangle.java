package jour02.job03.figure.rectangle.coloredrectangle;

import jour02.job03.figure.rectangle.Rectangle;

public class ColoredRectangle extends Rectangle {
    private int color;

    public ColoredRectangle(double width, double height, double x, double y, int color) {
        super(width, height, x, y);
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
