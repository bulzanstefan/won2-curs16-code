package ro.fasttrackit.curs16.generics;

public class Pair<A, B extends Number> {
    private final A key;
    private final B grade;

    public Pair(A key, B grade) {
        this.key = key;
        this.grade = grade;
    }

    public A getKey() {
        return key;
    }

    public B getGrade() {
        return grade;
    }

    public boolean isPositive() {
        return grade.doubleValue() >= 0;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", grade=" + grade +
                '}';
    }
}
