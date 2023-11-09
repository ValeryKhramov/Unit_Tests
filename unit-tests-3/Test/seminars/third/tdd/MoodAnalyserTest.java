package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser;
    @BeforeEach
    void setUP(){
        moodAnalyser = new MoodAnalyser();
    }
    @Test
    void testUserGoodMood(){
        assertThat(moodAnalyser.analyseMood("good day")).isEqualTo("happy");
    }

    @Test
    void testUserBadMood(){
        assertThat(moodAnalyser.analyseMood("bad day")).isEqualTo("bad");
    }

    @Test
    void testUserMood(){
        assertThat(moodAnalyser.analyseMood("test")).isEqualTo("so-so");
    }
}
