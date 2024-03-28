package Practice_set_8;

class employee {

    int salary = 1200000;
    String Name = "Sanskar";

    int get_salary(){
        return salary; 
    }

    String get_name(){
        return Name;
    }

    String set_name(String m){
        return Name = m;
    }

}


public class Employee_class {
    public static void main(String[] args) {

        employee e = new employee();

        System.out.println(e.get_name());
        System.out.println(e.get_salary());
        System.out.println(e.set_name("Vedika"));
        System.out.println(e.get_name());
        
    }
}
