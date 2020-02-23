package fatec.poo.creditcard.presentation.views;

// external packages
import javax.swing.JFrame;

// internal packages
import fatec.poo.creditcard.application.controllers.LoginController;
import fatec.poo.creditcard.presentation.icontrollers.ILoginController;

public class LoginView extends JFrame {
	private static final long serialVersionUID = 4954769000016238155L;
	private static final ILoginController controller = new LoginController();
	
	// test method
	public static void main(String[] args) {
		controller.login("admin", "123");
	}
}
