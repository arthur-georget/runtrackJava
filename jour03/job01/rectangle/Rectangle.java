package jour03.job01.rectangle;

public class Rectangle {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
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

    @Override
    public String toString() {
        return String.format("Rectangle:\n  largeur = %s\n  hauteur = %s", this.width, this.height);
    }

    @Override
    public boolean equals(Object rectangleToCompare) {
        if (rectangleToCompare == null || this.getClass() != rectangleToCompare.getClass()) {
            return false;
        } else {
            return ((Rectangle)rectangleToCompare).getHeight() == this.getHeight() &&
                   ((Rectangle)rectangleToCompare).getWidth() == this.getWidth();
        }
    }
}