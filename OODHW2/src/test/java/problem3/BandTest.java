package problem3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BandTest {

  private Band band;
  private RecordingArtist member1;
  private RecordingArtist member2;

  @BeforeEach
  void setUp() {
    member1 = new RecordingArtist("Kurt", "Cobain");
    member2 = new RecordingArtist("Dave", "Grohl");
    band = new Band("Nirvana", List.of(member1, member2));
  }

  @Test
  void testGetName() {
    assertEquals("Nirvana", band.getName());
  }

  @Test
  void testGetMembers() {
    List<RecordingArtist> members = band.getMembers();
    assertEquals(2, members.size());
    assertTrue(members.contains(member1));
    assertTrue(members.contains(member2));
  }
}