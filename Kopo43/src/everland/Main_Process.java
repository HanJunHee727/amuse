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
	    
	    fp.headerWrite();  // ���� ���
	    do {
	    	input.inputDayNight();
	    	input.inputAge();
	    	input.inputMany();
	    	input.inputSpecial();
	    	if (exType.dn == cnt.day) {  // �ְ����϶� 
	    		exType.daynight = "�ְ���";
	    		if (exType.special == cnt.nope) {  // ������ ���� ��
		    		exType.Price = ps.None(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		} else if (exType.special == cnt.diff) {  // ������ �����
	    			exType.Price = ps.Difficult(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		} else if (exType.special == cnt.merit) {  // ������ ����������
	    			exType.Price = ps.Merit(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		} else if (exType.special == cnt.many_child) {  // ������ ���ڳ�
	    			exType.Price = ps.Many_child(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		} else if (exType.special == cnt.mom) {  // ������ �ӻ��
	    			exType.Price = ps.Mom(Integer.parseInt(pa.day_age_cal(exType.age)));
	    		}
	    	} else if (exType.dn == cnt.night) {  // �߰����϶�
	    		exType.daynight = "�߰���";
	    		if (exType.special == cnt.nope) { // ������ ���� ��
	    			exType.Price = ps.None(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		} else if (exType.special == cnt.diff) {  // ������ �����
	    			exType.Price = ps.Difficult(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		} else if (exType.special == cnt.merit) { // ������ ����������
	    			exType.Price = ps.Merit(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		} else if (exType.special == cnt.many_child) {  // ������ ���ڳ�
	    			exType.Price = ps.Many_child(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		} else if (exType.special == cnt.mom) { // ������ �ӻ��
	    			exType.Price = ps.Mom(Integer.parseInt(pa.night_age_cal(exType.age)));
	    		}
	    	}
	    	exType.queue.add(exType.daynight);  //queue�� �߰�
	    	exType.queue.add(exType.ageDivide);  //queue�� �߰�
	    	exType.queue.add(exType.num + "");  //queue�� �߰�
	    	exType.queue.add(exType.Price * exType.num + "");  //queue�� �߰�
	    	exType.queue.add(exType.special_announ);  //queue�� �߰�
	    	exType.total_price.add(exType.num * exType.Price);   //queue�� �߰�
	    	output.PriceResult();
	    	fp.FileWrite(exType.daynight, exType.ageDivide, exType.num, exType.num * exType.Price, exType.Special);  //���� �ۼ�
	    } while (input.inputGoStop() != cnt.stop);
	    output.result();
	    input.restart();
	    if (exType.restart == 1) {  //1���� ���� �ٽ� �����Ѵٰ� �ϸ�
	    	main_process();  // Ŭ���� �ٽ� ����
	    } else if (exType.restart == 2) {  // 2���� ���
	    	
	    } else if (exType.restart == 3) {
			file_analy.File_analy();
	    } else if (exType.restart == 4) {
			file_analy.File_Result();
			//file_analy.File_Result2();
			file_analy.File_Result3();
	    }
	    fp.fileClose();  // ���� ����
	  
	}
}
