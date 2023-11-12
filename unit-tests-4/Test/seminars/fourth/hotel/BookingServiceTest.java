package seminars.fourth.hotel;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {

    @Test
    void testBookingService(){
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);

        when(hotelService.isRoomAvailable(anyInt())).thenReturn(true, false);
        assertTrue(bookingService.bookRoom(2));
        assertFalse(bookingService.bookRoom(3));
    }
}