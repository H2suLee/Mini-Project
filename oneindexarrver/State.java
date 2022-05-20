package co.self.miniprj.oneindexarrver;

public class State {

	static int happy, clean, hp, hunger; 

	static void initState() {
		happy = 50;
		clean = 50;
		hp = 50;
		hunger = 50;
	}
	
	// state 상한 하한
	static void limitState() {
		if (happy > 100) {
			State.happy = 100;
		} else if (happy < 0) {
			State.happy = 0;
		}
		
		if (clean > 100) {
			State.clean = 100;
		} else if (clean < 0) {
			State.clean = 0;
		}
		
		if (hp > 100) {
			State.hp = 100;
		} else if (hp < 0) {
			State.hp = 0;
		}
		
		if (hunger > 100) {
			State.hunger = 100;
		} else if (hunger < 0) {
			State.hunger = 0;
		}
	}
	

	static void stateTable() {
		System.out.println(Puppy.p[0].name + "의 현재 상태입니다.");
		String o = "□", x = "■";
		System.out.print("행복 : ");
		for (int i = 1; i <= 10; i++) {
			if (happy / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print("청결도 : ");
		for (int i = 1; i <= 10; i++) {
			if (clean / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print("체력 : ");
		for (int i = 1; i <= 10; i++) {
			if (hp / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print("포만감 : ");
		for (int i = 1; i <= 10; i++) {
			if (hunger / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
	}
}
