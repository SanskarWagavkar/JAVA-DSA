package Practice_set_8;

class reactangle {

    int length;
    int breath;

    int area(int a, int b){
        length = a;
        breath = b;

        return length*breath; 
    }
    int perimeter(int a, int b){

        length = a;
        breath = b;

        return 2*(length+breath);
    }

}


public class Reactangle_class {
    public static void main(String[] args) {

        reactangle r = new reactangle();

        System.out.println(r.area(2, 3));
        System.out.println(r.perimeter(2, 3));

    }
}
