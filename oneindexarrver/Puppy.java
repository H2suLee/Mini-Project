package co.self.miniprj.oneindexarrver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Puppy {

	Scanner sc = new Scanner(System.in);
	String name, gender, birthday, personality;
	static Puppy[] p = new Puppy[1]; // 최대 한마리로 한정

	Puppy() {

	}

	Puppy(String name) {
		super();
		this.name = name;
		this.gender = getGender();
		this.birthday = getBirthday();
		this.personality = getPersonality();
	}

	private String getBirthday() {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일");
		return simple.format(date);
	}

	private String getGender() {
		// 남자, 여자 둘 중 하나
		String[] genderRandom = { "남자", "여자" };
		return genderRandom[(int) (Math.random() * 2)];
	}

	private String getPersonality() {
		String[] personalityRandom = { "온순하고 무던한", "활달하고 용감한", "다소 공격적인", "사랑스럽고 애교많은", "낯가리고 수줍은" };
		return personalityRandom[(int) (Math.random() * 5)];
	}

	void register() {
		System.out.println("강아지 등록을 진행합니다.");
		System.out.println("강아지의 이름을 등록해 주세요");
		String name = sc.nextLine();

		Puppy pup = new Puppy(name);
		p[0] = pup;
		p[0].getInfo();
	}

	private void getInfo() {
		System.out.println(this.name + "의 엄마가 되신 것을 축하합니다. " + Menu.userName + "님!");
		System.out.println(this.name + "는 " + this.birthday + "에 태어난 " + this.personality + " 성격을 가진 귀여운 " + this.gender
				+ " 강아지예요.");
		System.out.println("그럼 키우러 가 볼까요?");
	}

	// 개명
	void changeName() {
		System.out.println("어떤 이름으로 바꿀까요?");
		String cn = sc.nextLine();
		System.out.print(p[0].name);
		p[0].name = cn;
		System.out.print("가 " + p[0].name + "으로 개명되었습니다 !\n");
	}

}
