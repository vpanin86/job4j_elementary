package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class AssertJCheck {
    @Test
    public void whenEquals() {
        int result = 1;
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFloatPoint() {
        float result = 1.00000001F;
        float expected = 1F;
        assertThat(result).isCloseTo(expected, offset(0.01F));
    }

    @Test
    public void whenArray() {
        int[] result = {1, 2, 3};
        int[] expexted = {1, 2, 3};
        assertThat(result).containsExactly(expexted);
    }
}
