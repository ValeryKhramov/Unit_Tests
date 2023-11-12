package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BookTest {
    Book book;
    @BeforeEach
    void setUP(){
        book = new Book("1", "Book1", "Author1");
    }
    @Test
    void checkBookGetId() {

        assertThat(book.getId()).isEqualTo("1");
    }

    @Test
    void checkBookGetTitle() {

        assertThat(book.getTitle()).isEqualTo("Book1");
    }

    @Test
    void checkBookGetAuthor() {

        assertThat(book.getAuthor()).isEqualTo("Author1");
    }

    @Test
    void checkBookSetId() {
        book.setId("2");
        assertThat(book.getId()).isEqualTo("2");
    }

    @Test
    void checkBookSetTitle() {
        book.setTitle("Book2");
        assertThat(book.getTitle()).isEqualTo("Book2");
    }

    @Test
    void checkBookSetAuthor() {
        book.setAuthor("Author2");
        assertThat(book.getAuthor()).isEqualTo("Author2");
    }
}
