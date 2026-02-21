package OOP.Inheritance;
// Parent class
class Animal {

    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.name = "Tommy";

        obj.eat();   // inherited method
        obj.bark();  // child method
    }
}

