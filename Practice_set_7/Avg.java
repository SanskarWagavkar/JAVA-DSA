package Practice_set_7;

public class Avg {

    static int avg(int ...n){
        int sum = 0;

        for (int i : n) {
            sum = sum + i;
        }
        return (sum/(n.length));
    }

    public static void main(String[] args) {
        System.out.println(avg(1,2,3,4,5));
    }
}
