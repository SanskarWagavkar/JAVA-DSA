package Practice_set_4;

import java.util.*;

public class Website_url {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Website URL :- ");
        String url = input.nextLine();

        int url_length = url.length();
        int index_val = url.lastIndexOf(".");

        String type = url.substring(index_val, url_length);

        if(type.equals(".com")){
            System.out.println("Commercial Website");
        }
        else if(type.equals(".org")){
            System.out.println("Orgnizational Website");
        }
        else if(type.equals(".in")){
            System.out.println("Indian Wesite");
        }
        else{
            System.out.println("Different Type of Website");
        }

        input.close();
    }    
}
