package org.oop.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {
    @Test
    @DisplayName("요리를 생성한다")
    void createTest () {
        assertThatCode(()-> new Cook("돈까스", 5000))
                .doesNotThrowAnyException();
    }
}
