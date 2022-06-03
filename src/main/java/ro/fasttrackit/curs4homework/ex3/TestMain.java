package ro.fasttrackit.curs4homework.ex3;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Bird();
        System.out.println(animal.speak());
        Animal animal1 = new Canary();
        System.out.println(animal1.speak());
        Animal animal2 = new Fly();
        System.out.println(animal2.speak());

        Animal animal3 = new Parrot();
        System.out.println(animal3.getNumberOfLegs());

        Animal animal4 = new Ladybug("ladybug");
        System.out.println(animal4.getNumberOfLegs());
    }
}
