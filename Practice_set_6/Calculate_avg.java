package Practice_set_6;

public class Calculate_avg {
    public static void main(String[] args) {
        int[] arr = {100,100,100,100,100};
        
        float sum = 0;
        
        for (int i : arr) {
            sum = sum + i;
        }

        float avg = ((sum/500)*100);

        System.out.println(avg);
    }
}
