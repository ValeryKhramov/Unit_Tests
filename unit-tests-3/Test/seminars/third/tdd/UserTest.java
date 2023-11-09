package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    User user;

    @BeforeEach
    void setUP() {
        user = new User("login", "password");
    }
    @Test
    void correctLoginAndPassword(){
        assertTrue(user.authenticate("login", "password"));
    }
    @Test
    void correctOnlyLoginNotPassword(){
        assertFalse(user.authenticate("login", "error"));
    }
    @Test
    void correctNotLoginOnlyPassword(){
        assertFalse(user.authenticate("error", "password"));
    }
}