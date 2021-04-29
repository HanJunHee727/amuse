package everland;

public class Output {
	Output(){
		
	}
    static ExType exType = new ExType();
	public static void PriceResult() {
		System.out.printf("가격은 %d 원입니다.\n감사합니다.\n\n", exType.Price * exType.num);
	}
	
	public static void result() {
		System.out.println("티켓 발권을 종료합니다. 감사합니다.");
		System.out.println("===============에버랜드===============");
		for (int i = 0; i < exType.queue.size(); i++) {
			System.out.printf("%s %s x %s%7s원%8s\n\n", exType.queue.poll(), exType.queue.poll(),exType.queue.poll(),
					exType.queue.poll(),exType.queue.poll());
		}
		int totalsum = 0;
		for (int i = 0; i < exType.total_price.size(); i++) {
			totalsum += exType.total_price.get(i);
		}
		System.out.printf("입장료 총액은 %d원 입니다.\n", totalsum);
		System.out.println("======================================");
	}
	
	

}
