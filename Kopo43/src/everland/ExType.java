package everland;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ExType {
	static int num = 0;  // 수량
	static String daynight = "";  // 주간권 / 야간권
	static String ageDivide = "";  //대인/ 청소년/ 소인/ 경로/ 유아
	static String Special = "";  // 없음/장애인/국가유공자/다자녀/임산부
	static int Price = 0;  // 가격
	static int dn = 0;  // 1번은 주간, 2번은 야간권
	static String age = "";  // 주민번호
	static int special = 0;  // 1 없음/2 장애인/3 국가유공자/4 다자녀/5 임산부
	static int type = 0;  // 1 티켓발권 / 2 종료
	static int restart = 0;  // 1 새로운 주문 / 2 프로그램 종료
	static String special_announ = "";  // *우대적용 없음 / *장애인,국가유공자,다자녀,임산부 우대적용
	
	static Queue<String> queue = new LinkedList<>();
	// queue를 이용한 이유: FIFO를 이용하여 결과 화면 중 누적이 되야 하는 부분을 처리하기 위함
	static ArrayList<Integer> total_price = new ArrayList<Integer>();
	// 가격 총합을 나타내기 위한 ArrayList
	
	static int daycnt = 0;  // 주간권 수량
	static int nightcnt = 0;  // 야간권 수량
	static int daycost = 0;  // 주간권 매출
	static int nightcost = 0;  // 야간권 매출
	static int dayAdultCnt = 0; // 주간권 대인 수량
	static int dayAdolCnt = 0;  // 주간권 청소년 수량
	static int dayOldCnt = 0;  // 주간권 경로 수량
	static int dayYoungCnt = 0;  // 주간권 소인 수량
	static int dayBabyCnt = 0;  // 주간권 유아 수량
	static int nightAdultCnt = 0;  // 야간권 대인 수량
	static int nightAdolCnt = 0;  // 야간권 청소년 수량
	static int nightOldCnt = 0;  // 야간권 경로 수량
	static int nightYoungCnt = 0;  // 야간권 소인 수량
	static int nightBabyCnt = 0;  // 야간권 유아 수량
	
	static int NopCnt = 0;  // 우대 없음 수량
	static int DiffCnt = 0;  // 장애인 수량
	static int MeritCnt = 0;  // 국가유공자 수량
	static int ManyChildCnt = 0;  // 다자녀 수량
	static int MomCnt = 0;  // 임산부 수량
	
	static ArrayList<String> daylist = new ArrayList<String>();
	static int dayProfit = 0;
}
