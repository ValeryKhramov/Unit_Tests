package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    SomeService someService;

    // 3.1.
    @BeforeEach
    void setUP() {
        someService = new SomeService();
    }

    @Test
    void multipleThreeNotFiveReturnsFizz() {
        assertEquals("Fizz", someService.fizzBuzz(3));

        // assertEquals...
    }

    @Test
    void multipleThreeNotFiveReturnsBuzz() {
        assertEquals("Buzz", someService.fizzBuzz(5));

        // assertEquals...
    }

    @Test
    void multipleThreeNotFiveReturnsFizzBuzz() {
        assertEquals("FizzBuzz", someService.fizzBuzz(15));

        // assertEquals...
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 7, 11, 17, 22})
    void multipleThreeNotFiveReturnsDefault(int i) {
        assertEquals(String.valueOf(i), someService.fizzBuzz(i));

        // assertEquals...
    }

    @Test
    void checkFirstLastSixIsTrueInTheBeginning() {
        assertTrue(someService.firstLast6(new int[]{6, 2, 3}));
        assertTrue(someService.firstLast6(new int[]{2, 3, 6}));

    }

    @Test
    void checkFirstLastSixIsFalse() {
        assertFalse(someService.firstLast6(new int[]{0, 6, 3}));


    }

    @ParameterizedTest
    @CsvSource({
            "2000.0,50,1000",
            "2000.0,100,0",
            "2000.0,0,2000"
    })
    void insufficientCoverageTest(double i, int d, int r) {

        assertThat(someService.calculatingDiscount(i, d)).isEqualTo(r); // обычная скидка


    }

    @Test
    void checkDiscountWithNegativePercentValue() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }

    @Test
    void checkDiscountExceeds100Percent() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
    }

    @Test
    void correctLuckySum() {
        assertThat(someService.luckySum(11,10,9)).isEqualTo(30);
    }

    @Test
    void correctLuckySumA() {
        assertThat(someService.luckySum(13,10,9)).isEqualTo(19);
    }

    @Test
    void correctLuckySumB() {
        assertThat(someService.luckySum(11,13,9)).isEqualTo(20);
    }

    @Test
    void correctLuckySumC() {
        assertThat(someService.luckySum(11,10,13)).isEqualTo(21);
    }
}