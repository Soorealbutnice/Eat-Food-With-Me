package mainMvc;

import DAO.MainDao;
import main.Main;

public class MainService {
	Main main;
	MainDao md;
	public MainService(Main main) {
		this.main = main;
	}
	
	public void showRestaurant() {
		md = new MainDao(main);
		md.SelectRestaurant();
	}
}
