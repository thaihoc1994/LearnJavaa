package Hochnt.Class;

public class TestKhachHang {

	public static int x  = 5; //x là member class
	public int y;
	public void fn2()
	{
		System.out.println(y);
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KhachHang teo = new KhachHang();
		teo.setMa("NV1");
		teo.setTuoi(30);
		teo.setTen("Nguyen van a");
		
		System.out.println(teo);
		
		KhachHang ty = new KhachHang();
		ty.setTen("Ho van b");
		System.out.println(ty.getTen());
		teo = ty;//thu hoi o nho cua Teo
		System.out.println(teo.getTen());
		teo.setTen("test");
		System.out.println(ty.getTen());
		
		////
		
		
	}

}
