package ro.fasttrackit.curs4homework.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class LogicalSwitch {

    public static Person switchCustom(Person person) {
        Map<Predicate<Person>, Function<Person, Person>> expression = getSwitchExpressions();
        for (Predicate<Person> predicate : expression.keySet()) {
            if (predicate.test(person)) {
                person = expression.get(predicate).apply(person);
            }
        }
        return person;
    }

    private static Map<Predicate<Person>, Function<Person, Person>> getSwitchExpressions() {
        Map<Predicate<Person>, Function<Person, Person>> expression = new HashMap<>();
        Predicate<Person> predicate1 = p -> p.getName().contains("An");
        Function<Person, Person> function1 = p -> {
            p.setName(p.getName().toUpperCase());
            return p;
        };

        Predicate<Person> predicate2 = p -> p.getAge() < 30;
        Function<Person, Person> function2 = p -> {
            p.setName("YOUNG: " + p.getName());
            return p;
        };

        expression.put(predicate1, function1);
        expression.put(predicate2, function2);
        return expression;
    }
}

