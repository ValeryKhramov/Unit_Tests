package seminars.fourth.card;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static javafx.beans.binding.Bindings.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */

    @Test
    void testPay(){
        CreditCard creditCard = mock(CreditCard.class); // Моковая заглушка
        PaymentForm paymentForm = new PaymentForm(creditCard);
        creditCard.charge(1200.00);
        verify(creditCard).charge(1200.00); // Проверяет что метод вызывался

    }


}