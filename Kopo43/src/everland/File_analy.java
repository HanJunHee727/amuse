package everland;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_analy {
	static Constant constant = new Constant();
	static ExType exType = new ExType();
	/**
	 * ������ �м� â�� ���� �߰� �ڵ�
	 * @throws IOException
	 */
	public static void File_analy() throws IOException {
		File f = new File(constant.adress);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readtxt;
		if ((readtxt = br.readLine()) == null) {
			System.out.println("�� �����Դϴ�.");
			return;
		}
		String[] field_name = readtxt.split(",");
		int LineCnt = 1;
		System.out.println("\n                 <������ �м�>");
		while ((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			System.out.printf("*%s��° ������\n", LineCnt);
			for (int j = 0; j < field_name.length; j++) {
				System.out.printf("%s : %s\n", field_name[j], field[j]);
			}
			System.out.println("=======================================================");
			LineCnt++;
		}
		br.close();
	}
	
	/**
	 * ���� �� �Ǹ���Ȳ
	 * @throws IOException
	 */
	public static void File_Result() throws IOException {
		File f = new File(constant.adress);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readtxt;
    
		while ((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			if (field[1].equals("�ְ���")) {
				exType.daycnt ++;
				if (field[2].equals("����")) {
					exType.dayAdultCnt ++;
				} else if (field[2].equals("û�ҳ�")) {
					exType.dayAdolCnt++;
				} else if (field[2].equals("���")) {
					exType.dayOldCnt++;
				} else if (field[2].equals("����")) {
					exType.dayYoungCnt++;
				} else if (field[2].equals("����")) {
					exType.dayBabyCnt++;
				}
				for (int i = 0; i < exType.daycnt; i++) {
					exType.daycost += Integer.parseInt(field[4]);
				}
			} else if (field[1].equals("�߰���")) {
				exType.nightcnt ++;
				if (field[2].equals("����")) {
					exType.nightAdultCnt ++;
				} else if (field[2].equals("û�ҳ�")) {
					exType.nightAdolCnt++;
				} else if (field[2].equals("���")) {
					exType.nightOldCnt++;
				} else if (field[2].equals("����")) {
					exType.nightYoungCnt++;
				} else if (field[2].equals("����")) {
					exType.nightBabyCnt++;
				}
				for (int i = 0; i < exType.daycnt; i++) {
					exType.nightcost += Integer.parseInt(field[4]);
				}
			}
		}
		br.close();
		System.out.println("===================���� �� �Ǹ���Ȳ====================");
		System.out.printf("�ְ��� �� %d��\n", exType.daycnt);
		System.out.printf("���� %d��, ��� %d��, û�ҳ� %d��, � %d��, ���� %d��\n",
				exType.dayAdultCnt, exType.dayAdolCnt, exType.dayOldCnt, exType.dayYoungCnt, exType.dayBabyCnt);
		System.out.printf("�ְ��� ���� : %d ��\n", exType.daycost);
		System.out.printf("�߰��� �� %d��\n", exType.nightcnt);
		System.out.printf("���� %d��, ��� %d��, û�ҳ� %d��, � %d��, ���� %d��\n", 
				exType.nightAdultCnt, exType.nightAdolCnt, exType.nightOldCnt, exType.nightYoungCnt, exType.nightBabyCnt);
		System.out.printf("�߰��� ���� : %d ��\n", exType.nightcost);
		System.out.println();
	}
	
	/**
	 * ���ں� �Ǹ���Ȳ (�̿ϼ�)
	 * @throws IOException
	 */
	/*public static void File_Result2() throws IOException {
		File f = new File(constant.adress);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readtxt;
		int Linecnt = 0;
		while ((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			for (int i = 0; i < Linecnt; i++) {
				exType.daylist.add(field[0]);
			}
			Linecnt++;
			for (int i = 0; i < exType.daylist.size(); i++) {
				if (field[0].equals(exType.daylist.get(i))) {
					exType.dayProfit += Integer.parseInt(field[4]);
				}
			}
		}
		br.close();
		System.out.println("===================���ں� �Ǹ���Ȳ=====================");
		System.out.printf("2021�� 04�� 28�� : �� ���� %d\n", exType.dayProfit);
	} */
	
	/**
	 * ���� �Ǹ���Ȳ
	 * @throws IOException
	 */
	public static void File_Result3() throws IOException {
		File f = new File(constant.adress);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readtxt;
    
		while ((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			if (field [5].equals("����")) {
				exType.NopCnt+= 1 * Integer.parseInt(field[3]);
			} else if (field[5].equals("�����")) {
				exType.DiffCnt+= 1 * Integer.parseInt(field[3]);
			} else if (field[5].equals("����������")) {
				exType.MeritCnt+= 1 * Integer.parseInt(field[3]);
			} else if (field[5].equals("���ڳ�")) {
				exType.ManyChildCnt+= 1 * Integer.parseInt(field[3]);
			}else if (field[5].equals("�ӻ��")) {
				exType.MomCnt+= 1 * Integer.parseInt(field[3]);
			}	
		}
		br.close();
		System.out.println("===================���� �Ǹ���Ȳ=====================");
		System.out.printf("�� �Ǹ� Ƽ�ϼ� : %d��\n",exType.NopCnt + exType.DiffCnt + exType.MeritCnt + exType.ManyChildCnt + exType.MomCnt);
		System.out.printf("��� ���� : %d��\n", exType.NopCnt);
		System.out.printf("����� : %d��\n", exType.DiffCnt);
		System.out.printf("���������� : %d��\n", exType.MeritCnt);
		System.out.printf("���ڳ� : %d��\n", exType.ManyChildCnt);
		System.out.printf("�ӻ�� : %d��\n", exType.MomCnt);
		System.out.println();
		
	}
}
