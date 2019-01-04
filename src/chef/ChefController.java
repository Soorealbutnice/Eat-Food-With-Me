package chef;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Main;

public class ChefController implements ActionListener{
//	Main main;
//	public ChefController(Main main){
//		this.main = main;
//	}
	
	ChefInfo ci;
	ChefService sv;
	public ChefController(ChefInfo ci) {
		this.ci = ci;
		sv = new ChefService(ci);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		System.out.println(ci.addbtn);
		if(ob == ci.addbtn) {
			sv.addMenu();
		}
		if(ob == ci.backbtn) {
			System.out.println("뒤로가기");
			ci.setVisible(false);
		}
	}
}
