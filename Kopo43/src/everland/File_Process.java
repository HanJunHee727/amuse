package everland;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import exchange_program.Exchange_Type;

public class File_Process {
	private FileWriter fw;
	private boolean isFileExist;
	static Constant constant = new Constant();
	
	/**
	 * 해당 파일이 존재하는지 판별, 파일 경로 
	 */
	public File_Process() {  
		try {
			File file = new File(constant.adress);
			if (file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter(constant.adress, true);					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 파일 닫기
	 */
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 파일 헤더
	 * @throws IOException
	 */
	public void headerWrite() throws IOException {
		if (isFileExist == false) {
			String head = "날짜," + "권종," + "연령구분," + "수량," + "가격," + "우대사항" + "\n";
			fw.write(head);
		}		
	}
	
	/**
	 * 파일 작성
	 * @param daynight
	 * @param age
	 * @param count
	 * @param cost
	 * @param special
	 * @throws IOException
	 */
	public void FileWrite(String daynight, String age, int count, int cost, String special) throws IOException {
		ExType exType = new ExType();
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd");
		fw.write(sdt.format(calt.getTime()) + ",");
		String result = daynight + "," + age + "," + count + "," + cost + "," + special + "\n";
		fw.write(result);
		
	}
}	
