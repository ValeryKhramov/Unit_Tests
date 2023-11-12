package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {
    @Test
    void testNotificationService(){
        MessageService  messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);

        notificationService.sendNotification("Hello", "User");
        verify(messageService, times(1)).sendMessage("Hello", "User");
    }

}