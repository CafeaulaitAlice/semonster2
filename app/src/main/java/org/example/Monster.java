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
    if (this.rare >= 3){
      this.evolve();
    }
  }

  // コンストラクタ（引数あり）
  public Monster(String name, int rare) {
    this.name = name;
    this.rare = rare;
    if (this.rare >= 3){
      this.evolve();
    }
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  void evolve() {
    String evolvedMonsters[] = { "キングスライム", "サハギンキング", "ドラゴンキング", "デュラハンキング", "リヴァイアサン" };
    int index = getMonsterIndex(this.name);
    if (index != -1) {
      this.name = evolvedMonsters[index];
    }
  }

  int getMonsterIndex(String name) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    for (int i = 0; i < monsters.length; i++) {
      if (monsters[i].equals(name)) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }

  public static void main(String[] args) {
    System.out.println(new Monster("スライム", 0).toString());
    System.out.println(new Monster("ドラゴン", 3).toString());
  }
}



