package hochnt.learning;

public class MyThread1 extends Thread{

	//ke thua truc tiep

		//da tien trinh - nhieu tien trinh
		//phai overide runabe
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}
	} 
}
