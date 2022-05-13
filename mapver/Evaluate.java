package co.micol.miniprj.mapver;

import java.util.Iterator;
import java.util.Set;

public class Evaluate {

	static int score;
	PuppyService sub = new PuppyService();

	void eval() {
		int total = 0;
		System.out.println("╔════•| ✿ |•════════•| ✿ |•════════•| ✿ |•════╗");

		Set<String> keySet = sub.map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String n = keyIterator.next();
			// 상태 요약
			sub.getInfo(n);

			// 활동 요약
			System.out.println("잠 : " + sub.map.get(n)[4] + "회");
			System.out.println("식사 : " + sub.map.get(n)[5] + "회");
			System.out.println("산책 : " + sub.map.get(n)[6] + "회");
			System.out.println("목욕 : " + sub.map.get(n)[7] + "회");

			// 견주 점수
			total += getScore(n);
		}
		getResult(total);
		System.out.println("╚════•| ✿ |•════════•| ✿ |•════════•| ✿ |•════╝");
	}

	// 오늘 하루 활동 결과

	// 견주 점수
	// 하루에
	// 잠 2~4회 += 15
	// 식사 2~4회 += 15
	// 산책 1~3회 += 15
	// 목욕 0~1회 += 15
	// 이 미만, 초과는 마이너스
	// 행복, 청결, 체력, 포만 >= 50

	int getScore(String n) {
		
		if (sub.map.get(n)[0] >= 50) {
			score += 10;
		}
		if (sub.map.get(n)[1] >= 50) {
			score += 10;
		}
		if (sub.map.get(n)[2] >= 50) {
			score += 10;
		}
		if (sub.map.get(n)[3] >= 50) {
			score += 10;
		}
		if (sub.map.get(n)[4] >= 2 && sub.map.get(n)[4] < 5) {
			score += 15;
		}
		if (sub.map.get(n)[5] >= 2 && sub.map.get(n)[5] < 5) {
			score += 15;
		}
		if (sub.map.get(n)[6] >= 1 && sub.map.get(n)[6] < 4) {
			score += 15;
		}
		if (sub.map.get(n)[7] >= 0 && sub.map.get(n)[7] < 2) {
			score += 15;
		}
		
		return score;
	}
		// 네 마리를 등록하고 각 만점을 얻었을 경우 총점 400점
		// (총점 / map.size()) / 10

	void getResult(int total) {

		System.out.println(Menu.userName + "님은 " + (total / sub.map.size()) + "점짜리 견주입니다.");
		switch ((total / sub.map.size()) / 10) {
		case 10:
		case 9:
			System.out.println("덕분에 댕댕이들이 행복한 하루를 보냈어요");
			break;
		default:
			System.out.println("아쉽지만 다음 번엔 더 잘할 수 있을 거예요!");
			break;
		}
	}

}
