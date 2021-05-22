package hust.soict.globalict.aims.screen;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store;

public class AddTrackToCD extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Store store;
	private Cart cart;
	private CompactDisc cd;
	private int n;
	private int i;
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		
		JPanel inputPane=new JPanel(new GridLayout(0,2,2,2));
		inputPane.setBorder(BorderFactory.createEmptyBorder(20,30,30,40)); 
		
		inputPane.add(new JLabel("Title:"));
		JTextField trackTitle =new JTextField(50);
        inputPane.add(trackTitle);
        
        inputPane.add(new JLabel("Length:"));
        JTextField trackLength =new JTextField(50);
        inputPane.add(trackLength);
        
        JPanel footPane=new JPanel();
        JButton addButton = new JButton("ADD");
        addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				cd.addTrack(new Track(trackTitle.getText(), Integer.parseInt(trackLength.getText().toString())));
				if(i==n){
					store.addMedia(cd);
					dispose();
					new StoreScreen(store, cart);
				}
				else {
					dispose();
					new AddTrackToCD(store, cart, cd, n , i+1);
				}
			}
		});
        footPane.add(addButton);
        inputPane.add(footPane,BorderLayout.SOUTH);
        center.add(inputPane,BorderLayout.CENTER);    
		return center;
	}
	
	public AddTrackToCD(Store store, Cart cart, CompactDisc cd, int n, int i) {
		this.store = store;
		this.cart = cart;
		this.cd = cd;
		this.n = n;
		this.i= i;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createCenter(), BorderLayout.CENTER);
		setVisible(true);
		setTitle(cd.getTitle()+ " - Track" + i);
		setSize(400, 170);
	}
}
