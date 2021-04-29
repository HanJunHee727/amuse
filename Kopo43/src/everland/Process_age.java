package everland;

public class Process_age {
	/**
	 * �ְ��� ���. �ֹ� ���ڸ� 2�ڸ��� xx �϶��� ���� ����, û�ҳ�, ����, ����, ��� �Ǻ�
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
			exType.ageDivide = "����(����)";
		} else if (age_def >= 3 && age_def <= 9) {
			age_price = constant.DAY_ADOL + "";
			exType.ageDivide = "û�ҳ�";
		} else if (age_def >= 10 && age_def <= 18) {
			age_price = constant.DAY_YOUNG + "";
			exType.ageDivide = "����";
		} else if (age_def <= 57 && age_def > 21) {
			age_price = constant.DAY_OLD + "";
			exType.ageDivide = "���";
		} else {
			age_price = constant.DAY_ADULT + "";
			exType.ageDivide = "����";
		}
		return age_price;
	}
	/**
	 * �߰��� ���. �ֹ� ���ڸ� 2�ڸ��� xx �϶��� ���� ����, û�ҳ�, ����, ����, ��� �Ǻ�
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
			exType.ageDivide = "����(����)";
		} else if (age_def >= 3 && age_def <= 9) {
			age_price = constant.NIGHT_ADOL + "";
			exType.ageDivide = "û�ҳ�";
		} else if (age_def >= 10 && age_def <= 18) {
			age_price = constant.NIGHT_YOUNG + "";
			exType.ageDivide = "����";
		} else if (age_def <= 57 && age_def > 21) {
			age_price = constant.NIGHT_OLD + "";
			exType.ageDivide = "���";
		} else {
			age_price = constant.NIGHT_ADULT + "";
			exType.ageDivide = "����";
		}
		return age_price;
	}
}
