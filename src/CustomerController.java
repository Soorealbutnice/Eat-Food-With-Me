package customerMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import customer.CustomerView;

public class CustomerController implements ActionListener {

	public customer.CustomerView cv;
	public CustomerService cs;

	public CustomerController(customer.CustomerView cv) {
		this.cv = cv;
		cs = new CustomerService(cv);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == cv.res_test) {
			cs.SelectTable_ReserveHistory();
			System.out.println("���ൿ��");
		} else if (ob == cv.coin_test) {
			cs.SelectTable_CoinHistory();
			System.out.println("���ε���");
		} else if (ob == cv.Register) {
			cs.SelectTable_UpdateMyInfo();
			System.out.println("������Ʈ �õ�");
		} else if (ob == cv.Chef_Check) {
			cs.SelectTable_ChefCheck();
			System.out.println("������ȸ");
		} else if (ob == cv.Chef_Register) {
			cs.SelectTable_InsertRes();
			System.out.println("�Ĵ�");
			// } else if (ob == cv.testbtn) {
			// cs.countUp();
			// System.out.println("test");
			// } else if (ob == cv.testnext) {
			// cs.countDown();
			// System.out.println("testnext");
			// }

		}
	}
}
