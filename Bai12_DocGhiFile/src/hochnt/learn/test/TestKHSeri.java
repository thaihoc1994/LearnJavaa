package hochnt.learn.test;

import java.util.ArrayList;

import hochnt.learn.io.SerializeFileFactory;
import hochnt.learn.io.TestFileFactory;
import hochnt.learn.model.KhachHang;

public class TestKHSeri {
	public static void  testLuuFile(){
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH1", "A"));
		dsKH.add(new KhachHang("KH2", "B"));
		dsKH.add(new KhachHang("KH3", "C"));
		dsKH.add(new KhachHang("KH4", "D"));
		dsKH.add(new KhachHang("KH5", "E"));
		
		boolean kt = SerializeFileFactory.luuFile(dsKH, "E:\\GITHUB\\File\\demofileSeri.txt");
		if (kt == true)
			System.out.println("OK");
		else
			System.out.println("Fail");
	}
	public static void testDocFile(){
		ArrayList<KhachHang> dsKH = SerializeFileFactory.docFile("E:\\GITHUB\\File\\demofileSeri.txt");
		System.out.println("DS: ");
		for(KhachHang kh : dsKH){
			System.out.println(kh);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testLuuFile();
		testDocFile();
	}
}
