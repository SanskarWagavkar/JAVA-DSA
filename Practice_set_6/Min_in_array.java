package Practice_set_6;

/**
 * Min_in_array
 */
public class Min_in_array {

    public static void main(String[] args) {
        int[] arr = {1,6,7,6,4,3,34,56,76,34,76};

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[0]);
    }
}