package Practice_set_9;

class cyclinder{

    private int radius;
    private int heigth;

    int get_radius(){
        return radius;
    }
    void set_radius(int val){
        radius = val;
    }
    int get_heigth(){
        return heigth;
    }
    void set_hiegth(int val){
        heigth = val;
    }

}


public class Cyclinder_class {
    public static void main(String[] args) {
        cyclinder c = new cyclinder();
        c.set_radius(5);
        System.out.println(c.get_radius());
        c.set_hiegth(12);
        System.out.println(c.get_heigth());
    }
}
