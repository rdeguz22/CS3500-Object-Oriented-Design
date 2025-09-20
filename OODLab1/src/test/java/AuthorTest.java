import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    private Author rico;

    @BeforeEach
    void setup() {
        rico = new Author("Rico de Guzman", "deguzman.r@northeastern.edu", "1000 Lenora St., Seattle, WA");
    }

    @Test
    void getName() {
        assertEquals("Rico de Guzman", rico.getName());
    }

    @Test
    void getEmail() {
        assertEquals("deguzman.r@northeastern.edu", rico.getEmail());
    }

    @Test
    void getAddress() {
        assertEquals("1000 Lenora St., Seattle, WA", rico.getAddress());
    }
}