public class SuperKeyword {
    public static void main(String args[]) {

    }
}
class Animal {
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        System.out.println("horse constructor is called");
    }
}
