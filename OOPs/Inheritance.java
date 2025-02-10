public class Inheritance {

    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dogs dobby = new Dogs();
        dobby.eat();
    }
}


    // Base class 
class Animal {
    String color;


    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("breathes");
    }
}


class Mammals extends Animal {
    int legs;
    
}

class Dogs extends Mammals {
    String breeds;
}


//Derived class / sub-class
// class Fish extends Animal {
//     int fins;



//     void swim() {
//         System.out.println("Swims in water");
//     }
// }

