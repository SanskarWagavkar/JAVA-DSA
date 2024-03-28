package Practice_set_8;

class Tommyvecetti {

    String Hitting(){
        return "Hitting";
    }
    String Driving(){
        return "Driving";
    }
    String Firing(){
        return "Firing";
    }
    String Running(){
        return "Running";
    }

}


public class Tommyvecetti_class {
    public static void main(String[] args) {
        
        Tommyvecetti t = new Tommyvecetti();

        System.out.println(t.Driving());
        System.out.println(t.Firing());
        System.out.println(t.Running());
        System.out.println(t.Hitting());


    }
}
