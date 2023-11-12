package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class InMemoryBookRepositoryTest {
    InMemoryBookRepository inMemoryBookRepository;

    @BeforeEach
    void setUP() {
        inMemoryBookRepository = new InMemoryBookRepository();
    }

    @Test
    void checkFindBookIdInBookRepository() {
        assertThat(inMemoryBookRepository.findById("1")).isInstanceOf(Book.class);
    }

    @Test
    void checkFindAllBookInBookRepository() {
        assertThat(inMemoryBookRepository.findAll().size()).isEqualTo(2);
    }
}
