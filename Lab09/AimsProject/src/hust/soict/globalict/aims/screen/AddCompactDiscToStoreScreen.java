package hust.soict.globalict.aims.screen;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.store.Store;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		
		JPanel inputPane=new JPanel(new GridLayout(0,2,2,2));
		inputPane.setBorder(BorderFactory.createEmptyBorder(20,30,30,40)); 
		
		inputPane.add(new JLabel("Title:"));
		JTextField title =new JTextField(50);
        inputPane.add(title);
        
        inputPane.add(new JLabel("Category:"));
        JTextField category =new JTextField(50);
        inputPane.add(category);
        
        inputPane.add(new JLabel("Artist:"));
        JTextField artist =new JTextField(50);
        inputPane.add(artist);
        
        inputPane.add(new JLabel("Director:"));
        JTextField director =new JTextField(50);
        inputPane.add(director);
        
        inputPane.add(new JLabel("Cost:"));
        JTextField cost =new JTextField(50);
        inputPane.add(cost);
        
        inputPane.add(new JLabel("Number of Tracks:"));
        JTextField trackNum =new JTextField(50);
        inputPane.add(trackNum);
        	
        JPanel footPane=new JPanel();
        JButton addButton = new JButton("ADD");
        addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				CompactDisc cd = new CompactDisc(title.getText(), category.getText(), artist.getText(), director.getText(), Float.parseFloat(cost.getText().toString()));
				setVisible(false);
				int n = Integer.parseInt(trackNum.getText().toString());
				dispose();
				new AddTrackToCD(store, cart, cd, n , 1);
			}
		});
        footPane.add(addButton);
        inputPane.add(footPane,BorderLayout.SOUTH);
        center.add(inputPane,BorderLayout.CENTER);    
		return center;
	}
	
	public AddCompactDiscToStoreScreen(Store store, Cart cart) {
		super(store, cart);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Add Compact Disc To Store");
		setSize(700, 400);
	}

}
