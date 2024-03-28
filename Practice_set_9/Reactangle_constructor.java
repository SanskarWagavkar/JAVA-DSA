package Practice_set_9;

class react {

    private int length;
    private int height;

    react(){
        length = 4;
        height = 5;

    }
    void change(int length, int height){
        this.length = length;
        this.height = height;
    }
    int[] display() {
        int[] dimensions = {length, height};
        return dimensions;
    }
}


public class Reactangle_constructor {
    public static void main(String[] args) {
        react r = new react();
        r.change(2, 3);
        System.out.println(r.display());

    }
}
