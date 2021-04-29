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
	 * 데이터 분석 창을 위한 추가 코드
	 * @throws IOException
	 */
	public static void File_analy() throws IOException {
		File f = new File(constant.adress);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readtxt;
		if ((readtxt = br.readLine()) == null) {
			System.out.println("빈 파일입니다.");
			return;
		}
		String[] field_name = readtxt.split(",");
		int LineCnt = 1;
		System.out.println("\n                 <데이터 분석>");
		while ((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			System.out.printf("*%s번째 데이터\n", LineCnt);
			for (int j = 0; j < field_name.length; j++) {
				System.out.printf("%s : %s\n", field_name[j], field[j]);
			}
			System.out.println("=======================================================");
			LineCnt++;
		}
		br.close();
	}
	
	/**
	 * 권종 별 판매현황
	 * @throws IOException
	 */
	public static void File_Result() throws IOException {
		File f = new File(constant.adress);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readtxt;
    
		while ((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			if (field[1].equals("주간권")) {
				exType.daycnt ++;
				if (field[2].equals("대인")) {
					exType.dayAdultCnt ++;
				} else if (field[2].equals("청소년")) {
					exType.dayAdolCnt++;
				} else if (field[2].equals("경로")) {
					exType.dayOldCnt++;
				} else if (field[2].equals("소인")) {
					exType.dayYoungCnt++;
				} else if (field[2].equals("유아")) {
					exType.dayBabyCnt++;
				}
				for (int i = 0; i < exType.daycnt; i++) {
					exType.daycost += Integer.parseInt(field[4]);
				}
			} else if (field[1].equals("야간권")) {
				exType.nightcnt ++;
				if (field[2].equals("대인")) {
					exType.nightAdultCnt ++;
				} else if (field[2].equals("청소년")) {
					exType.nightAdolCnt++;
				} else if (field[2].equals("경로")) {
					exType.nightOldCnt++;
				} else if (field[2].equals("소인")) {
					exType.nightYoungCnt++;
				} else if (field[2].equals("유아")) {
					exType.nightBabyCnt++;
				}
				for (int i = 0; i < exType.daycnt; i++) {
					exType.nightcost += Integer.parseInt(field[4]);
				}
			}
		}
		br.close();
		System.out.println("===================권종 별 판매현황====================");
		System.out.printf("주간권 총 %d매\n", exType.daycnt);
		System.out.printf("유아 %d매, 어린이 %d매, 청소년 %d매, 어른 %d매, 노인 %d매\n",
				exType.dayAdultCnt, exType.dayAdolCnt, exType.dayOldCnt, exType.dayYoungCnt, exType.dayBabyCnt);
		System.out.printf("주간권 매출 : %d 원\n", exType.daycost);
		System.out.printf("야간권 총 %d매\n", exType.nightcnt);
		System.out.printf("유아 %d매, 어린이 %d매, 청소년 %d매, 어른 %d매, 노인 %d매\n", 
				exType.nightAdultCnt, exType.nightAdolCnt, exType.nightOldCnt, exType.nightYoungCnt, exType.nightBabyCnt);
		System.out.printf("야간권 매출 : %d 원\n", exType.nightcost);
		System.out.println();
	}
	
	/**
	 * 일자별 판매현황 (미완성)
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
		System.out.println("===================일자별 판매현황=====================");
		System.out.printf("2021년 04월 28일 : 총 매출 %d\n", exType.dayProfit);
	} */
	
	/**
	 * 우대권 판매현황
	 * @throws IOException
	 */
	public static void File_Result3() throws IOException {
		File f = new File(constant.adress);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readtxt;
    
		while ((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			if (field [5].equals("없음")) {
				exType.NopCnt+= 1 * Integer.parseInt(field[3]);
			} else if (field[5].equals("장애인")) {
				exType.DiffCnt+= 1 * Integer.parseInt(field[3]);
			} else if (field[5].equals("국가유공자")) {
				exType.MeritCnt+= 1 * Integer.parseInt(field[3]);
			} else if (field[5].equals("다자녀")) {
				exType.ManyChildCnt+= 1 * Integer.parseInt(field[3]);
			}else if (field[5].equals("임산부")) {
				exType.MomCnt+= 1 * Integer.parseInt(field[3]);
			}	
		}
		br.close();
		System.out.println("===================우대권 판매현황=====================");
		System.out.printf("총 판매 티켓수 : %d매\n",exType.NopCnt + exType.DiffCnt + exType.MeritCnt + exType.ManyChildCnt + exType.MomCnt);
		System.out.printf("우대 없음 : %d매\n", exType.NopCnt);
		System.out.printf("장애인 : %d매\n", exType.DiffCnt);
		System.out.printf("국가유공자 : %d매\n", exType.MeritCnt);
		System.out.printf("다자녀 : %d매\n", exType.ManyChildCnt);
		System.out.printf("임산부 : %d매\n", exType.MomCnt);
		System.out.println();
		
	}
}
