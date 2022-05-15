package co.self.miniprj.listver;

public class Evaluate {

	static int score;
//	PuppyService sub = new PuppyService();

	void eval() {
		System.out.println();
		System.out.println("╔══════════ -ˋˏ *.·:·.ฅ🐾.·:·.* ˎˊ- ══════════╗");
		System.out.println("\t     " + Menu.userName + " 님의 견주 자질 평가 결과\n");

		for (int i = 0; i < PuppyService.list.size(); i++) {
			// 프로필, 상태 출력
			PuppyService.list.get(i).toString(i);

			// 활동 횟수 요약
			System.out.println("잠 : " + PuppyService.list.get(i).sleep + "회");
			System.out.println("식사 : " + PuppyService.list.get(i).eat + "회");
			System.out.println("산책 : " + PuppyService.list.get(i).walk + "회");
			System.out.println("목욕 : " + PuppyService.list.get(i).wash + "회");
			System.out.println("══════════════════════════════\n");
			// 누적 점수 계산
			getScore(i);
		}
		// 최종 결과
		Activity.runPause();
		getResult();

		System.out.println("╚═════════════════════════════════════════════╝");

	}

	// 오늘 하루 활동 결과

	// 견주 점수
	// 하루에

	// 잠 2~4회 += 15
	// 식사 2~4회 += 15
	// 산책 1~3회 += 15
	// 목욕 0~1회 += 15
	// 이 미만, 초과는 마이너스
	// 행복, 청결, 체력, 포만 >= 50이어야 += 10씩

	private void getScore(int index) {

		if (PuppyService.list.get(index).happy >= 50) {
			score += 10;
		}
		if (PuppyService.list.get(index).clean >= 50) {
			score += 10;
		}
		if (PuppyService.list.get(index).hp >= 50) {
			score += 10;
		}
		if (PuppyService.list.get(index).hunger >= 50) {
			score += 10;
		}
		if (PuppyService.list.get(index).sleep >= 2 && PuppyService.list.get(index).sleep < 5) {
			score += 15;
		}
		if (PuppyService.list.get(index).eat >= 2 && PuppyService.list.get(index).eat < 5) {
			score += 15;
		}
		if (PuppyService.list.get(index).walk >= 1 && PuppyService.list.get(index).walk < 4) {
			score += 15;
		}
		if (PuppyService.list.get(index).wash >= 0 && PuppyService.list.get(index).wash < 2) {
			score += 15;
		}
	}

	private void getResult() {
		System.out.println(Menu.userName + "님은 " + (score / PuppyService.list.size()) + "점짜리 견주입니다.");
		switch ((score / PuppyService.list.size()) / 10) {
		case 10:
		case 9:
			System.out.println("　           🌷🌸🌷🌸\r\n"
					+ "　　　 🌸🌷🌸🌷🌸\r\n"
					+ "　　　Λ🌷🌸🌷🌸🌷\r\n"
					+ "　　 ( ˘ ᵕ ˘🌷🌸🌷\r\n"
					+ "　　  ヽ つ＼　 ／\r\n"
					+ "　　　 UU  / 🎀 \\");
			if (PuppyService.list.size() > 1) {
				System.out.println("덕분에 강아지들이 행복한 하루를 보냈어요.");
			} else
				System.out.println("덕분에 강아지가 행복한 하루를 보냈어요.");
			break;
		default:
			System.out.println("．．．．．/)─―ヘ\r\n"
					+ "　　　━／　　　　＼\r\n"
					+ "　 ／　　　　●　　●丶\r\n"
					+ "　｜　　　　　　　▼　| \r\n"
					+ "　｜　　　　　　　亠ノ 　\r\n"
					+ "　 U￣U￣￣￣U￣￣U");
			System.out.println("아쉽지만 다음 번엔 더 잘할 수 있을 거예요!");
			break;
		}
		System.out.println();
	}

}
