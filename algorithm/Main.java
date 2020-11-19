package algorithm;


public class Main {
	public static void main(String[] args) {
		SumThread s = new SumThread(); //clock의메소드를 불러오
		s.start(); //clock을 start한다
		
		try {
			s.join(); // clock이 종료될떄까지 main을 중지시킴
		} catch ( InterruptedException e ) {
			e.printStackTrace();
		}
		
		System.out.println("1 ~100까지의 합 : " + s.getSum());
	}
}
