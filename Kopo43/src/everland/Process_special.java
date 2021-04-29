package everland;

public class Process_special {
	static ExType exType = new ExType();
	/**
	 * 장애인 혜택 적용
	 * @param cost
	 * @return
	 */
	public static int Difficult(int cost) {
		exType.Special = "장애인";
		exType.special_announ = "*장애인 우대적용";
		cost = cost - ((cost / 100) * 40);
		return cost;
	}
	/**
	 * 국가유공자 혜택 적용
	 * @param cost
	 * @return
	 */
	public static int Merit(int cost) {
		exType.Special = "국가유공자";
		exType.special_announ = "*국가유공자 우대적용";
		cost = cost - ((cost / 100) * 50);
		return cost;
	}
	/**
	 * 다자녀 혜택 적용
	 * @param cost
	 * @return
	 */
	public static int Many_child(int cost) {
		exType.Special = "다자녀";
		exType.special_announ = "*다자녀 우대적용";
		cost = cost - ((cost / 100) * 20);
		return cost;
	}
	/**
	 * 임산부 혜택 적용
	 * @param cost
	 * @return
	 */
	public static int Mom(int cost) {
		exType.Special = "임산부";
		exType.special_announ = "*임산부 우대적용";
		cost = cost - ((cost / 100) * 15);
		return cost;
	}
	/**
	 * 우대적용 없음 
	 * @param cost
	 * @return
	 */
	public static int None(int cost) {
		exType.Special = "없음";
		exType.special_announ = "*우대적용 없음";
		return cost;
	}
}
