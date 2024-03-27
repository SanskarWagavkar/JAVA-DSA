package Practice_set_3;

public class Replace_template {
    public static void main(String[] args) {
        String name = "Sanskar";

        String sentance = "Hello </name/> how are you?";

        System.out.println(sentance.replace("</name/>", name));
    }
}
