package Practice_set_10;

class circle{
    int radius;
    double area(int radius){
        this.radius = radius;
        return 3.14*radius*radius;
    }
    double volume(int radius){
        this.radius = radius;
        return (4.0/3.0)*3.14*radius*radius*radius;
    }

}
class cyclinder extends circle{
    int heigth;
    double area(int radius, int heigth){
        
        this.radius = radius;
        this.heigth = heigth;

        return (2*3.14*radius*heigth)+(2*3.14*radius*radius);
    }
    double volume(int radius, int heigth){
        
        this.radius = radius;
        this.heigth = heigth;

        return 3.14*radius*radius*heigth;
    }
}


public class Inheritance_circle_volume {
    public static void main(String[] args) {
        circle cl = new circle();
        System.out.println(cl.area(2));
        System.out.println(cl.volume(5));

        cyclinder c = new cyclinder();
        System.out.println(c.area(3, 4));
        System.out.println(c.volume(5,4));
    }
}
