package Hochnt.KeThua;

public abstract class NhanVien {

	private String ten;
	private String cmnd;
	
	public abstract int xuatLuong();
	
	public NhanVien() {
		super();
	}
	@Override
	public String toString() {
		return this.ten + ": " + xuatLuong();
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
	
}
