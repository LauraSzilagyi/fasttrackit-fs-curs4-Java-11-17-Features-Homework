package ro.fasttrackit.curs4homework.ex3;

sealed interface Animal permits Dog, Cat, Bird, Insects {
    String speak();
    int getNumberOfLegs();
}

