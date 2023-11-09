package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeworkThreeTest {
    MainHW mainHW;
    @BeforeEach
    void setUP(){
        mainHW = new MainHW();
    }

    @Test
    void checkEvenNumber(){
        assertTrue(mainHW.evenOddNumber(2));
    }

    @Test
    void checkOddNumber(){
        assertFalse(mainHW.evenOddNumber(1));
    }
    @ParameterizedTest
    @ValueSource(ints = {26,50,99})
    void testCorrectRange(int param){
        assertTrue(mainHW.numberInInterval(param));
    }
    @ParameterizedTest
    @ValueSource(ints = {25,0,100})
    void testNotCorrectRange(int param){
        assertFalse(mainHW.numberInInterval(param));
    }
}
