package Hochnt.Class;

public class KhachHang {

	//Lop Mo Hinh
	private String ma;	
	private String ten;
	private int tuoi;

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public KhachHang() {
		super();
	}

	public KhachHang(String ma, String ten, int tuoi) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.tuoi = tuoi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public static int fn5(int x, int y){
		int sum = 0;
		
		return sum;
	}	
	public static int fn5(int ...arr){//so luong cac doi so khac nhau
		int sum = 0;
		for(int x:arr)
			sum+=x;
		return sum;
	}	
	@Override
	public String toString() {
		return "KhachHang [ma=" + ma + ", ten=" + ten + ", tuoi=" + tuoi + "]";
	}
	
	
	//parametter lits
	

}
