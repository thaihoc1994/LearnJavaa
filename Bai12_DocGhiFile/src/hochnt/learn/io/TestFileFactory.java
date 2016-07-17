package hochnt.learn.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import hochnt.learn.model.KhachHang;

public class TestFileFactory {
	public static boolean luuFile(ArrayList<KhachHang> dsKH,String path){
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			//luu vao bo dem
			BufferedWriter bw = new BufferedWriter(osw);
			for(KhachHang kh:dsKH){
				//luu tung dongcach nhau boi dau;
				String line = kh.getMa() + ";" + kh.getTen();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
}
