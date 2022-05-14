package co.self.miniprj.mapver;

import java.io.IOException;

public class Activity {
	PuppyService sub = new PuppyService();
	int num;

	void selectActivity(int num, String name) {

		limitState(name);
		switch (num) {
		// 잠 //map.replace(key, value);
		case 1:

			System.out.println(name + "가 잠을 잡니다.");
			runPause();
			System.out.println("쿨쿨zz");

			runPause();
			System.out.println("잘 잤다");
			PuppyService.map.get(name)[0] += 10;
			PuppyService.map.get(name)[1] -= 10;
			PuppyService.map.get(name)[2] += 50;
			PuppyService.map.get(name)[3] -= 20;
			PuppyService.map.get(name)[4]++;

			break;
		// 식사
		case 2:

			System.out.println(name + "가 식사를 합니다.");
			runPause();
			System.out.println("냠냠");

			runPause();
			System.out.println("잘 먹었다");

			PuppyService.map.get(name)[0] += 10;
			PuppyService.map.get(name)[1] -= 10;
			PuppyService.map.get(name)[2] += 10;
			PuppyService.map.get(name)[3] += 50;
			PuppyService.map.get(name)[5]++;

			break;

		case 3:
			if (PuppyService.map.get(name)[2] < 50) {
				System.out.println("산책을 가기엔 " + name + "가 너무 피곤해요");
				System.out.println(name + "를 재워주세요");

			} else if (PuppyService.map.get(name)[3] < 50) {
				System.out.println("산책을 가기엔 " + name + "가 너무 배고파요");
				System.out.println(name + "에게 밥을 주세요");
			} else {
				System.out.println(name + "가 산책을 합니다.");
				runPause();
				// 랜덤 환경 설정
				randomEnv(name);
			}
			break;
		case 4:
			System.out.println(name + "가 목욕을 합니다.");
			pause();
			System.out.println("쓱싹쓱싹");
			runPause();
			System.out.println("잘 씻었다..");

			PuppyService.map.get(name)[0] -= 20;
			PuppyService.map.get(name)[1] = 100;
			PuppyService.map.get(name)[2] -= 20;
			PuppyService.map.get(name)[3] -= 20;
			PuppyService.map.get(name)[7]++;
			break;
		}

		sub.stateTable(PuppyService.map.get(name)[0], PuppyService.map.get(name)[1], PuppyService.map.get(name)[2],
				PuppyService.map.get(name)[3]);

	}

	private void randomEnv(String name) {
		int env = (int) (Math.random() * 4);
		switch (env) {
		case 0:
			System.out.println("무난하게 산책을 했어요!");

			PuppyService.map.get(name)[0] += 50;
			PuppyService.map.get(name)[1] -= 30;
			PuppyService.map.get(name)[2] -= 30;
			PuppyService.map.get(name)[3] -= 30;
			PuppyService.map.get(name)[6]++;
			break;
		case 1:
			System.out.println("헉.. 무서운 강아지가 다가오고 있어요!!");
			runPause();
			System.out.println("겁많은 강아지 " + name + "가 집으로 가자고 하네요 ㅠㅠ");
			runPause();
			System.out.println("산책 실패!");
			System.out.println(name + "의 행복도가 0이 되었습니다.");

			PuppyService.map.get(name)[0] = 0;
			PuppyService.map.get(name)[1] -= 30;
			PuppyService.map.get(name)[2] -= 30;
			PuppyService.map.get(name)[3] -= 30;

			break;

		case 2:
			System.out.println(name + "의 절친 강아지인 복덩이를 만났어요!");
			runPause();
			System.out.println(name + "와 복덩이가 신나게 놀아요");
			runPause();
			System.out.println(name + "의 행복도가 정점을 찍었어요");

			PuppyService.map.get(name)[0] = 100;
			PuppyService.map.get(name)[1] -= 30;
			PuppyService.map.get(name)[2] -= 30;
			PuppyService.map.get(name)[3] -= 30;
			PuppyService.map.get(name)[6]++;
			break;
		case 3:
			System.out.println("앗.. 비가 오네요 ");
			System.out.println("");
			runPause();
			System.out.println(Menu.userName + "님, 견주로써 산책 전에 날씨 체크도 안하시나요? 집으로 돌아가세요");
			runPause();
			System.out.println("산책 실패!");
			System.out.println(name + "의 모든 상태가 최저치가 되었습니다.");

			PuppyService.map.get(name)[0] = 0;
			PuppyService.map.get(name)[1] = 0;
			PuppyService.map.get(name)[2] = 0;
			PuppyService.map.get(name)[3] = 0;

			break;
		}
	}

	private void limitState(String name) {
		if (PuppyService.map.get(name)[0] > 100) {
			PuppyService.map.get(name)[0] = 100;
		} else if (PuppyService.map.get(name)[0] < 0) {
			PuppyService.map.get(name)[0] = 0;
		}
		if (PuppyService.map.get(name)[1] > 100) {
			PuppyService.map.get(name)[1] = 100;
		} else if (PuppyService.map.get(name)[1] < 0) {
			PuppyService.map.get(name)[1] = 0;
		}
		if (PuppyService.map.get(name)[2] > 100) {
			PuppyService.map.get(name)[2] = 100;
		} else if (PuppyService.map.get(name)[2] < 0) {
			PuppyService.map.get(name)[2] = 0;
		}
		if (PuppyService.map.get(name)[3] > 100) {
			PuppyService.map.get(name)[3] = 100;
		} else if (PuppyService.map.get(name)[3] < 0) {
			PuppyService.map.get(name)[3] = 0;
		}
	}

	public static void runPause() {
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
