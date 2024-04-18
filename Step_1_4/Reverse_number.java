public class Reverse_number {

    static int reverse(int x){
        
        
                
        int number = x;
        int rev_p = 0; 
        int rev_n = 0;
        

        if(number > 0){
            while(number > 0){
                int last = number%10;
                rev_p = rev_p*10+last;
                number = number/10;
            }

            return rev_p;
        }else{
            int pos = (number)*(-1);
            System.out.println(pos);
            while(pos > 0){
                int l = pos%10;
                rev_n = rev_n*10+l;
                pos = pos/10;
            }
            int rev_n_n = (rev_n)*(-1);
            return rev_n_n;
        }
        
    }


    public static void main(String[] args) {
        int n = 1534236469;
        System.out.println(reverse(n));
    }
}
