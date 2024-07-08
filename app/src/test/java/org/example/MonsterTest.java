package org.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MonsterTest {
    @Test
    public void appHasAGreeting() {
    Monster classUnderTest = new Monster();
    assertNotNull("スライム", classUnderTest.summonMonster(0));
  }
}
