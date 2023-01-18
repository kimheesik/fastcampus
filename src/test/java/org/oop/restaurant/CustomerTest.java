package org.oop.restaurant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CustomerTest {

    @Test
    @DisplayName("손님이 메뉴판에서 메뉴를 선택하여 요리사에게 주문을 한다")
    void orderTest () {
        Customer customer = new Customer();
        Cooking cooking = new Cooking ();
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("만두", 3000)));

//        Cook cook = customer.order("돈까스", menu, cooking);
//        Assertions.assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
        Assertions.assertThatCode(() -> customer.order("만두", menu, cooking))
                .doesNotThrowAnyException();
    }

}
