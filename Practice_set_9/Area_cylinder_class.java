package Practice_set_9;

class Cylinder {

    private int radius;
    private int height;

    int getRadius() {
        return radius;
    }

    void setRadius(int val) {
        radius = val;
    }

    int getHeight() {
        return height;
    }

    void setHeight(int val) {
        height = val;
    }

    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Area_cylinder_class {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(3);
        c.setHeight(2);
        System.out.println("Surface Area: " + c.area());
        System.out.println("Volume: " + c.volume());
    }
}
