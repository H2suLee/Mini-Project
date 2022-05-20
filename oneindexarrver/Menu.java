package co.self.miniprj.oneindexarrver;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	Puppy puppy = new Puppy();
	Evaluate result = new Evaluate();
	static String userName;

	// 사용자 이름 등록
	private String getUserName() {
		sc.nextLine();
		System.out.println("사용자의 이름을 등록해 주세요.");
		userName = sc.nextLine();
		return userName;
	}

	private void title0() {

		System.out.println("[ 게 임 설 명 ] ======================================================\n");

		System.out.println("( ( W E L C O M E ! ) )");
		System.out.println("강아지 돌보기 게임에 오신 것을 환영합니다. ");
		System.out.println("먼저 사용자의 이름과 강아지의 이름을 등록해 주세요.");

		Activity.runPause();

		System.out.println("그리고 잠, 식사, 산책, 목욕의 활동을 하며 강아지를 돌봐주세요. ");
		System.out.println("위 활동들은 강아지의 상태 - 행복, 청결, 피로, 포만감 - 에 영향을 줍니다.");

		Activity.runPause();

		System.out.println("게임을 종료하는 즉시 강아지의 하루는 끝이 납니다.");
		System.out.println("강아지의 누적 활동 수와 상태에 따라 사용자의 견주 자질을 평가하는 평가서가 출력됩니다!");
		System.out.println("그럼 게임을 시작해 보세요.");

		System.out.println("==================================================================");

	}

	private void title1() {
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println("1. 게임 시작하기  |  2. 그냥 안 할래요  ");
		System.out.println();
		System.out.println("------------------------------------------------");
	}

	private void title2() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		System.out.println("1. 강아지 등록하기  |  2. 강아지 개명하기  |  0. 돌아가기  |  9. 종료하기    ");
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
	}

	private void title3() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		System.out.println("1. 상태 확인하기  |  2. 활동하기  |  0. 돌아가기  |  9. 종료하기    ");
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
	}

	private void title4() { // 활동하기
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		System.out.println("1. 잠");
		System.out.println("2. 식사");
		System.out.println("3. 산책");
		System.out.println("4. 목욕");
		System.out.println("0. 돌아가기"); // -> title3
		System.out.println("9. 종료하기");
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
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
			System.out.println("선택");
			int menu1 = Integer.parseInt(sc.next());
			switch (menu1) {
			case 1: // 게임 시작
				getUserName();
				System.out.println();
				System.out.println("*♡* 환영합니다. " + userName + "님 ! *♡*");
				System.out.println("강아지를 등록하여 게임을 진행해 주세요.");
				menu2();
				break;
			case 2: // 그냥 안 할래요
				b = !b;
				System.exit(0);
				break;
			default:
				break;
			}
		} while (!b);
	}

	private void menu2() { //
		boolean b = false;
		do {
			title2();
			System.out.println("선택");
			int menu2 = sc.nextInt();
			
			switch (menu2) {
			case 1: // 강아지 등록
				if (Puppy.p[0] != null) {
					System.out.println("강아지는 한 마리만 등록할 수 있습니다.");
				} else {
					sc.nextLine();
					puppy.register();
					State.initState();
					menu3();
				}
				break;
			case 2: // 개명하기
				if (Puppy.p[0] == null) {
					System.out.println("등록된 강아지가 없습니다.\n");
					break;
				} else {
					puppy.changeName();
				}
			case 0: // 돌아가기
				menu1();
				break;
			case 9: // 종료하기
				if (Puppy.p[0] == null) {
					System.exit(0);
				} else
					result.eval();
					b = !b;
					System.exit(0);
				break;
			default:
				break;
			}
		} while (!b);

	}

	private void menu3() {
		boolean b = false;
		do {
			title3();
			int menu3 = sc.nextInt();
			switch (menu3) {
			case 1: // 상태 확인
				State.stateTable();
				break;
			case 2: // 활동
				menu4();
				break;
			case 0: // 돌아가기
				menu2();
				break;
			case 9: // 종료
				result.eval();
				b = true;
				System.exit(0);
				break;
			default:
				break;
			}
		} while (!b);
	}

	public void menu4() {

		boolean b = false;
		do {
			title4();
			int menu4 = sc.nextInt();
			switch (menu4) {
			case 1:
			case 2:
			case 3:
			case 4:
				Activity act = new Activity();
				act.selectActivity(menu4);
				break;
			case 0:
				System.out.println("돌아가기");
				menu3();
				break;
			case 9: // 종료
				result.eval();
				b = true;
				System.exit(0);
				break;
			}
		} while (!b);
	}

	public void run() {
		menu0();
	}

}