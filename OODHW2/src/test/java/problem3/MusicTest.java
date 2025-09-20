package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MusicTest {

  private Music music;
  private RecordingArtist artist;

  @BeforeEach
  void setUp() {
    artist = new RecordingArtist("Travis", "Scott");
    music = new Music(artist, "Astrothunder", 2018);
  }

  @Test
  void testGetCreator() {
    assertEquals(artist, music.getCreator());
  }

  @Test
  void testGetTitle() {
    assertEquals("Astrothunder", music.getTitle());
  }

  @Test
  void testGetYear() {
    assertEquals(2018, music.getYear());
  }
}