public class HierarcialInheritance {
    public static void main(String[] args) {
        
    }
}
class Animals {
    String color;

    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Birds extends Animals {
    void fly() {
        System.out.println("Fly");
    }
}
class Mammals extends Animals {
    void walks() {
        System.out.println("walks");
    }
}
class Fish extends Animals {
    void swim() {
        System.out.println("Swim");
    }
}