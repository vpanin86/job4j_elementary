package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class SwitchWeekTest {
    @Test
    public void monday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

}