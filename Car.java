package polymorphismAct;
import javax.swing.JOptionPane;
public class Car extends Vehicle{
	
	@Override
	void move() {
		JOptionPane.showMessageDialog(null, "The Car is Moving... vroom!");
	}
}
