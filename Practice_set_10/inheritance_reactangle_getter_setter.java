package Practice_set_10;

class react{
    int length;
    int width;
    int heigth;

    void set(int length, int width, int heigth){
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }
    double getarea(){
        return length*width;
    }
    double getvolume(){
        return length*width*heigth;
    }
}
class cuboid extends react{
    
    double getarea(){
        return (2*length*width)+(2*length*heigth)+(2*heigth*width);
    }
    double getvolume(){
        return length*width*heigth;
    }
}



public class inheritance_reactangle_getter_setter {
    public static void main(String[] args) {
        react r = new react();
        r.set(1, 2, 3);
        System.out.println(r.getarea());
        System.out.println(r.getvolume());
        cuboid c = new cuboid();
        c.set(4, 5, 6);
        System.out.println(c.getarea());
        System.out.println(c.getvolume());
    }
}
