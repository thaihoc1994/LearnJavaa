package Hochnt.Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ds3 = new ArrayList();
		ds3.add("An");
		ds3.add("Binh");
		ds3.add("tmp");
		ds3.add(2,"Hoc");
		for(int i = 0; i <ds3.size(); i++){
			String x = ds3.get(i) + "";//get in index i
			System.out.println(x);
		}
		//Cach 2
		System.out.println("_______________________");
		for(Object data: ds3){
			System.out.println(data);
		}
		
		//Dang tuong minh
		ArrayList<Double> ds4 = new ArrayList<Double>();
		for(int i=0;i<10;i++)
		{
			ds4.add(i*2.0);
		}
		ds4.set(0, 1.1111);
		System.out.println("===============");
		for(double x: ds4)
			System.out.println(x);
		
//		===========HashMap=============
		HashMap<Integer, String> ds= new HashMap<Integer, String>();
		ds.put(113, "Name Address");
		ds.put(112, "ab xyz");
		
		String nv = ds.get(113);
		System.out.println(nv);
		for(String ten: ds.values())
		{
			System.out.println(ten);
		}
	}

}
