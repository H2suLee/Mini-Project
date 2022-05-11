package co.micol.miniprj.draft2_1;

public class Evaluate {

	static int score;

	public static void eval() {
		System.out.println("╔════•| ✿ |•════════•| ✿ |•════════•| ✿ |•════╗");

		State.stateTable(); // 상태
		stateInfo(); // 메시지
		cResult(); // 강아지 활동 결과
		getScore();

		System.out.println("╚════•| ✿ |•════════•| ✿ |•════════•| ✿ |•════╝");
	}

	// 오늘 하루 활동 결과
	public static void cResult() {
		System.out.println("잠: " + Activity.cSleep + "회");
		System.out.println("식사: " + Activity.cEat + "회");
		System.out.println("산책: " + Activity.cWalk + "회");
		System.out.println("목욕: " + Activity.cWash + "회");
	}

	// 메시지 출력 Ending.summary()
	public static void stateInfo() {
		System.out.println(Puppy.p[0].name + "의 하루가 끝났습니다.");
		System.out.println(Puppy.p[0].name + "는 " + getStateSummary() + " 강아지네요.");

	}

	public static String getStateSummary() {
		String sum1 = null, sum2 = null, sum3 = null, sum4 = null;
		if (State.happy < 50) {
			sum1 = "불행하고";
		} else {
			sum1 = "행복하고";
			score += 10;
		}
		if (State.clean < 50) {
			sum2 = "지저분하고";
		} else {
			sum2 = "깨끗하고";
			score += 10;
		}
		if (State.hp < 50) {
			sum3 = "피곤하고";
		} else {
			sum3 = "활달하고";
			score += 10;
		}
		if (State.hunger < 50) {
			sum4 = "배고픈";
		} else {
			sum4 = "배부른";
			score += 10;
		}
		return sum1 + " " + sum2 + " " + sum3 + " " + sum4;
	}

	// 견주 점수
	// 하루에
	// 잠 2~4회 += 15
	// 식사 2~4회 += 15
	// 산책 1~3회 += 15
	// 목욕 0~1회 += 15
	// 이 미만, 초과는 마이너스
	// 행복, 청결, 체력, 포만 >= 50

	static void getScore() {
		if (Activity.cSleep >= 2 && Activity.cSleep < 5) {
			score += 15;
		}
		if (Activity.cEat >= 2 && Activity.cEat < 5) {
			score += 15;
		}
		if (Activity.cWalk >= 1 && Activity.cWalk < 4) {
			score += 15;
		}
		if (Activity.cWash >= 0 && Activity.cWash < 2) {
			score += 15;
		}

		System.out.println(Puppy.p[0].userName + "님은 " + score + "점짜리 견주입니다.");
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("덕분에 " + Puppy.p[0].name + "이가 행복한 하루를 보냈어요");
			break;
		default:
			System.out.println("다음 번엔 더 잘할 수 있을 거예요!");
			break;
		}
	}

}
