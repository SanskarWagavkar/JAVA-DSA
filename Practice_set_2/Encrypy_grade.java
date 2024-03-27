package Practice_set_2;

/**
 * Encrypy_grade
 */
public class Encrypy_grade {

    public static void main(String[] args) {
        
        char grade = 'A';

        // A = 65 = char value
        // A + 8 = 73 = I;
        // Because of that I is Printed

        grade = (char) (grade+8);

        System.out.println(grade);


        grade = (char) (grade - 8);
        
        System.out.println(grade);


    }
    
}