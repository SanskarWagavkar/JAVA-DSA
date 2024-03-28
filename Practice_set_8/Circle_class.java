package Practice_set_8;

class circle {

    int radius;

    double area(int a){
        radius = a;
        return 3.14*radius*radius; 
    }
    double circumference(int a){
        radius = a;
        return 2*3.14*radius; 
    }

}

public class Circle_class {
    public static void main(String[] args) {
        circle c = new circle();
        System.out.println(c.area(5));
        System.out.println(c.circumference(5));
    }
}
