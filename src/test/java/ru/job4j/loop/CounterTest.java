package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThreeToElevenThenTwentyEight() {
        int start = 3;
        int finish = 11;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        assertThat(result).isEqualTo(expected);
    }
}