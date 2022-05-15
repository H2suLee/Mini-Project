package co.self.miniprj.listver;

import java.io.IOException;

public class Activity {
//	PuppyService sub = new PuppyService();
//	int num;

	void selectActivity(int menu4, int index) {
		String name = PuppyService.list.get(index).name;
		int happy = PuppyService.list.get(index).happy;
		int clean = PuppyService.list.get(index).clean;
		int hp = PuppyService.list.get(index).hp;
		int hunger = PuppyService.list.get(index).hunger;

		switch (menu4) {
		case 1:

			System.out.println(name + "가 잠을 잡니다.");
			runPause();
			System.out.println("쿨쿨zz");
			runPause();
			System.out.println("잘 잤다");

			happy += 10;
			clean -= 10;
			hp += 50;
			hunger -= 20;
			PuppyService.list.get(index).sleep++;

			break;
		// 식사
		case 2:

			System.out.println(name + "가 식사를 합니다.");
			runPause();
			System.out.println("냠냠");
			runPause();
			System.out.println("잘 먹었다");

			happy += 10;
			clean -= 10;
			hp += 10;
			hunger += 50;
			PuppyService.list.get(index).eat++;

			break;

		case 3:
			if (hp < 50) {
				System.out.println("산책을 가기엔 " + name + "가 너무 피곤해요");
				System.out.println(name + "를 재워주세요");

			} else if (hunger < 50) {
				System.out.println("산책을 가기엔 " + name + "가 너무 배고파요");
				System.out.println(name + "에게 밥을 주세요");
			} else {
				System.out.println(name + "가 산책을 합니다.");
				runPause();
				// 랜덤 환경 설정
				int env = (int) (Math.random() * 4);
				switch (env) {
				case 0:
					System.out.println("무난하게 산책을 했어요!");

					happy += 50;
					clean -= 30;
					hp -= 30;
					hunger -= 30;
					PuppyService.list.get(index).walk++;

					break;

				case 1:
					System.out.println("헉.. 무서운 강아지가 그르렁대며 계속 따라오네요!");
					runPause();
					System.out.println("일단 " + name + "와 집으로 가는 것이 좋겠어요 ㅠㅠ");
					runPause();
					System.out.println("산책 실패!");
					System.out.println(name + "의 행복도가 0이 되었습니다.");

					happy = 0;
					clean -= 30;
					hp -= 30;
					hunger -= 30;
					break;

				case 2:
					System.out.println(name + "의 절친 강아지인 복덩이를 만났어요!");
					runPause();
					System.out.println(name + "와 복덩이가 신나게 놀아요");
					runPause();
					System.out.println(name + "의 행복도가 정점을 찍었어요");

					happy = 100;
					clean -= 30;
					hp -= 30;
					hunger -= 30;
					PuppyService.list.get(index).walk++;

					break;

				case 3:
					System.out.println("앗.. 비가 오네요 ");
					System.out.println("");
					runPause();
					System.out.println(Menu.userName + "님, 견주로써 산책 전에 날씨 체크도 안하시나요? 집으로 돌아가세요");
					runPause();
					System.out.println("산책 실패!");
					System.out.println(name + "의 모든 상태가 최저치가 되었습니다.");

					happy = 0;
					clean = 0;
					hp = 0;
					hunger = 0;

					break;
				}
			}
			break;
		case 4:
			System.out.println(name + "가 목욕을 합니다.");
			pause();
			System.out.println("쓱싹쓱싹");
			runPause();
			System.out.println("잘 씻었다..");

			happy -= 20;
			clean = 100;
			hp -= 20;
			hunger -= 20;
			PuppyService.list.get(index).wash++;
			break;
		}
		// 상한 하한 조정
		PuppyService.list.get(index).setHappy(happy);
		PuppyService.list.get(index).setClean(clean);
		PuppyService.list.get(index).setHp(hp);
		PuppyService.list.get(index).setHunger(hunger);

		Puppy.stateTable(index);

	}

	static void runPause() {
		pause();
		System.out.println(" ");
		pause();
	}

	private static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
