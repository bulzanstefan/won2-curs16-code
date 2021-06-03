package ro.fasttrackit.curs16.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        String name = getName();
//        System.out.println(name.length());

        Optional<String> optName = getNameSafe();
        if (optName.isPresent()) {
            System.out.println(optName.get().length());
        } else {
            System.out.println(0);
        }
        String value = optName
                .orElse("nu avem nume");
        System.out.println(value);

    }

    //ASA NU!
    static void useOptional(Optional<String> name) {
        if (name.isPresent()) {
            System.out.println(name);
        } else {
            System.out.println("hello");
        }
    }

    private static Optional<String> getNameSafe() {
        if (System.currentTimeMillis() % 2 == 0) {
            return Optional.empty();
        } else {
            return Optional.of("name");
        }
    }

    private static String getName() {
        if (System.currentTimeMillis() % 2 == 0) {
            return null;
        } else {
            return "name";
        }
    }
}
