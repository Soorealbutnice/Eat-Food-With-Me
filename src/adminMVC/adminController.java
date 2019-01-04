package adminMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import admin_new.adminMain;
import main.Login;

public class adminController implements ActionListener {

	adminMain main;
	adminService service;
public Login login;
	public adminController(adminMain main) {
		this.main = main;
		service = new adminService(main);
		login = new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == main.adminCoupon.couponmake.makeBtn) {
			System.out.println("makebtn");
			service.couponMake();
			main.adminCoupon.couponmanage.model.setRowCount(0);
			service.couponSel();
		} 
		else if (ob == main.adminCoupon.couponmanage.lookupBtn) {
			System.out.println("lookupb");
			main.adminCoupon.couponmanage.model.setRowCount(0);
			service.couponSel();
		}
		else if (ob == main.adminCoupon.couponmanage.publishBtn) {
			System.out.println("publish");
			service.publishCoupon();
		}
		else if (ob == main.adminCoupon.couponmanage.deleteBtn) {
			System.out.println("delete");
			service.couponDel();
			main.adminCoupon.couponmanage.model.setRowCount(0);
			service.couponSel();
		}

		// adminchef
		else if (ob == main.adminChef.backBtn) {
			System.out.println("bacbtn");
			main.cardPanel.setVisible(false);
			main.btnPanel.setVisible(true);
		
		}
		else if (ob == main.adminChef.conBtn) {
			service.chefApp();
			main.adminChef.model.setRowCount(0);
			service.chefSel();
		}
		else if (ob == main.adminChef.selBtn) {
			main.adminChef.model.setRowCount(0);
			service.chefSel();
		}
		else if (ob == main.adminChef.delBtn) {
			service.chefDelete();
			main.adminChef.model.setRowCount(0);
			service.chefSel();
		}
		else if (ob == main.adminChef.refBtn) {
			service.chefRef();
			main.adminChef.model.setRowCount(0);
			service.chefSel();
		}
		
		// adminCoupon
		else if (ob == main.adminCoupon.btnBack) {
			main.cardPanel.setVisible(false);
			main.btnPanel.setVisible(true);
		}
		// adminCustomer
		else if (ob == main.adminCustomer.backBtn) {
			main.btnPanel.setVisible(true);
			main.cardPanel.setVisible(false);
		}
		else if (ob == main.adminCustomer.delBtn) {
			service.customerDelete();
			main.adminCustomer.model.setRowCount(0);
			service.customerSel();
			
		}
		else if (ob == main.adminCustomer.selBtn) {
			main.adminCustomer.model.setRowCount(0);
			service.customerSel();
		}
		// adminLogin
//		else if (ob == main.adminLogin.backBtn) {
//			main.cardPanel.setVisible(false);
//			main.btnPanel.setVisible(true);
//		}

		// adminMain
		else if (ob == main.cusManage) {
			System.out.println(ob);
			main.card.show(main.cardPanel, "screen1");
			main.cardPanel.setVisible(true);
			main.btnPanel.setVisible(false);
			main.adminCustomer.model.setRowCount(0);
			service.customerSel();
		} else if (ob == main.chefManage) {
			main.card.show(main.cardPanel, "screen2");
			main.cardPanel.setVisible(true);
			main.btnPanel.setVisible(false);
			main.adminChef.model.setRowCount(0);
			service.chefSel();
		} else if (ob == main.stat) {
			main.card.show(main.cardPanel, "screen3");
			main.cardPanel.setVisible(true);
			main.btnPanel.setVisible(false);
		} else if (ob == main.couponManage) {
			main.card.show(main.cardPanel, "screen4");
			main.cardPanel.setVisible(true);
			main.btnPanel.setVisible(false);
			main.adminCoupon.couponmanage.model.setRowCount(0);
			service.couponSel();
			
//			service.couponNum();
		} else if (ob == main.btnLogout) {
			
			login.setVisible(true);
//			main.card.show(main.cardPanel, "screen5");
//			main.cardPanel.setVisible(true);
			main.btnPanel.setVisible(false);
		}

		// adminStats
		else if (ob == main.adminStats.btnBack) {
			main.cardPanel.setVisible(false);
			main.btnPanel.setVisible(true);
		}

		}
	}


