package everland;

import java.util.Scanner;

public class Input {
	public static ExType exType = new ExType();
	public static Scanner scanner;
	/**
	 * ������ (�ѹ��� ������ ����)
	 */
	Input() {
		scanner = new Scanner(System.in);
	}
	/**
	 * ���� ����
	 * @return
	 */
	public int inputDayNight() {
		System.out.println("������ �����ϼ���.");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
		exType.dn = scanner.nextInt();
		return exType.dn;
	}

	/**
	 * �ֹι�ȣ �Է�
	 * @return
	 */
	public String inputAge() {
		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
		exType.age = scanner.next();
		return exType.age;
	}
	/**
	 * ���� �Է�
	 * @return
	 */
	public int inputMany() {
	    ExType exType = new ExType();
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
		exType.num = scanner.nextInt();
		return exType.num;
	}
	/**
	 * ������ �Է�
	 * @return
	 */
	public int inputSpecial() {
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ���� (���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		exType.special = scanner.nextInt();
		return exType.special;
	}
	/**
	 * ���� ���� �Ǻ�
	 * @return
	 */
	public int inputGoStop() {
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
		exType.type = scanner.nextInt();
		return exType.type;
	}
	
	/**
	 * ���� �� ���������� ���� ���� �Ǻ�
	 * @return
	 */
	public int restart() {
		System.out.println("��� ���� (1. ���ο� �ֹ�, 2: ���α׷� ���� 3: ���� ǰ�� ������ 4: ������ ��Ȳ) ");
		exType.restart = scanner.nextInt();
		return exType.restart;
	}
	
}
