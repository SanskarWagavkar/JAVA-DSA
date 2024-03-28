package Practice_set_8;

class square {

    int side;

    int area(int a){
        side = a;
        return side*side; 
    }
    int perimeter(int a){
        side = a;
        return 4*side;
    }

}

public class Square_class {
    public static void main(String[] args) {
        square s = new square();

        System.out.println(s.area(5));
        System.out.println(s.perimeter(5));
    }
}
