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
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

	private static final long serialVersionUID = 1L;

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
        
        inputPane.add(new JLabel("Author:"));
        JTextField author =new JTextField(50);
        inputPane.add(author);
        
        inputPane.add(new JLabel("Content:"));
        JTextField content =new JTextField(50);
        inputPane.add(content);
        
        inputPane.add(new JLabel("Cost:"));
        JTextField cost =new JTextField(50);
        inputPane.add(cost);
        
        
        JPanel footPane=new JPanel();
        JButton addButton = new JButton("ADD");
        addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Book book= new Book(title.getText(), category.getText(), content.getText(), Float.parseFloat(cost.getText().toString()));
				book.addAuthor(author.getText());
				store.addMedia(book);
				dispose();
				new StoreScreen(store, cart);
			}
		});
        footPane.add(addButton);
        inputPane.add(footPane,BorderLayout.SOUTH);
        center.add(inputPane,BorderLayout.CENTER);    
		return center;
	}
	
	public AddBookToStoreScreen(Store store, Cart cart) {
		super(store, cart);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Add Book To Store");
		setSize(700, 400);
	}

}