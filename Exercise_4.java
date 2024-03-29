class library{

    String[] books = new String[100];
    int count = 0;

    public void addbook(String b){
        books[count] = b;
        count = count + 1;
    }

    public void avaiablebooks(){
        for(String i : books){
            if(i == null){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
    public void issuebooks(String b){
        

    }






}


public class Exercise_4{
    public static void main(String[] args) {
        library l = new library();
        l.addbook("Hello");
        l.addbook("Hello2");
        l.addbook("Hello3");
        l.avaiablebooks();
    }
}