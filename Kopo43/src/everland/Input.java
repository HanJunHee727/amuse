package everland;

import java.util.Scanner;

public class Input {
	public static ExType exType = new ExType();
	public static Scanner scanner;
	/**
	 * 생성자 (한번은 무조건 시행)
	 */
	Input() {
		scanner = new Scanner(System.in);
	}
	/**
	 * 권종 선택
	 * @return
	 */
	public int inputDayNight() {
		System.out.println("권종을 선택하세요.");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
		exType.dn = scanner.nextInt();
		return exType.dn;
	}

	/**
	 * 주민번호 입력
	 * @return
	 */
	public String inputAge() {
		System.out.println("주민번호를 입력하세요.");
		exType.age = scanner.next();
		return exType.age;
	}
	/**
	 * 수량 입력
	 * @return
	 */
	public int inputMany() {
	    ExType exType = new ExType();
		System.out.println("몇개를 주문하시겠습니까? (최대 10개)");
		exType.num = scanner.nextInt();
		return exType.num;
	}
	/**
	 * 우대사항 입력
	 * @return
	 */
	public int inputSpecial() {
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음 (나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
		exType.special = scanner.nextInt();
		return exType.special;
	}
	/**
	 * 진행 여부 판별
	 * @return
	 */
	public int inputGoStop() {
		System.out.println("계속 발권 하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
		exType.type = scanner.nextInt();
		return exType.type;
	}
	
	/**
	 * 종료 전 마지막으로 진행 여부 판별
	 * @return
	 */
	public int restart() {
		System.out.println("계속 진행 (1. 새로운 주문, 2: 프로그램 종료 3: 이전 품목 데이터 4: 데이터 현황) ");
		exType.restart = scanner.nextInt();
		return exType.restart;
	}
	
}
