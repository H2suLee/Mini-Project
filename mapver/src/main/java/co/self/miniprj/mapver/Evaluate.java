package co.self.miniprj.mapver;

import java.util.Iterator;
import java.util.Set;

public class Evaluate {

	static int score;
	PuppyService sub = new PuppyService();

	void eval() {
		System.out.println();
		System.out.println("╔══════════ -ˋˏ *.·:·.ฅ🐾.·:·.* ˎˊ- ══════════╗");
		System.out.println("\t  ⋆⁺₊⋆ ⋆⁺₊⋆ " + Menu.userName + " 님의 평가결과 ⋆⁺₊⋆ ⋆⁺₊⋆");

		Set<String> keySet = PuppyService.map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String n = keyIterator.next();
			// 상태 요약
			sub.getInfo(n);

			// 활동 요약
			System.out.println("잠 : " + PuppyService.map.get(n)[4] + "회");
			System.out.println("식사 : " + PuppyService.map.get(n)[5] + "회");
			System.out.println("산책 : " + PuppyService.map.get(n)[6] + "회");
			System.out.println("목욕 : " + PuppyService.map.get(n)[7] + "회");
			System.out.println();

			// 견주 점수
			getScore(n);
		}
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

	private void getScore(String n) {

		if (PuppyService.map.get(n)[0] >= 50) {
			score += 10;
		}
		if (PuppyService.map.get(n)[1] >= 50) {
			score += 10;
		}
		if (PuppyService.map.get(n)[2] >= 50) {
			score += 10;
		}
		if (PuppyService.map.get(n)[3] >= 50) {
			score += 10;
		}
		if (PuppyService.map.get(n)[4] >= 2 && PuppyService.map.get(n)[4] < 5) {
			score += 15;
		}
		if (PuppyService.map.get(n)[5] >= 2 && PuppyService.map.get(n)[5] < 5) {
			score += 15;
		}
		if (PuppyService.map.get(n)[6] >= 1 && PuppyService.map.get(n)[6] < 4) {
			score += 15;
		}
		if (PuppyService.map.get(n)[7] >= 0 && PuppyService.map.get(n)[7] < 2) {
			score += 15;
		}
	}
	// 네 마리를 등록하고 각 만점을 얻었을 경우 총점 400점
	// (총점 / map.size()) / 10

	private void getResult() {
		System.out.println(Menu.userName + "님은 " + (score / PuppyService.map.size()) + "점짜리 견주입니다.");
		switch ((score / PuppyService.map.size()) / 10) {
		case 10:
		case 9:
			if(PuppyService.map.size()>1) {
			System.out.println("덕분에 댕댕이들이 행복한 하루를 보냈어요");
			} else
				System.out.println("덕분에 댕댕이가 행복한 하루를 보냈어요");
			break;
		default:
			System.out.println("아쉽지만 다음 번엔 더 잘할 수 있을 거예요!");
			break;
		}
		System.out.println();
	}

}
