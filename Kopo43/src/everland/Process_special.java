package everland;

public class Process_special {
	static ExType exType = new ExType();
	/**
	 * ����� ���� ����
	 * @param cost
	 * @return
	 */
	public static int Difficult(int cost) {
		exType.Special = "�����";
		exType.special_announ = "*����� �������";
		cost = cost - ((cost / 100) * 40);
		return cost;
	}
	/**
	 * ���������� ���� ����
	 * @param cost
	 * @return
	 */
	public static int Merit(int cost) {
		exType.Special = "����������";
		exType.special_announ = "*���������� �������";
		cost = cost - ((cost / 100) * 50);
		return cost;
	}
	/**
	 * ���ڳ� ���� ����
	 * @param cost
	 * @return
	 */
	public static int Many_child(int cost) {
		exType.Special = "���ڳ�";
		exType.special_announ = "*���ڳ� �������";
		cost = cost - ((cost / 100) * 20);
		return cost;
	}
	/**
	 * �ӻ�� ���� ����
	 * @param cost
	 * @return
	 */
	public static int Mom(int cost) {
		exType.Special = "�ӻ��";
		exType.special_announ = "*�ӻ�� �������";
		cost = cost - ((cost / 100) * 15);
		return cost;
	}
	/**
	 * ������� ���� 
	 * @param cost
	 * @return
	 */
	public static int None(int cost) {
		exType.Special = "����";
		exType.special_announ = "*������� ����";
		return cost;
	}
}
