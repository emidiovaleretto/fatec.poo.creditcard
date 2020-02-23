package fatec.poo.creditcard.presentation.views;

// external packages
import javax.swing.JFrame;
// internal packages
import fatec.poo.creditcard.application.controllers.MenuController;
import fatec.poo.creditcard.presentation.icontrollers.IMenuController;

public class MenuView extends JFrame {
	private static final long serialVersionUID = 6971964204955500997L;
	private static final IMenuController controller = new MenuController();

}
