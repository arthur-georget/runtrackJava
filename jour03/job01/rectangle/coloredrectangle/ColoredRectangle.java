package jour03.job01.rectangle.coloredrectangle;

import jour03.job01.rectangle.Rectangle;

public class ColoredRectangle extends Rectangle {
    private String color;

    public ColoredRectangle(double width, double height, String color) {
        super(width, height);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return String.format("%s\n  couleur = %s", superString, this.color);
    }

    public boolean equals(Rectangle rectangleToCompare) {
        if (rectangleToCompare instanceof ColoredRectangle) {
            return super.equals((Rectangle) rectangleToCompare) &&
                    ((ColoredRectangle) rectangleToCompare).getColor().equals(this.getColor());
        } else {
            return false;
        }
    }
}
