package ro.fasttrackit.curs16.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {
    @Test
    void fibonacciTest() {
        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.fib(0)).isEqualTo(0);
        assertThat(fibonacci.fib(1)).isEqualTo(1);
        assertThat(fibonacci.fib(3)).isEqualTo(2);
        assertThat(fibonacci.fib(10)).isEqualTo(55);
        assertThat(fibonacci.fib(15)).isEqualTo(610);
        assertThat(fibonacci.fib(20)).isEqualTo(6765);
        assertThat(fibonacci.fib(25)).isEqualTo(75025);
        assertThat(fibonacci.fib(30)).isEqualTo(832040);
        IllegalArgumentException thrownException = assertThrows(IllegalArgumentException.class, () -> fibonacci.fib(-10));
        assertThat(thrownException.getMessage()).isEqualTo("please provide n>0");
    }

}
