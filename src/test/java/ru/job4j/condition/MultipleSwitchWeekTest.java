package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MultipleSwitchWeekTest {
    @Test
    public void monday() {
        String name = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}