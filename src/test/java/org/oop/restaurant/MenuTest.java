package org.oop.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuTest {
    @Test
    @DisplayName("메뉴판에서 메뉴이름에 해당하는 메뉴를 반환한다")
    void chooseTest() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("만두", 3000)));

        MenuItem menuItem = menu.choose("만두");

        assertThat(menuItem).isEqualTo(new MenuItem("만두", 3000));
    }
    @Test
    @DisplayName("메뉴판에서 메뉴이름에 해당하는 메뉴를 반환한다")
    void chooseTest2() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("만두", 3000)));

        MenuItem menuItem = menu.choose("볶음밥");

        assertThat(menuItem).isEqualTo(new MenuItem("만두", 3000));
    }
}
