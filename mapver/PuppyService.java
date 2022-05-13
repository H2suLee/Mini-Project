package co.micol.miniprj.mapver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PuppyService {
	Scanner sc = new Scanner(System.in);
//	Puppy puppy= new Puppy();
	static final int MAX = 100;
	static final int MIN = 0;
	
	static Map<String, int[]> map = new HashMap<>();
	
	// 등록
	void register() {
		System.out.println("강아지 등록을 진행합니다..");

		System.out.println("강아지의 이름을 등록해 주세요");
		String name = sc.nextLine();
		
		// put()

		if (map.get(name) == null) {
			int[] arrPup = {50, 50, 50, 50, 0, 0, 0, 0};
			
 			
			map.put(name, arrPup);
			
			Activity.runPause();
			
			System.out.println("　∧＿∧ \r\n"
					+ "（｡･ω･｡)つ━☆・*。\r\n"
					+ "⊂　　 ノ 　　　・゜\r\n"
					+ "　しーＪ　　　°。+ * 。\r\n"
					+ "　　　　　　　　　.・゜\r\n"
					+ "　　　　　　　　　゜｡ﾟﾟ･｡･ﾟﾟ。\r\n"
					+ "　　　　　　　　　　ﾟ。　 　｡ﾟ\r\n"
					+ "　　　　　　　　　　　ﾟ･｡･ﾟ");
			
			System.out.println("강아지 등록 성공");
			
			Activity.runPause();
			
			System.out.println(name + "의 엄마가 되신 것을 축하합니다." + Menu.userName + "님!");
//			System.out.println("그럼 키우러 가볼까요..");
			
		} else {
			System.out.println("이미 존재하는 강아지입니다.");
		}
		listPuppy();
	}
	
	void getInfo(String name){
		if (map.get(name) == null) {
			System.out.println("존재하지 않는 강아지입니다..");
		} else 
		System.out.println("이름 : " + name);
//		int getHappy = map.get(name)[0];
		int getClean = map.get(name)[1];
		int getHp = map.get(name)[2];
		int getHunger = map.get(name)[3];
		stateTable(map.get(name)[0], getClean, getHp, getHunger);
	}
	void listPuppy() {
		System.out.println("⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆현재까지 등록된 강아지⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ");
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String n = keyIterator.next();
			System.out.print(n+"\t");
		}
		System.out.println();
		System.out.println("⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ");
	}
	
//	void limitState(int a, int b, int c, int d) {
//		if (getHappy > MAX) {
//			getHappy = MAX;
//		} else if (getHappy < MIN) {
//			getHappy = MIN;
//		}  
//		if (getClean > MAX) {
//			getClean = MAX;
//		} else if (getClean < MIN) {
//			getClean = MIN;
//		}
//		
//		if (getHp > MAX) {
//			getHp = MAX;
//		} else if (getHp < MIN) {
//			getHp = MIN;
//		}
//		
//		if (getHunger > MAX) {
//			getHunger = MAX;
//		} else if (getHunger < MIN) {
//			getHunger = MIN;
//		}
//	}
//	
	// 리스트 향상된 for문.. map, hasNext, next() 암튼 궁리해 보기
	void stateTable(int getHappy, int getClean, int getHp, int getHunger) {
		
//		System.out.println(name + "의 현재 상태입니다.");
		String o = "□", x = "■";
		System.out.print("행복 : ");
		for (int i = 1; i <= 10; i++) {
			if (getHappy / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print("청결도 : ");
		for (int i = 1; i <= 10; i++) {
			if (getClean / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print("체력 : ");
		for (int i = 1; i <= 10; i++) {
			if (getHp / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print("포만감 : ");
		for (int i = 1; i <= 10; i++) {
			if (getHunger / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
	}
	
	
	
	
}
