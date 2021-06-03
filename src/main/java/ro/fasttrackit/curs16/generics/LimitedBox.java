package ro.fasttrackit.curs16.generics;

import java.util.Objects;

public class LimitedBox<T extends Number> {
    private final T object;

    public LimitedBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LimitedBox<?> that = (LimitedBox<?>) o;
        return Objects.equals(object, that.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        return "Box{" +
                "object=" + object +
                '}';
    }

}
