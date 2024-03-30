package Practice_set_11;

interface Basic_animal {

    void eat();
    void sleep();
    
}

class Monkey {

    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
    
}

class Human extends Monkey implements Basic_animal{

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }


}


public class Monkey_class {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.jump();
        m.bite();
        Human h = new Human();
        h.eat();
        h.sleep();
    }
}
