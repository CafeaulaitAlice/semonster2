package org.example;


import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  // コンストラクタ
  Monster() {
    Random random = new Random();
    this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(5);
  }

  // コンストラクタ（引数あり）
  public Monster(String name, int rare) {
    this.name = name;
    this.rare = rare;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }

  public static void main(String[] args) {
    System.out.println(new Monster("スライム", 0).toString());
  }
}



