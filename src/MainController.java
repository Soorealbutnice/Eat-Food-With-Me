package mainMvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import customer.CustomerView;
import mainMvc.MainService;
import main.Login;
import main.Main;

public class MainController implements ActionListener{
	Main main;
	MainService service;
	Login login;
	public CustomerView cv;
	public MainController(Main main) {
		this.main = main;
		service = new MainService(main);
		cv = new CustomerView(main);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == main.chefMainBtn) {
			System.out.println("Å¬¸¯");
			main.chefinfo.setVisible(true);
			service.showRestaurant();
			
		}
		if(ob == main.logoutBtn) {
			login = new Login();
			main.setVisible(false);
			login.setVisible(true);
		} else if(ob == main.cusMainBtn) {
			main.setVisible(false);
			cv.setVisible(true);
		}
	}
}
