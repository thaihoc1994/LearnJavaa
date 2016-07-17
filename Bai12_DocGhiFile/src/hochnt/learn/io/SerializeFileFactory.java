package hochnt.learn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import hochnt.learn.model.KhachHang;

public class SerializeFileFactory {
	public static boolean luuFile(ArrayList<KhachHang> dsKH, String path){
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);//cho phep map
			oos.writeObject(dsKH);//map nguyen doi tuong
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	public static ArrayList<KhachHang> docFile(String path){
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			dsKH = (ArrayList<KhachHang>) data;
			ois.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return dsKH;
	}
}
