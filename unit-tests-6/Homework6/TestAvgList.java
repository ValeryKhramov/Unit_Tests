import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAvgList {
    Lists lists;

    @BeforeEach
    void SetUp(){
        lists = new Lists();
    }

    @Test
    void TestAvgFirstMoreThanSecond(){


        String res = lists.avgLists(Arrays.asList(10, 2, 3), Arrays.asList(2, 2, 2));
        assertEquals("Первый список имеет большее среднее значение", res);
    }

    @Test
    void TestAvgSecondMoreThanFirst(){

        String res = lists.avgLists(Arrays.asList(1, 2, 3), Arrays.asList(20, 2, 2, 5));
        assertEquals("Второй список имеет большее среднее значение", res);
    }

    @Test
    void TestAvgSecondAndFirstEquals(){

        String res = lists.avgLists(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        assertEquals("Средние значения равны", res);
    }
}
