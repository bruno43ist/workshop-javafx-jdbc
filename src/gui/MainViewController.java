package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	//itens do menu da janela
	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML//quando o botão seller é pressionado
	public void onMenuItemSellerAction() {
		System.out.println("onMenuItemSellerAction");//teste
	}
	
	@FXML//quando o botão department é pressionado
	public void onMenuItemDepartmentAction() {
		System.out.println("onMenuItemDepartmentAction");//teste
	}
	
	@FXML//quando o botão seller é pressionado
	public void onMenuItemAboutAction() {
		System.out.println("onMenuItemAboutAction");//teste
	}
	
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		
	}

}
