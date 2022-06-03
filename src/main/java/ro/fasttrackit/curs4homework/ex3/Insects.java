package ro.fasttrackit.curs4homework.ex3;

non-sealed interface Insects extends Animal{
}

class Fly implements Insects{

    @Override
    public String speak() {
        return "buzz";
    }

    @Override
    public int getNumberOfLegs() {
        return 6;
    }
}

record Ladybug(String name) implements Insects{

    @Override
    public String speak() {
        return "brrrr";
    }

    @Override
    public int getNumberOfLegs() {
        return 8;
    }
}
