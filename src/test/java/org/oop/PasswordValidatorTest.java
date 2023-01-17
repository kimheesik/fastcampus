package org.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidatorTest {
    @Test
    @DisplayName("비밀번호가 최소 8자리 이상, 12이하면 예외가 발생하지 않음")
    void validatePasswordTest () {
        assertThatCode(()->PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();

    }
}
