package everland;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main_Process {
	public static void main_process() throws IOException {
	    Input input = new Input();
	    Output output = new Output();
	    Process_age pa = new Process_age();
	    Process_special ps = new Process_special();
	    ExType exType = new ExType();
	    File_Process fp = new File_Process();
	    Constant cnt = new Constant();
		File_analy file_analy = new File_analy();
	    
	    fp.headerWrite();  // 파일 헤더
	    do {
	    	input.inputDayNight();
	    	input.inputAge();
	    	input.inputMany();
	    	input.inputSpecial();
	    	if (exType.dn == cnt.day) {  // 주간권일때 
	    		exType.daynight = "주간권";
	    		if (exType.special == cnt.nope) {  // 우대사항 없을 때
		    		exType.Price = ps.None(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		} else if (exType.special == cnt.diff) {  // 우대사항 장애인
	    			exType.Price = ps.Difficult(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		} else if (exType.special == cnt.merit) {  // 우대사항 국가유공자
	    			exType.Price = ps.Merit(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		} else if (exType.special == cnt.many_child) {  // 우대사항 다자녀
	    			exType.Price = ps.Many_child(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		} else if (exType.special == cnt.mom) {  // 우대사항 임산부
	    			exType.Price = ps.Mom(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		}
	    	} else if (exType.dn == cnt.night) {  // 야간권일때
	    		exType.daynight = "야간권";
	    		if (exType.special == cnt.nope) { // 우대사항 없을 때
	    			exType.Price = ps.None(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		} else if (exType.special == cnt.diff) {  // 우대사항 장애인
	    			exType.Price = ps.Difficult(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		} else if (exType.special == cnt.merit) { // 우대사항 국가유공자
	    			exType.Price = ps.Merit(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		} else if (exType.special == cnt.many_child) {  // 우대사항 다자녀
	    			exType.Price = ps.Many_child(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		} else if (exType.special == cnt.mom) { // 우대사항 임산부
	    			exType.Price = ps.Mom(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		}
	    	}
	    	exType.queue.add(exType.daynight);  //queue에 추가
	    	exType.queue.add(exType.ageDivide);  //queue에 추가
	    	exType.queue.add(exType.num + "");  //queue에 추가
	    	exType.queue.add(exType.Price * exType.num + "");  //queue에 추가
	    	exType.queue.add(exType.special_announ);  //queue에 추가
	    	exType.total_price.add(exType.num * exType.Price);   //queue에 추가
	    	output.PriceResult();
	    	fp.FileWrite(exType.daynight, exType.ageDivide, exType.num, exType.num * exType.Price, exType.Special);  //파일 작성
	    } while (input.inputGoStop() != cnt.stop);
	    output.result();
	    input.restart();
	    if (exType.restart == 1) {  //1번을 통해 다시 시행한다고 하면
	    	main_process();  // 클래스 다시 시작
	    } else if (exType.restart == 2) {  // 2번일 경우
	    	
	    } else if (exType.restart == 3) {
			file_analy.File_analy();
	    } else if (exType.restart == 4) {
			file_analy.File_Result();
			//file_analy.File_Result2();
			file_analy.File_Result3();
	    }
	    fp.fileClose();  // 파일 종료
	  
	}
}
