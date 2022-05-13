package co.micol.miniprj.mapver;

import java.io.IOException;

public class Activity {
	PuppyService sub = new PuppyService();
	int num;
//	public static int cSleep = 0;
//	public static int cEat = 0;
//	public static int cWalk = 0;
//	public static int cWash = 0;

	int a = 0, b = 0, c = 0, d = 0;

	public void selectActivity(int num, String name) {
//		sub.limitState(a, b, c, d); // 상태 상한 100 하한 0

		switch (num) {
		// 잠 //map.replace(key, value);
		case 1:

			System.out.println(name + "가 잠을 잡니다.");
			runPause();
			System.out.println("쿨쿨zz");

			runPause();
			System.out.println("잘 잤다");
			a = sub.map.get(name)[0] += 10;
			b = sub.map.get(name)[1] -= 10;
			c = sub.map.get(name)[2] += 50;
			d = sub.map.get(name)[3] -= 20;
			sub.map.get(name)[4] ++;
			
			break;
		// 식사
		case 2:

			System.out.println(name + "가 식사를 합니다.");
			runPause();
			System.out.println("냠냠");

			runPause();
			System.out.println("잘 먹었다");

			a = sub.map.get(name)[0] += 10;
			b = sub.map.get(name)[1] -= 10;
			c = sub.map.get(name)[2] += 10;
			d = sub.map.get(name)[3] += 50;
			sub.map.get(name)[5] ++;
			
			break;

		case 3:
			if (sub.map.get(name)[2] < 50) {
				System.out.println("산책을 가기엔 " + name + "가 너무 피곤해요");
				System.out.println(name + "를 재워주세요");

			} else if (sub.map.get(name)[3] < 50) {
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

			a = sub.map.get(name)[0] -= 20;
			b = sub.map.get(name)[1] = 100;
			c = sub.map.get(name)[2] -= 20;
			d = sub.map.get(name)[3] -= 20;
			sub.map.get(name)[7] ++;
			break;
		}

		if (a > 100) {
			a = 100;
		} else if (a < 0) {
			a = 0;
		}
		if (b > 100) {
			b = 100;
		} else if (b < 0) {
			b = 0;
		}

		if (c > 100) {
			c = 100;
		} else if (c < 0) {
			c = 0;
		}

		if (d > 100) {
			d = 100;
		} else if (d < 0) {
			d = 0;
		}
		sub.stateTable(a, b, c, d);
	}

	public void randomEnv(String name) {
		int env = (int) (Math.random() * 4);
		switch (env) {
		case 0:
			System.out.println("무난하게 산책을 했어요!");

			a = sub.map.get(name)[0] += 50;
			b = sub.map.get(name)[1] -= 30;
			c = sub.map.get(name)[2] -= 30;
			d = sub.map.get(name)[3] -= 30;
			sub.map.get(name)[6] ++;
			break;
		case 1:
			System.out.println("헉.. 무서운 강아지가 다가오고 있어요!!");
			runPause();
			System.out.println("겁많은 강아지 " + name + "가 집으로 가자고 하네요 ㅠㅠ");
			runPause();
			System.out.println("산책 실패!");
			System.out.println(name + "의 행복도가 0이 되었습니다.");

			a = sub.map.get(name)[0] = 0;
			b = sub.map.get(name)[1] -= 30;
			c = sub.map.get(name)[2] -= 30;
			d = sub.map.get(name)[3] -= 30;

			break;

		case 2:
			System.out.println(name + "의 절친 강아지인 복덩이를 만났어요!");
			runPause();
			System.out.println(name + "와 복덩이가 신나게 놀아요");
			runPause();
			System.out.println(name + "의 행복도가 정점을 찍었어요");

			a = sub.map.get(name)[0] = 100;
			b = sub.map.get(name)[1] -= 30;
			c = sub.map.get(name)[2] -= 30;
			d = sub.map.get(name)[3] -= 30;
			sub.map.get(name)[6] ++;
			break;
		case 3:
			System.out.println("앗.. 비가 오네요 ");
			System.out.println("");
			runPause();
			System.out.println(Menu.userName + "님, 견주로써 산책 전에 날씨 체크도 안하시나요? 집으로 돌아가세요");
			runPause();
			System.out.println("산책 실패!");
			System.out.println(name + "의 모든 상태가 최저치가 되었습니다.");

			a = sub.map.get(name)[0] = 0;
			b = sub.map.get(name)[1] = 0;
			c = sub.map.get(name)[2] = 0;
			d = sub.map.get(name)[3] = 0;

			break;
		}
	}

	public static void runPause() {
		pause();
		System.out.println(" ");
		pause();
	}

	public static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
