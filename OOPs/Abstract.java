public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animals {
    void eat() {
        System.out.println("animal eats");
    }


    abstract void walk();
}


class Horse extends Animals {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}


class Chicken extends Animals {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}