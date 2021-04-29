package everland;

public class Process_age {
	/**
	 * 주간의 경우. 주민 앞자리 2자리가 xx 일때에 따라 유아, 청소년, 대인, 소인, 경로 판별
	 * @param age_cost
	 * @return
	 */
	public static String day_age_cal(String age_cost) {
		Constant constant = new Constant();
		ExType exType = new ExType();
		int age_def = Integer.parseInt(age_cost.substring(0,2));
		String age_price;
		if (age_def >= 19 && age_def <= 21) {
			age_price = constant.BABY + "";
			exType.ageDivide = "유아(무료)";
		} else if (age_def >= 3 && age_def <= 9) {
			age_price = constant.DAY_ADOL + "";
			exType.ageDivide = "청소년";
		} else if (age_def >= 10 && age_def <= 18) {
			age_price = constant.DAY_YOUNG + "";
			exType.ageDivide = "소인";
		} else if (age_def <= 57 && age_def > 21) {
			age_price = constant.DAY_OLD + "";
			exType.ageDivide = "경로";
		} else {
			age_price = constant.DAY_ADULT + "";
			exType.ageDivide = "대인";
		}
		return age_price;
	}
	/**
	 * 야간의 경우. 주민 앞자리 2자리가 xx 일때에 따라 유아, 청소년, 대인, 소인, 경로 판별
	 * @param age_cost
	 * @return
	 */
	public static String night_age_cal(String age_cost) {
		Constant constant = new Constant();
		ExType exType = new ExType();
		int age_def = Integer.parseInt(age_cost.substring(0,2));
		String age_price;
		if (age_def >= 19 && age_def <= 21) {
			age_price = constant.BABY + "";
			exType.ageDivide = "유아(무료)";
		} else if (age_def >= 3 && age_def <= 9) {
			age_price = constant.NIGHT_ADOL + "";
			exType.ageDivide = "청소년";
		} else if (age_def >= 10 && age_def <= 18) {
			age_price = constant.NIGHT_YOUNG + "";
			exType.ageDivide = "소인";
		} else if (age_def <= 57 && age_def > 21) {
			age_price = constant.NIGHT_OLD + "";
			exType.ageDivide = "경로";
		} else {
			age_price = constant.NIGHT_ADULT + "";
			exType.ageDivide = "대인";
		}
		return age_price;
	}
}
