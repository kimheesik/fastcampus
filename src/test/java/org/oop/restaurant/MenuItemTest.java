package org.oop.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {
    @Test
    @DisplayName("메뉴항목을 생성한다")
    void createMenuItem() {
        assertThatCode( () -> new MenuItem ("돈까스", 5000))
                .doesNotThrowAnyException();
    }
}
