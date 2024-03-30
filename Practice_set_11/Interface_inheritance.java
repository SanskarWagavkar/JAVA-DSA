package Practice_set_11;


interface Tvremote {

    void on();
    void off();
    void play();
    void stop();

}

interface smarttvremote extends Tvremote{
    @Override
    default void on() {
        System.out.println("On");
    }
}

class smarttv implements smarttvremote{

    @Override
    public void off() {
        System.out.println("off");
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
    
}


public class Interface_inheritance {
    public static void main(String[] args) {
        smarttv s = new smarttv();
        s.on();
    }
}
