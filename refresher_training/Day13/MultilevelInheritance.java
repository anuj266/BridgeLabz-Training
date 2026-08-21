// Base class (Level 1)
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

// Derived class (Level 2)
class Mammal extends Animal {
    void walk() {
        System.out.println("The mammal is walking.");
    }
}

// Derived class (Level 3)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

// Derived class (Level 4)
class Puppy extends Dog {
    void play() {
        System.out.println("The puppy is playing.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        
        Puppy p = new Puppy();
        
        // Calling methods inherited from all ancestors plus its own
        p.eat();   // Inherited from Animal
        p.walk();  // Inherited from Mammal
        p.bark();  // Inherited from Dog
        p.play();  // Puppy's own method
    }
}