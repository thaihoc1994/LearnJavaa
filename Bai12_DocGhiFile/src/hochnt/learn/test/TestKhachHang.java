package hochnt.learn.test;

import java.util.ArrayList;

import hochnt.learn.io.TestFileFactory;
import hochnt.learn.model.KhachHang;

public class TestKhachHang {

	public static void  testLuuFile(){
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH1", "A"));
		dsKH.add(new KhachHang("KH2", "B"));
		dsKH.add(new KhachHang("KH3", "C"));
		dsKH.add(new KhachHang("KH4", "D"));
		dsKH.add(new KhachHang("KH5", "E"));
		
		boolean kt = TestFileFactory.luuFile(dsKH, "E:\\GITHUB\\File\\demofile.txt");
		if (kt == true)
			System.out.println("OK");
		else
			System.out.println("Fail");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testLuuFile();
	}

}
