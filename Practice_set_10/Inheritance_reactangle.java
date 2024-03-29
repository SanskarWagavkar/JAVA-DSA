package Practice_set_10;


class react{
    int length;
    int width;
    double area(int length, int width){
        this.length = length;
        this.width = width;
        return length*width;
    }
}
class cuboid extends react{
    int heigth;
    double area(int length, int width, int heigth){
        
        this.length = length;
        this.width = width;

        return (2*length*width)+(2*length*heigth)+(2*heigth*width);
    }
}



public class Inheritance_reactangle {
    public static void main(String[] args) {
        react r = new react();
        System.out.println(r.area(3, 2));
        cuboid c = new cuboid();
        System.out.println(c.area(2, 3,4));
    }
}
