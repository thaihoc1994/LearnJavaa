package Hochnt.KeThua.QuanLy;

public class NhanVien implements Comparable<NhanVien> {

	private String ten;
	private int ma;
	
	
	public NhanVien() {
		super();
	}
	public NhanVien(int ma, String ten) {
		super();
		this.ten = ten;
		this.ma = ma;
	}
	@Override
	public String toString() {
		return this.ten;
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getCmnd() {
		return ma;
	}
	public void setCmnd(int ma) {
		this.ma = ma;
	}

	@Override
	public int compareTo(NhanVien o) {
		// TODO Auto-generated method stub
		int ss = this.ten.compareToIgnoreCase(o.getTen());//No different lower upper case
		if(ss == 0)
		{
			if(this.ma == o.ma)return 0;
			if(this.ma > o.ma)
				return 1;
			return -1;
		}
		return ss;
		
		//0: = nhau
		//1: lon hon
		//<0 : Nho hon
	}
	
	
}
