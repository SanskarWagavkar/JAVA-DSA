package Practice_set_6;

public class Sorted_or_not {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,2};
        int[] copy = arr.clone();


        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        boolean flag = true;

        for(int k = 0; k < arr.length; k++){
            if(arr[k] == copy[k]){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
