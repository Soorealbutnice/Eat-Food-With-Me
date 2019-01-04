package chef;

import DAO.ChefDao;

public class ChefService {
	ChefInfo ci;
	ChefDao cd;
	public ChefService(ChefInfo ci) {
		this.ci = ci;
	}
	public void addMenu() {
		cd= new ChefDao(ci);
		cd.addMenu();
	}
}
