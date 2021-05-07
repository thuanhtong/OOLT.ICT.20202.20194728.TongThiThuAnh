package hust.soict.globalict.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingAccumulator extends JFrame {
		private JTextField ifInput;
		private JTextField ifOutput;
		private int sum = 0;
		
		
		public SwingAccumulator() {
			Container cp = getContentPane();
			cp.setLayout(new GridLayout(2,2));
			
			cp.add(new JLabel("Enter an Integer: "));
			
			ifInput = new JTextField(10);
			cp.add(ifInput);
			ifInput.addActionListener(new IFInputListener());
			
			cp.add(new JLabel("The Accumulated Sum is: "));
			
			ifOutput = new JTextField(10);
			ifOutput.setEditable(false);
			cp.add(ifOutput);
			
			setTitle("Swing Accumulator");
			setSize(350, 120);
			setVisible(true);
		}
		
		public static void main(String[] args) {
			new SwingAccumulator();
		}
		
		private class IFInputListener implements ActionListener {
			
			public void actionPerformed(ActionEvent evt) {
				int numberIn = Integer.parseInt(ifInput.getText());
				sum += numberIn;
				ifInput.setText("");
				ifOutput.setText(sum + "");
			}
		}
}

