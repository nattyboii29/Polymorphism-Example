package polymorphismAct;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
	// COMPILE-TIME POLYMORPHISM / METHOD OVERLOADING
		MathOperation op1 = new MathOperation();
		
		String int1 = JOptionPane.showInputDialog(null, "Enter first integer: ");
		String int2 = JOptionPane.showInputDialog(null, "Enter second integer: ");
		
		int num1 = Integer.parseInt(int1);
		int num2 = Integer.parseInt(int2);
		int result = op1.multiply(num1, num2);
		
		JOptionPane.showMessageDialog(null, "Result: " + result);
		
		String dec3 = JOptionPane.showInputDialog(null, "Enter first decimal: ");
		String dec4 = JOptionPane.showInputDialog(null, "Enter second decimal: ");
		
		double num3 = Double.parseDouble(dec3);
		double num4 = Double.parseDouble(dec4);
		double result2 = op1.multiply(num3, num4);
		
		JOptionPane.showMessageDialog(null, "Result: " + result2);
		
	// RUN-TIME POLYMORPHISM / METHOD OVERRIDING
		
		Vehicle v1 = new Car();
		JOptionPane.showMessageDialog(null, "The car is moving fast... vroom!");
		v1.move();
		
		Vehicle v2 = new Bicycle();
		JOptionPane.showMessageDialog(null, "The bicycle is doing a wheelie!");
		v2.move();
	}
}
