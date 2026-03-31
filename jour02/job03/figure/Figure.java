package jour02.job03.figure;

public class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println(String.format("Le centre de la figure se trouve en x:%s et y:%s.", this.x, this.y));
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
