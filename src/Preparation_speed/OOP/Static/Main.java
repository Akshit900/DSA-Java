package Preparation_speed.OOP.Static;

public class Main {
    public static void main(String[] args) {
        Human Akshit = new Human(20, "Akshit Koundal", 100000, false);
        Human John = new Human(21, "John Doe", 90000, true);
        Human wanted = new Human(50, "Salman Khan", 200000, false);
        System.out.println(Akshit.age);
        System.out.println(Akshit.name);
        System.out.println(Akshit.salary);
        System.out.println(Akshit.married);
        System.out.println(Human.population);
    }
}
