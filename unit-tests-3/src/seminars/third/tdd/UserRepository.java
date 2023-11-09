package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
/*    Добавьте класс UserRepository для управления пользователями. В этот класс должен быть включен метод
    addUser, который добавляет пользователя в систему, если он прошел аутентификацию. Покройте тестами новую
            функциональность*/

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticate) {
            data.add(user);
        } else {throw new RuntimeException("Пользователь не прошел аутентификацию!");}
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}