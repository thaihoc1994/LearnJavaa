package Hochnt.KeThua.QuanLy;

import java.util.ArrayList;
import java.util.Collections;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
		nv.add(new NhanVien(3, "t"));
		nv.add(new NhanVien(2, "h"));
		nv.add(new NhanVien(1, "a"));
		nv.add(new NhanVien(4, "a"));
		System.out.println("DSNV: ");
		for (NhanVien t : nv) {
			System.out.println(t.getTen() + ": " + t.getCmnd());
		}
		System.out.println("DSNV: ");
		Collections.sort(nv);//dieu kien dua tren compare to
		for (NhanVien t : nv) {
			System.out.println(t.getTen() + ": " + t.getCmnd());
		}
	}

}
