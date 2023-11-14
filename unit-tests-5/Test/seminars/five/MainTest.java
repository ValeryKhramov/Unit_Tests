package seminars.five;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;
import seminars.third.tdd.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    RandomNumberModule randomNumberModule;
    MaxNumberModule maxNumberModule;

    @BeforeEach
    void setUP() {
        randomNumberModule = new RandomNumberModule();
        maxNumberModule = new MaxNumberModule();

    }

    //5.1.
    @Test
    void checkRandomNumberModuleGenerate() {
        List<Integer> result = randomNumberModule.generate(5);
        assertThat(result.size()).isEqualTo(5);

    }

    @Test
    void checkGetMaxNumberInList() {
        List<Integer> result = new ArrayList<>(Arrays.asList(1, 4, 6, 7, 9, 15));
        assertThat(maxNumberModule.getMaxNumber(result)).isEqualTo(15);
    }

    @Test
    void checkRelationsRandomNumberModuleWithMaxNumberModule() {
        List<Integer> result = randomNumberModule.generate(5);
        assertThat(maxNumberModule.getMaxNumber(result)).isEqualTo(Collections.max(result));

    }

    //5.2.
    @Test
    void relationBetweenUserServiceAndUserRepository() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String user = userService.getUserName(0);
        assertEquals("User 0", user);
    }
    //5.3.
    @Test
    void relationsOrderAndPaymentServices(){
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);
        boolean result = orderService.placeOrder("123",1200D);

        assertTrue(result);

    }

}