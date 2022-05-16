package co.self.miniprj.listver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Puppy {

	Scanner sc = new Scanner(System.in);

	String name, gender, birthday, personality;
	int happy, clean, hp, hunger, sleep, eat, walk, wash;

	Puppy() {

	}

	Puppy(String name) {
		super();
		this.name = name;
		this.gender = getGender();
		this.birthday = getBirthday();
		this.personality = getPersonality();

		this.happy = 50;
		this.clean = 50;
		this.hp = 50;
		this.hunger = 50;

		this.sleep = 0;
		this.eat = 0;
		this.walk = 0;
		this.wash = 0;
	}

	private String getBirthday() {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일");
		return simple.format(date);
	}

	private String getGender() {
		// 남자, 여자 둘 중 하나
		String[] genderRandom = { "남자", "여자" };
		return genderRandom[(int) (Math.random() * 2)];
	}

	private String getPersonality() {
		String[] personalityRandom = { "온순하고 무던한", "활달하고 용감한", "다소 공격적인", "사랑스럽고 애교많은", "낯가리고 수줍은" };
		return personalityRandom[(int) (Math.random() * 5)];
	}

	void getInfo() {
		System.out.println(this.name + "의 엄마가 되신 것을 축하합니다. " + Menu.userName + "님!");
		System.out.println(
				this.name + "는 " + this.birthday + "에 태어난 " + this.personality + " 성격을 가진 귀여운 " + this.gender + " 강아지예요.");
	}

	
	public String toString(int index) {
		System.out.println("♥ " + this.name + " ♥");
		System.out.println("성별 : " + this.gender);
		System.out.println("생일 : " + this.birthday);
		System.out.println("성격 : " + this.personality + " 성격");
		System.out.println("상태 : ");
		stateTable(index);
		return null;
	}

	static void stateTable(int index) {
		String o = "□", x = "■";
		System.out.print(" > 행복 ");
		for (int i = 1; i <= 10; i++) {
			if (PuppyService.list.get(index).happy / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print(" > 청결도 ");
		for (int i = 1; i <= 10; i++) {
			if (PuppyService.list.get(index).clean / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print(" > 체력 ");
		for (int i = 1; i <= 10; i++) {
			if (PuppyService.list.get(index).hp / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print(" > 포만감 ");
		for (int i = 1; i <= 10; i++) {
			if (PuppyService.list.get(index).hunger / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
	}
	
	// listPuppy 기능 getter로
	String getName() {
		return this.name;
	}
	
	// 개명 기능 setter로
	public void setName(String name) {
		this.name = name;
	}
	
	// setter로 상태 상한 하한
	public void setHappy(int happy) {
		if (happy > 100) {
			this.happy = 100;
		} else if (happy < 0) {
			this.happy = 0;
		} else
			this.happy = happy;
	}

	public void setClean(int clean) {
		if (clean > 100) {
			this.clean = 100;
		} else if (clean < 0) {
			this.clean = 0;
		} else
			this.clean = clean;
	}

	public void setHp(int hp) {
		if (hp > 100) {
			this.hp = 100;
		} else if (hp < 0) {
			this.hp = 0;
		} else
			this.hp = hp;
	}

	public void setHunger(int hunger) {
		if (hunger > 100) {
			this.hunger = 100;
		} else if (hunger < 0) {
			this.hunger = 0;
		} else
			this.hunger = hunger;
	}

}
