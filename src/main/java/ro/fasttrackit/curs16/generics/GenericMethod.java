package ro.fasttrackit.curs16.generics;

public class GenericMethod {

    public <T extends Number> double convertToDouble(T input) {
        return input.doubleValue();
    }
}
