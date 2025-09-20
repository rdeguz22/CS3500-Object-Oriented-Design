package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecordingArtistTest {

  private RecordingArtist artist;

  @BeforeEach
  void setUp() {
    artist = new RecordingArtist("Travis", "Scott");
  }

  @Test
  void testGetFirstName() {
    assertEquals("Travis", artist.getFirstName());
  }

  @Test
  void testGetLastName() {
    assertEquals("Scott", artist.getLastName());
  }
}