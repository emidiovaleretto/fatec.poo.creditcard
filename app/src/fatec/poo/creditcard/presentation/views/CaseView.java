package fatec.poo.creditcard.presentation.views;

//external packages
import javax.swing.JFrame;

//internal packages
import fatec.poo.creditcard.application.controllers.CaseController;
import fatec.poo.creditcard.presentation.icontrollers.ICaseController;

public class CaseView extends JFrame {
	private static final long serialVersionUID = 4419928361158636533L;
	private static final ICaseController controller = new CaseController();
}
