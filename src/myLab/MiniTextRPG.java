package myLab;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MiniTextRPG {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("==== Game Start ====");
		System.out.println("Please enter your name : ");
		String playerName = in.nextLine();

		Player p = new Player(playerName, 100, 20);
		boolean run = true;
		boolean run2 = true;

		while (run) {
			Monster m = MonsterFactory.getRandomMonster();
			System.out.println("Monster Appears!");

			System.out.println("\n++++ Combat start! ++++");
			System.out.printf("[ %s ] VS [ %s ]\n\n", p.name, m.name);

			while (run2) {
				System.out.println("Choose an action : \n0)exit 1)Attack 2)Run away 3)Status ");
				String input = in.nextLine();

				switch (input) {
				case "0":
					run = false;
					run2 = false;
					System.out.println("Game Over");
					break;
				case "1":
					p.attack(m);
					if (m.isAlive()) {
						m.attack(p);
					} else {
						System.out.printf("[ %s ] dead\n", m.name);
						p.gainExp(50);
						break;
					}
					break;
				case "2":
					System.out.println("You ran away!");
					break;
				case "3":
					System.out.println("\n---- Current Status ----\n");
					status(p.name, p.hp, m.name, m.hp);
					break;
				default:
					System.out.println("Incorrect input");
				}

				if (!p.isAlive()) {
					System.out.printf("[ %s ] dead. Game Over\n", p.name);
					run = false;
					run2 = false;
				}
			}
		}
	}

	public static void status(String plName, int plHp, String monName, int monHp) {
		System.out.printf("[ %s ] HP : %d \n", plName, plHp);
		System.out.printf("[ %s ] HP : %d \n\n", monName, monHp);
	}

}

class Player {
	String name;
	int hp;
	int maxHp;
	int attPower;
	int level;
	int exp;
	int expToLevelUp;

	public Player(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attPower = attack;
		this.level = 1;
		this.exp = 0;
		this.expToLevelUp = 100;
	}

	public void attack(Monster monster) {
		System.out.printf("[ %s ] attack [ %s ]\n", name, monster.name);
		monster.hp -= this.attPower;
		System.out.printf("[ %s ] HP : %d \n\n", monster.name, monster.hp);
	}

	public boolean isAlive() {
		return hp > 0;
	}

	public void gainExp(int amount) {
		exp += amount;
		System.out.println("경험치 " + amount + " 획득! 현재 EXP: " + exp + "/" + expToLevelUp);
		if (exp >= expToLevelUp) {
			levelUp();
		}
	}

	private void levelUp() {
		level++;
		exp = exp - expToLevelUp;
		expToLevelUp += 50;
		maxHp += 20;
		hp = maxHp;
		attPower += 5;
		System.out.println("🎉 레벨 업! Lv." + level + " (공격력: " + attPower + ", 최대 HP: " + maxHp + ")");
	}

	ArrayList<Item> inventory = new ArrayList<>();

	public void useItem(String itemName) {
		for (Item item : inventory) {
			if (item.name.equals(itemName)) {
				if (item.type.equals("potion")) {
					hp += item.value;
					if (hp > maxHp) {
						hp = maxHp;
					}
					System.out.println(name + "이(가) 포션을 사용해 HP를 회복했습니다! 현재 HP: " + hp);
					inventory.remove(item);
					return;
				} else if (item.type.equals("weapon")) {
					attPower += item.value;
					System.out.println("무기를 장착했습니다! 공격력 증가: +" + item.value);
					inventory.remove(item);
					return;
				}
			}
		}
		System.out.println("해당 아이템이 없습니다.");
	}

}

class Monster {
	String name;
	int hp;
	int attPower;

	public Monster(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attPower = attack;
	}

	public void attack(Player player) {
		System.out.printf("[ %s ] attack [ %s ]\n", name, player.name);
		player.hp -= this.attPower;
		System.out.printf("[ %s ] HP : %d \n\n", player.name, player.hp);
	}

	public boolean isAlive() {
		return hp > 0;
	}

}

class MonsterFactory {
	static Monster getRandomMonster() {
		Monster[] monsters = { new Monster("고블린", 60, 10), new Monster("오크", 80, 15), new Monster("슬라임", 40, 5),
				new Monster("드래곤", 150, 30) };

		int index = new Random().nextInt(monsters.length);
		return monsters[index];
	}
}

class Item {
	String name;
	String type; // "potion", "weapon"
	int value;

	public Item(String name, String type, int value) {
		this.name = name;
		this.type = type;
		this.value = value;
	}
}
