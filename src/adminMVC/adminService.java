package adminMVC;

import java.sql.SQLException;
import java.text.ParseException;

import admin_new.adminMain;

public class adminService {
	adminMain main;
	Insert ci;
	Select cs;
	update cu;
	Delete cd;

	adminService(adminMain main) {
		this.main = main;
		ci = new Insert(main);
		cs = new Select(main);
	}

	public void customerSel() {
		cs.customerSel();
	}

	public void couponMake() {
		try {
			ci.couponMake();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void couponSel() {
		cs.couponSel();
	}
	
	public void couponDel() {
		cd = new Delete(main);
		cd.couponDel();
	}

	public void chefSel() {
		cs.chefSel();
	}
	
	public void chefApp() {
		cu = new update(main);
		cu.chefApp();
	}

	public void publishCoupon() {
		cu = new update(main);
		cu.couponPublish();
	}

	public void customerDelete() {
		cd = new Delete(main);
		try {
			cd.customerDelete();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void chefDelete() {
		cd = new Delete(main);
		try {
			cd.chefDelete();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void chefRef() {
		cu = new update(main);
		cu.chefRef();
	}

}