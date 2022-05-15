package co.self.miniprj.listver;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PuppyService {
	Scanner sc = new Scanner(System.in);
	Puppy puppy = new Puppy();
	static List<Puppy> list = new LinkedList<>();

	// 등록
	void register() {
		System.out.println("강아지 등록을 진행합니다.");
		System.out.println("강아지의 이름을 등록해 주세요.");
		String name = sc.nextLine();
		Puppy puppy = new Puppy(name);
		list.add(puppy);

		Activity.runPause();

		System.out.println("　∧＿∧ \r\n" + "（｡･ω･｡)つ━☆・*。\r\n" + "⊂　　 ノ 　　　・゜\r\n" + "　しーＪ　　　°。+ * 。\r\n"
				+ "　　　　　　　　　.・゜\r\n" + "　　　　　　　　　゜｡ﾟﾟ･｡･ﾟﾟ。\r\n" + "　　　　　　　　　　ﾟ。　 　｡ﾟ\r\n" + "　　　　　　　　　　　ﾟ･｡･ﾟ");

		System.out.println("  ˚✧₊⁎⁺˳✧༚. ˚✧₊⁎⁺˳✧༚. 강아지 등록 성공 !!");

		Activity.runPause();
		puppy.getInfo();
		System.out.println();
		listPuppy();
	}

	// 목록 출력
	void listPuppy() {

		System.out.println();
		System.out.println("╔═══════ -ˋˏ *.·:·.ฅ🐾.·:·.* ˎˊ- ════════╗");
		System.out.println("⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆ 현재까지 등록된 강아지 ⋆⁺₊⋆ ⋆⁺₊⋆ ⋆⁺₊⋆");

		for (Puppy name : list) {
			System.out.println("  " + list.indexOf(name) + " : " + name.getName());
		}

		System.out.println("╚════════════════════════════════════════╝");
		System.out.println();

	}
}
