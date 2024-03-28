package Practice_set_9;

class Cylinder {

    private int radius;
    private int height;

    Cylinder(int a, int b){
        radius = a;
        height = b;

    }
    int r(){
        return radius; 
    }
    int h(){
        return height; 
    }
}

public class Conturctor_cyclinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(2, 3);
        System.out.println(c.r());
        System.out.println(c.h());
    }
}
