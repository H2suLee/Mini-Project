package co.self.miniprj.mapver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PuppyService {
	Scanner sc = new Scanner(System.in);
	
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
			
			System.out.println("  ˚✧₊⁎⁺˳✧༚. ˚✧₊⁎⁺˳✧༚. 강아지 등록 성공 !!");
			
			Activity.runPause();
			System.out.println(name + "의 엄마가 되신 것을 축하합니다. " + Menu.userName + "님!");
		} else {
			System.out.println("이미 존재하는 강아지입니다.");
		}
		listPuppy();
	}
	
	void getInfo(String name){
		if (map.get(name) == null) {
			System.out.println("존재하지 않는 강아지입니다..");
		} else 
		System.out.println("ฅ🐾 " + name);
		stateTable(map.get(name)[0], map.get(name)[1], map.get(name)[2], map.get(name)[3]);
	}
	void listPuppy() {
		System.out.println();
		System.out.println("╔═══════ -ˋˏ *.·:·.ฅ🐾.·:·.* ˎˊ- ════════╗");
		System.out.println("⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ 현재까지 등록된 강아지 ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆");
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String n = keyIterator.next();
			System.out.print("  " + n + "\t");
		}
		System.out.println();
		
		System.out.println("╚════════════════════════════════════════╝");
	}

	// 리스트 향상된 for문.. map, hasNext, next() 암튼 궁리해 보기
	void stateTable(int a, int b, int c, int d) {
//		System.out.println(name + "의 현재 상태입니다.");
		String o = "□", x = "■";
		System.out.print("행복 : ");
		for (int i = 1; i <= 10; i++) {
			if (a / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print("청결도 : ");
		for (int i = 1; i <= 10; i++) {
			if (b / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print("체력 : ");
		for (int i = 1; i <= 10; i++) {
			if (c / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
		System.out.print("포만감 : ");
		for (int i = 1; i <= 10; i++) {
			if (d / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
	}
	

	
	
	
	
}
