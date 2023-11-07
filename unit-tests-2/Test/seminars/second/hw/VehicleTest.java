package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUP() {
        car = new Car("BMW", "M5 VI (F90)", 2020);
        motorcycle = new Motorcycle("DUCATI", "STREETFIGHTER V2", 2023);
    }

    // Проверить, что экземпляр объекта Car также является экземпляром транспортного средства.
    @Test
    void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    //  Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void testCarHaveFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testMotorcycleHaveTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void checkSpeedCarInTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void checkSpeedMotorcycleInTestDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testFullStopInCarBeforeTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
        car.park();
        assertEquals(0, car.getSpeed());
    }
    @Test
    void testFullStopInMotorcycleBeforeTestDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}
