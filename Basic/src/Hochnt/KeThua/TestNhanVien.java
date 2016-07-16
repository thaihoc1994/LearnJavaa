package Hochnt.KeThua;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien t = new NhanVienChinhThuc();
		t.setTen("nvct");
		System.out.println(t);
		
		NhanVienChinhThuc x = new NhanVienChinhThuc();
		x.setTen("nvct");
		System.out.println(x);
		
		t = new NhanVienThoiVu();
		t.setTen("nvtv");
		System.out.println(t);
	}

}
