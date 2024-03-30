package Practice_set_11;

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}

class Smartphone extends Telephone{

    @Override
    void ring() {
        System.out.println("Ring");
    }

    @Override
    void lift() {
        System.out.println("Lift");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnect");
    }

}

public class Telephone_class {
    public static void main(String[] args) {
        Telephone s = new Smartphone();
        s.lift();
    }
}
