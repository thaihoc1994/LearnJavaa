package hochnt.learning;

public class TestMyThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 tr1 = new MyThread1();
		tr1.setName("Tien trinh 1");
		tr1.start();//kick hoat tien trinh (Goi la tieu trinh)
		
		MyThread1 tr2 = new MyThread1();
		tr2.setName("Tien trinh 2");
		tr2.start();//kick hoat tien trinh (Goi la tieu trinh)
	}

}
