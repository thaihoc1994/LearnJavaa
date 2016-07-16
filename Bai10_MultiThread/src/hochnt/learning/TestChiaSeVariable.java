package hochnt.learning;

public class TestChiaSeVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt = new MyThread2();
		Thread th1 = new Thread(mt);
		th1.setName("Tien trinh 1");
		th1.start();
		
		Thread th2 = new Thread(mt);
		th2.start();
		th2.setName("Tien trinh 2");
		
		Thread th3 = new Thread(mt);
		th3.start();
		th3.setName("Tien trinh 3");
		
		System.out.println("x hien tai lay ra = " + mt.getX());
	}

}
