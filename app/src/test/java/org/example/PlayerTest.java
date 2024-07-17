package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {
  @Test
  public void testDrawMonsters() {
    Player player = new Player();
    player.drawMonsters();
    assertEquals(8, player.deck.size());
  }

  @Test
  public void testToString() {
    Player player = new Player();
    player.drawMonsters();
    String deckString = player.toString();
    assertNotNull(deckString);
    assertFalse(deckString.isEmpty());
    String[] lines = deckString.split("\n");
    assertEquals(8, lines.length);
    for (String line : lines) {
      assertTrue(line.matches(".+:レア度\\[\\d\\]"));
    }
  }
}
