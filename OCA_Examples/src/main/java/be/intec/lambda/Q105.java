package be.intec.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q105 {
    public static void checkAge(List<Person> list, Predicate <Person>predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " “");
            }
        }

    }

    public static void main(String[] args) {
        List iList = Arrays.asList(new Person(45, "Hank"), new Person(40, "Charlie"), new Person(38, "Smith"));
//        checkAge(iList, p -> (p.getAge() > 40));
        checkAge(iList, (Person p) -> {
            return p.getAge() > 40; });

    }
}

class Person {
    int age;
    String name;

    Person(int a, String n) {
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

