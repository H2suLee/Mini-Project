package co.self.miniprj.listver;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);

	PuppyService serv = new PuppyService();
	Activity act = new Activity();
	Evaluate eval = new Evaluate();

	static String userName;

	// 사용자 이름 등록
	private String getUserName() {
		sc.nextLine();
		System.out.println("사용자의 이름을 등록해 주세요.");
		userName = sc.nextLine();
		return userName;
	}

	private void title0() {
		System.out.println();

		System.out.println(
				"♡⑅*ॱ˖•. ·͙*̩̩͙˚̩̥̩̥*̩̩̥͙·̩̩̥͙*̩̩̥͙˚̩̥̩̥*̩̩͙ .•˖ॱ*⑅♡♡⑅*ॱ˖•. ·͙*̩̩͙˚̩̥̩̥*̩̩̥͙·̩̩̥͙*̩̩̥͙˚̩̥̩̥*̩̩͙ .•˖ॱ*⑅♡♡⑅*ॱ˖•. ·͙*̩̩͙˚̩̥̩̥*̩̩̥͙·̩̩̥͙*̩̩̥͙˚̩̥̩̥*̩̩͙ .•˖ॱ*⑅♡♡⑅");
		System.out.println();
		System.out.println("\t\t▀(`“ •. (`“•.¸🌹¸.•“´) ¸. •“´)\r\n" + "\n" + "\t\t 🌸«•🍃 W E L C O M E 🍃•“»🌸\r\n"
				+ "\n" + "\t\t(¸. • “´(¸.•“´🌹 `“•)` “° •.¸)\n");
		System.out.println("\t       강아지 돌보기 게임에 오신 것을 환영합니다. ");
		System.out.println("\t    먼저 게임 시작을 눌러 사용자의 이름을 등록해 주세요. ");
		System.out.println("    다음으로 강아지 등록하기 페이지에서 키우고 싶은 강아지의 이름을 등록해 주세요. ");
		System.out.println("\t\t원하는 만큼 강아지를 등록할 수 있습니다!");
		Activity.runPause();
		System.out.println("\t\t등록한 강아지들 중 한 마리를 선택하여");
		System.out.println("\t   잠, 식사, 산책, 목욕의 활동을 하며 강아지를 돌봐주세요.");
		System.out.println("     위 활동들은 강아지의 상태 - 행복, 청결, 피로, 포만감 - 에 영향을 줍니다.");
		Activity.runPause();
		System.out.println("\t      게임을 종료하는 즉시 강아지들의 하루는 끝이 납니다.");
		System.out.println("   강아지들의 누적 활동 수와 상태에 따라 사용자의 견주 자질을 평가하는 평가서가 출력됩니다!");
		System.out.println("\t\t     그럼 게임을 시작해 보세요.");
		System.out.println();
		System.out.println(
				"♡⑅*ॱ˖•. ·͙*̩̩͙˚̩̥̩̥*̩̩̥͙·̩̩̥͙*̩̩̥͙˚̩̥̩̥*̩̩͙ .•˖ॱ*⑅♡♡⑅*ॱ˖•. ·͙*̩̩͙˚̩̥̩̥*̩̩̥͙·̩̩̥͙*̩̩̥͙˚̩̥̩̥*̩̩͙ .•˖ॱ*⑅♡♡⑅*ॱ˖•. ·͙*̩̩͙˚̩̥̩̥*̩̩̥͙·̩̩̥͙*̩̩̥͙˚̩̥̩̥*̩̩͙ .•˖ॱ*⑅♡♡⑅");
		System.out.println();

	}

	private void title1() {
		System.out.println("✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧");
		System.out.println();
		System.out.println("  1. 게임 시작하기");
		System.out.println("  2. 그냥 안 할래요");
		System.out.println();
		System.out.println("✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧");

	}

	private void title2() {
		System.out.println();
		System.out.println("꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷");
		System.out.println();
		System.out.println("  1. 강아지 등록하기");
		System.out.println("  2. 강아지 선택하기");
		System.out.println("  3. 강아지 개명하기");
		System.out.println("  0. 돌아가기");
		System.out.println();
		System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");

	}

	private void title3() {
		System.out.println();
		System.out.println("꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷");
		System.out.println();
		System.out.println("  1. 상태 확인하기");
		System.out.println("  2. 활동하기");
		System.out.println("  0. 돌아가기");
		System.out.println("  9. 종료하기");
		System.out.println();
		System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
	}

	private void title4() { // 활동하기
		System.out.println();
		System.out.println("꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷");
		System.out.println();
		System.out.println("  1. 잠");
		System.out.println("  2. 식사");
		System.out.println("  3. 산책");
		System.out.println("  4. 목욕");
		System.out.println("  0. 돌아가기");
		System.out.println();
		System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
	}

	private void menu0() {
		title0();
		Activity.runPause();
		menu1();
	}

	private void menu1() {
		boolean b = false;
		do {
			title1();
			System.out.println("선택 ฅ🐾");
			int menu1 = Integer.parseInt(sc.next());
			switch (menu1) {
			case 1: // 게임 시작
				getUserName();
				System.out.println();
				System.out.println("ฅ🐾 환영합니다. " + userName + "님 ! ฅ🐾 ");
				System.out.println("강아지를 등록하여 게임을 진행해 주세요.");
				System.out.println();
				menu2();
				break;
			case 2: // 그냥 안 할래요
				b = !b;
				break;
			default:
				System.out.println("잘못 입력하신 것 같네요! 다시 입력해 주세요.");
				break;
			}
		} while (!b);
	}

	private void menu2() { //
		boolean b = false;
		do {
			title2();
			System.out.println("선택 ฅ🐾");
			int menu2 = sc.nextInt();
			switch (menu2) {
			case 1: // 강아지 등록
				serv.register();
				break;
			case 2: // 강아지 선택하기
				if (PuppyService.list.size() == 0) {
					System.out.println("등록된 강아지가 없습니다.\n");
					break;
				} else
					System.out.println("게임을 진행할 강아지를 한 마리 선택하여 주세요 !");
				serv.listPuppy();
				System.out.println("선택 ฅ🐾");
				int index = sc.nextInt();
				System.out.println(PuppyService.list.get(index).name + " 선택되었습니다.");
				menu3(index);
				break;
			case 3: // 강아지 개명하기
				System.out.println("개명할 강아지를 선택해 주세요.");
				serv.listPuppy();
				System.out.println("선택 ฅ🐾");
				index = sc.nextInt();
				System.out.println("개명할 이름을 입력해 주세요.");
				String name = sc.next();
				Activity.runPause();
				System.out.println("　∧＿∧ \r\n" + "（｡･ω･｡)つ━☆・*。\r\n" + "⊂　　 ノ 　　　・゜\r\n" + "　しーＪ　　　°。+ * 。\r\n"
						+ "　　　　　　　　　.・゜\r\n" + "　　　　　　　　　゜｡ﾟﾟ･｡･ﾟﾟ。\r\n" + "　　　　　　　　　　ﾟ。　 　｡ﾟ\r\n"
						+ "　　　　　　　　　　　ﾟ･｡･ﾟ");
				Activity.runPause();
				System.out.print(PuppyService.list.get(index).name + "가 ");
				PuppyService.list.get(index).setName(name);
				System.out.println(PuppyService.list.get(index).name + "로 개명되었습니다!");
				break;
			case 0:
				menu1();
				break;
			default:
				System.out.println("잘못 입력하신 것 같네요! 다시 입력해 주세요.");
				break;
			}
		} while (!b);

	}

	private void menu3(int index) {
		boolean b = false;
		do {
			title3();
			int menu3 = sc.nextInt();
			switch (menu3) {
			case 1: // 상태 확인
				PuppyService.list.get(index).toString(index);
				break;
			case 2: // 활동
				menu4(index);
				break;
			case 0: // 돌아가기
				menu2();
				break;
			case 9: // 종료
				eval.eval();
				b = !b;
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력하신 것 같네요! 다시 입력해 주세요.");
				break;
			}
		} while (!b);
	}

	private void menu4(int index) {
		boolean b = false;
		do {
			title4();
			int menu4 = sc.nextInt();
			switch (menu4) {
			case 1:
			case 2:
			case 3:
			case 4:
				act.selectActivity(menu4, index);
				break;
			case 0:
				menu3(index);
				break;
			default:
				System.out.println("잘못 입력하신 것 같네요! 다시 입력해 주세요.");
				break;
			}
		} while (!b);
	}

	public void run() {
		menu0();
	}

}
