package co.self.miniprj.oneindexarrver;

public class Evaluate {

	int score;

	void eval() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		State.stateTable();
		summaryState(); // 강아지 상태 요약
		summaryActivity(); // 강아지 활동 요약
		getScore(); // 견주 점수 메기기
		System.out.println("--------------------------------------------------------------------");
	}

	// 강아지 상태 요약
	private void summaryState() {
		System.out.println(Puppy.p[0].name + "의 하루가 끝났습니다.");
		System.out.println(Puppy.p[0].name + "는 " + getStateSummary() + " 강아지네요.");
	}

	// 강아지 활동 요약
	private void summaryActivity() {
		System.out.println("잠: " + Activity.cSleep + "회");
		System.out.println("식사: " + Activity.cEat + "회");
		System.out.println("산책: " + Activity.cWalk + "회");
		System.out.println("목욕: " + Activity.cWash + "회");
	}

	private String getStateSummary() {
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

	private void getScore() {
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

		System.out.println(Menu.userName + "님은 " + score + "점짜리 견주입니다.");
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("∧＿＿＿∧  　+      _ㅡ -♡\r\n"
					+ "( ♥▽♥ )つ _ㅡ -♡       _ㅡ -♡ +\r\n"
					+ "(つ　  /             _ㅡ -♡ \r\n"
					+ "｜　 _つ      _ㅡ -♡       _ㅡ -♡ ˚\r\n"
					+ "`し´\n");
			System.out.println("덕분에 " + Puppy.p[0].name + "이가 행복한 하루를 보냈어요");
			break;
		default:
			System.out.println("．．．．．/)─―ヘ\r\n" + "　　　━／　　 　　＼\r\n" + "　 ／　　　　●　　●丶\r\n" + "　｜　　　　　　　▼　| \r\n"
					+ "　｜　　　　　　　亠ノ 　\r\n" + "　 U￣U￣￣￣U￣￣U");
			System.out.println("다음 번엔 더 잘할 수 있을 거예요!");
			break;
		}
	}

}