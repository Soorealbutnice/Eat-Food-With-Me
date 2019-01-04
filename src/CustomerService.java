package customerMVC;

import customer.CustomerView;
import customerMVC.Select;

public class CustomerService {
	// 컨트롤러를 통해 실행할 메소드
	public customer.CustomerView cv;

	public CustomerService(customer.CustomerView cv) {
		this.cv = cv;
	}

	public void SelectTable_ReserveHistory() {
		cv.model.setRowCount(0);
		Select select = new Select(this.cv);
		select.SelectTable_ReserveHistory();
	}

	public void SelectTable_CoinHistory() {
		cv.model_1.setRowCount(0);
		Select select = new Select(this.cv);
		select.SelectTable_CoinHistory();
	}

	public void SelectTable_UpdateMyInfo() {
		Update update = new Update(this.cv);
		update.SelectTable_UpdateMyInfo();
	}

	public void SelectTable_InsertRes() {
		Insert insert = new Insert(this.cv);
		insert.SelectTable_InsertRes();
	}

	public void SelectTable_ChefCheck() {
		Select select = new Select(this.cv);
		select.SelectTable_ChefCheck();
	}

//	public void test() {
//		Select select = new Select(this.cv);
//		select.test();
//	}
//
//	public void testnext() {
//		Select select = new Select(this.cv);
//		select.testnext();
//	}

//	public void countUp() {
//		cv.count += 1;
//	}
//
//	public void countDown() {
//		cv.count -= 1;
//	}

}
