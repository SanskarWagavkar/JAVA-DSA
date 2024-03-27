package Practice_set_6;

public class Rev_array {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};

        int[] rev = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            rev[i] = arr[arr.length-i-1];
        }
        for (int j : rev) {
            System.out.println(j);
        }
    }
}
