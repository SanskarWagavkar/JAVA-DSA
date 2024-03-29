package Practice_set_10;


class circle{
    int radius;
    double area(int radius){
        this.radius = radius;
        return 3.14*radius*radius;
    }
}
class cyclinder extends circle{
    int heigth;
    
    double area(int radius, int heigth){
        this.radius = radius;
        this.heigth = heigth;

        return (2*3.14*radius*heigth)+(2*3.14*radius*radius);
    }
}



public class Inheritance_circle {
    public static void main(String[] args) {
        circle c = new circle();
        System.out.println(c.area(5));
        cyclinder cl = new cyclinder();
        System.out.println(cl.area(12,4));
    }
}
