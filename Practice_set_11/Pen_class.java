package Practice_set_11;

abstract class pen{
    abstract void write();
    abstract void refill();
}

class Fountainpen extends pen{

    @Override
    void write() {
        System.out.println("Write");
    }

    @Override
    void refill() {
        System.out.println("Refill");
    }
    void changNib(){
        System.out.println("Change Nib");
    }
    
}
public class Pen_class {
    public static void main(String[] args) {
        Fountainpen p = new Fountainpen();
        p.write();
        p.refill();
        p.changNib();
    }
}
