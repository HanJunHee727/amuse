package everland;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ExType {
	static int num = 0;  // ����
	static String daynight = "";  // �ְ��� / �߰���
	static String ageDivide = "";  //����/ û�ҳ�/ ����/ ���/ ����
	static String Special = "";  // ����/�����/����������/���ڳ�/�ӻ��
	static int Price = 0;  // ����
	static int dn = 0;  // 1���� �ְ�, 2���� �߰���
	static String age = "";  // �ֹι�ȣ
	static int special = 0;  // 1 ����/2 �����/3 ����������/4 ���ڳ�/5 �ӻ��
	static int type = 0;  // 1 Ƽ�Ϲ߱� / 2 ����
	static int restart = 0;  // 1 ���ο� �ֹ� / 2 ���α׷� ����
	static String special_announ = "";  // *������� ���� / *�����,����������,���ڳ�,�ӻ�� �������
	
	static Queue<String> queue = new LinkedList<>();
	// queue�� �̿��� ����: FIFO�� �̿��Ͽ� ��� ȭ�� �� ������ �Ǿ� �ϴ� �κ��� ó���ϱ� ����
	static ArrayList<Integer> total_price = new ArrayList<Integer>();
	// ���� ������ ��Ÿ���� ���� ArrayList
	
	static int daycnt = 0;  // �ְ��� ����
	static int nightcnt = 0;  // �߰��� ����
	static int daycost = 0;  // �ְ��� ����
	static int nightcost = 0;  // �߰��� ����
	static int dayAdultCnt = 0; // �ְ��� ���� ����
	static int dayAdolCnt = 0;  // �ְ��� û�ҳ� ����
	static int dayOldCnt = 0;  // �ְ��� ��� ����
	static int dayYoungCnt = 0;  // �ְ��� ���� ����
	static int dayBabyCnt = 0;  // �ְ��� ���� ����
	static int nightAdultCnt = 0;  // �߰��� ���� ����
	static int nightAdolCnt = 0;  // �߰��� û�ҳ� ����
	static int nightOldCnt = 0;  // �߰��� ��� ����
	static int nightYoungCnt = 0;  // �߰��� ���� ����
	static int nightBabyCnt = 0;  // �߰��� ���� ����
	
	static int NopCnt = 0;  // ��� ���� ����
	static int DiffCnt = 0;  // ����� ����
	static int MeritCnt = 0;  // ���������� ����
	static int ManyChildCnt = 0;  // ���ڳ� ����
	static int MomCnt = 0;  // �ӻ�� ����
	
	static ArrayList<String> daylist = new ArrayList<String>();
	static int dayProfit = 0;
}
