package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class BookServiceTest {
    InMemoryBookRepository inMemoryBookRepository;
    BookService bookService;


    @BeforeEach
    void setUP() {
        inMemoryBookRepository = mock(InMemoryBookRepository.class);
        bookService = new BookService(inMemoryBookRepository);

    }

    @Test
    void checkFindBookByIdInMemoryBookRepository() {
        when(inMemoryBookRepository.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));
        bookService.findBookById("1");

        verify(inMemoryBookRepository, times(1)).findById("1");
    }

    @Test
    void checkAllBookInBookRepository() {
        when(inMemoryBookRepository.findAll()).thenReturn(new ArrayList<>());

        bookService.findAllBooks();
        verify(inMemoryBookRepository, times(1)).findAll();

    }

}