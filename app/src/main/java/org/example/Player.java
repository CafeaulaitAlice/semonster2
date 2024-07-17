package org.example;

import java.util.ArrayList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.deck.add(new Monster());
    }
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

  public void main() {
    System.out.println("Deck:user");
    for (int i = 0; i < this.deck.size(); i++) {
      System.out.println(this.deck.get(i).toString());
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Monster m : deck) {
      sb.append(m.toString()).append("\n");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Player player = new Player();
    player.drawMonsters();
    System.out.println(player);
  }
}
