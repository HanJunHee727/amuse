package everland;

public class Output {
	Output(){
		
	}
    static ExType exType = new ExType();
	public static void PriceResult() {
		System.out.printf("������ %d ���Դϴ�.\n�����մϴ�.\n\n", exType.Price * exType.num);
	}
	
	public static void result() {
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
		System.out.println("===============��������===============");
		for (int i = 0; i < exType.queue.size(); i++) {
			System.out.printf("%s %s x %s%7s��%8s\n\n", exType.queue.poll(), exType.queue.poll(),exType.queue.poll(),
					exType.queue.poll(),exType.queue.poll());
		}
		int totalsum = 0;
		for (int i = 0; i < exType.total_price.size(); i++) {
			totalsum += exType.total_price.get(i);
		}
		System.out.printf("����� �Ѿ��� %d�� �Դϴ�.\n", totalsum);
		System.out.println("======================================");
	}
	
	

}
