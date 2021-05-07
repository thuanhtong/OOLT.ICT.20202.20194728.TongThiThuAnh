package hust.soict.globalict.swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame{
	private TextField ifInput;
	private TextField ifOutput;
	private int sum = 0;
	
	
	public AWTAccumulator() {
		setLayout(new GridLayout(2,2));
		
		add(new Label("Enter an Integer: "));
		
		ifInput = new TextField(10);
		add(ifInput);
		ifInput.addActionListener(new IFInputListener());
		
		add(new Label("The Accumulated Sum is: "));
		
		ifOutput = new TextField(10);
		ifOutput.setEditable(false);
		add(ifOutput);
		
		setTitle("AWT Accumulator");
		setSize(350, 120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AWTAccumulator();
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
