package Practice_set_9;

class square{

    private int radius;

    int get_radius(){
        return radius;
    }
    void set_radius(int val){
        radius = val;
    }

}

public class Square {
    public static void main(String[] args) {
        square c = new square();
        c.set_radius(5);
        System.out.println(c.get_radius());
    }
}
