package Hochnt.ProcessLibrary;

import java.text.DecimalFormat;
import java.util.Random;

public class ProcessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 5;
		double b = 6;
		double tmp = (a+b)/3;
		System.out.println("dtb: " + tmp);
		
		DecimalFormat dcf = new DecimalFormat("#.##");
		System.out.println("dtP: " + dcf.format(tmp));
		
		//Random number
		int []M = new int[10];
		Random rd = new Random();
		for (int i = 0; i < M.length; i++) {
			M[i] = -50 + rd.nextInt(100);
			System.out.println(M[i]);
		}
		
		//random trong khoang
		
		
	}

}
