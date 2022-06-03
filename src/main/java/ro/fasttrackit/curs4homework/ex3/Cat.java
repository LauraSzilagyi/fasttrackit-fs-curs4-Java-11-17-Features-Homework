package ro.fasttrackit.curs4homework.ex3;

public record Cat(String name) implements Animal {
    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }
}
