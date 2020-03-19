public class Ellipse extends Shape{
    int x_radius;
    int y_radius;

    public Ellipse(int x_radius, int y_radius) {
        this.x_radius = x_radius;
        this.y_radius = y_radius;
    }

    public int getX_radius() {
        return x_radius;
    }

    public void setX_radius(int x_radius) {
        this.x_radius = x_radius;
    }

    public int getY_radius() {
        return y_radius;
    }

    public void setY_radius(int y_radius) {
        this.y_radius = y_radius;
    }
}
