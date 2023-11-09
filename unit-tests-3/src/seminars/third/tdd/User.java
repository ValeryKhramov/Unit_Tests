package seminars.third.tdd;

public class User {
/*    Разработайте класс User с методом аутентификации по логину и паролю. Метод должен возвращать true, если
    введенные логин и пароль корректны, иначе false. Протестируйте все методы*/

    String name;
    String password;

    boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            this.isAuthenticate = true;
            return true;
        }
        return false;
    }

}