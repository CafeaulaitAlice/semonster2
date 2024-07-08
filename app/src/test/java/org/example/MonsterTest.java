package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MonsterTest {
    @Test
    public void appHasAGreeting() {
    Monster classUnderTest = new Monster();
    assertNotNull("スライム", classUnderTest.summonMonster(0));
  }

  @Test
  public void testconstructor() {
    Monster m = new Monster("スライム", 0);;
    assertEquals("スライム:レア度[0]", m.toString());
  }
}
