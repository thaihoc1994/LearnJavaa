package hochnt.learning;

public class TestMyThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th3 = new Thread(new MyThread2());
		th3.setName("Tien trinh 3");
		th3.start();//kick hoat tien trinh (Goi la tieu trinh)
		
		Thread th4 = new Thread(new MyThread2());
		th4.setName("Tien trinh 4");
		th4.start();//kick hoat tien trinh (Goi la tieu trinh)
	}

}
