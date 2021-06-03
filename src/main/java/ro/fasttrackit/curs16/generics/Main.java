package ro.fasttrackit.curs16.generics;

public class Main {
    public static void main(String[] args) {
        withSimpleBox();
//        Ctrl-Alt-M - extract method
        withGenericBox();
        withLimitedBox();
        withPair();
        withGenericMethod();
    }

    private static void withGenericMethod() {
        GenericMethod genericMethod = new GenericMethod();
        Integer intValue = 1;
        System.out.println(genericMethod.convertToDouble(intValue));
        Float floatValue = 2.3F;
        System.out.println(genericMethod.convertToDouble(floatValue));
    }

    private static void withPair() {
        Pair<String, Integer> nameToGrade = new Pair<>("Ana", 10);
        Pair<Person, Double> personToHeight = new Pair<>(new Person("Mihai"), 1.9);

        System.out.println(nameToGrade);
        System.out.println(nameToGrade.isPositive());
        System.out.println(personToHeight);
        System.out.println(personToHeight.isPositive());
    }

    private static void withLimitedBox() {
//        LimitedBox<String> stringBox = new LimitedBox<>("");
        LimitedBox<Integer> intBox = new LimitedBox<>(1);
        LimitedBox<Float> floatBox = new LimitedBox<>(3.2F);

        System.out.println(intBox);
    }

    private static void withGenericBox() {
        GenericBox<String> stringBox = new GenericBox<>("Ana");
        GenericBox<Integer> intBox = new GenericBox<>(1);
        GenericBox<Double> doubleBox = new GenericBox<>(2.2);
        GenericBox<Person> personBox = new GenericBox<>(new Person("Mihai"));

        System.out.println(personBox);

        String object = stringBox.getObject();
        Person person = personBox.getObject();
        System.out.println(person.name());
    }

    private static void withSimpleBox() {
        Box stringBox = new Box("Ana");
        Box intBox = new Box(1);
        Box doubleBox = new Box(1.1);
        Box personBox = new Box(new Person("Marius"));

        System.out.println(stringBox);
        System.out.println(intBox);
        System.out.println(doubleBox);
        System.out.println(personBox);

        play(stringBox);
        play(personBox);
    }

    private static void play(Box box) {
        Object object = box.getObject();
        //se pierde informatia legata de tipul obiectului din Box
    }
}

record Person(String name) {
}
