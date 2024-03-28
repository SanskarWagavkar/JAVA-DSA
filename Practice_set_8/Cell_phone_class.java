package Practice_set_8;

class cellphone {

    String print(){
        return "Ring...Ring"; 
    }

}



public class Cell_phone_class {
    public static void main(String[] args) {
        cellphone e = new cellphone();

        System.out.println(e.print());
        
    }
}
