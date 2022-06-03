package ro.fasttrackit.curs4homework.ex3;

final class Dog implements Animal{
    @Override
    public String speak() {
        return "woof";
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }
}
