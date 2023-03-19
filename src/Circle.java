public class Circle {
    private int radius;

    public Circle() {
        this.radius = 7;
    }

    public Circle(int  radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

