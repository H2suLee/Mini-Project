package co.micol.miniprj.draft2_1;

public class State {

	public static int happy; // 행복
	public static int clean; // 청결도
	public static int hp; // 피로도 낮을 수록 피곤
	public static int hunger; // 허기 낮을 수록 허기

	public static void initState() {

		happy = 50;
		clean = 50;
		hp = 50;
		hunger = 50;
	}

	public static void limitState() {
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
	
	public void getHappy(int happy) {
		if (happy > 100) {
			State.happy = 100;
		} else if (happy < 0) {
			State.happy = 0;
		} else {
			State.happy = happy;
		}
	}

	public void getClean(int clean) {
		if (clean > 100) {
			State.clean = 100;
		} else if (clean < 0) {
			State.clean = 0;
		} else {
			State.clean = clean;
		}
	}

	public void getHp(int hp) {
		if (hp > 100) {
			State.hp = 100;
		} else if (hp < 0) {
			State.hp = 0;
		} else {
			State.hp = hp;
		}
	}

	public void getHunger(int hunger) {
		if (hunger > 100) {
			State.hunger = 100;
		} else if (hunger < 0) {
			State.hunger = 0;
		} else {
			State.hunger = hunger;
		}
	}

	// 리스트 향상된 for문.. map, hasNext, next() 암튼 궁리해 보기
	public static void stateTable() {
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
