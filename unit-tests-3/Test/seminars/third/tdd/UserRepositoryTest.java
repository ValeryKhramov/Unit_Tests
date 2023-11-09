package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepositoryTest {
    UserRepository userRepository;
    User userOne;
    User userTwo;

    @BeforeEach
    void setUP() {
        userRepository = new UserRepository();
        userOne = new User("Login1", "Password1");
        userTwo = new User("Login2", "Password2");
        userOne.authenticate("Login1","Password1");
    }

    @Test
    void correctAddUserInUserRepository(){
        userOne.authenticate("Login1","Password1");
        userRepository.addUser(userOne);
        assertThat(userRepository.data.size()).isEqualTo(1);

    }
    @Test
    void  notCorrectAddUserInUserRepository(){
        userTwo.authenticate("Error", "Error");
        assertThatThrownBy(() -> userRepository.addUser(userTwo)).
                isInstanceOf(RuntimeException.class).
                hasMessage("Пользователь не прошел аутентификацию!");
    }

    @Test
    void checkNameUserTrue(){
        userRepository.addUser(userOne);
        assertTrue(userRepository.findByName("Login1"));
    }

    @Test
    void checkFalseUserName(){
        userRepository.addUser(userOne);
        assertFalse(userRepository.findByName("User"));
    }
}
