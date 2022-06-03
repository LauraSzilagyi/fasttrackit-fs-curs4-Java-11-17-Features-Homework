package ro.fasttrackit.curs4homework.ex3;

sealed class Bird implements Animal permits Canary, Parrot, Chicken{

    @Override
    public String speak() {
        return "chirp";
    }

    @Override
    public int getNumberOfLegs() {
        return 2;
    }
}

final class Canary extends Bird {
    @Override
    public String speak() {
        return super.speak();
    }
}

final class Parrot extends Bird{

    @Override
    public String speak() {
        return "talking";
    }
}

non-sealed class Chicken extends Bird{

    @Override
    public String speak() {
        return "cheep";
    }
}
