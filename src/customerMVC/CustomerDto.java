package customerMVC;

public class CustomerDto {
//Customer가 가질 값 getter setter
	
	int cus_no;
	String name;
	String manu_name;
	int num;
	
	public int getCus_no() {
		return cus_no;
	}
	public void setCus_no(int cus_no) {
		this.cus_no = cus_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManu_name() {
		return manu_name;
	}
	public void setManu_name(String manu_name) {
		this.manu_name = manu_name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
