package hust.soict.globalict.aims.screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.store.Store;

public class AddItemToStoreScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Store store;
	protected Cart cart;
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		
		JMenuItem addBook = new JMenuItem("Add Book");
		smUpdateStore.add(addBook);
		addBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dispose();
				new AddBookToStoreScreen(store,cart);
			}
		});
		
		JMenuItem addCD = new JMenuItem("Add CD");
		smUpdateStore.add(addCD);
		addCD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dispose();
				new AddCompactDiscToStoreScreen(store,cart);
			}
		});
		JMenuItem addDVD = new JMenuItem("Add DVD");
		smUpdateStore.add(addDVD);
		addDVD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dispose();
				new AddDigitalVideoDiscToStoreScreen(store,cart);
			}
		});

		menu.add(smUpdateStore);
		
		JMenuItem viewStore = new JMenuItem("View store");
		menu.add(viewStore);
		viewStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dispose();
				new StoreScreen(store, cart);
			}
		});
		
		JMenuItem viewCart = new JMenuItem("View cart");
		menu.add(viewCart);
		viewCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dispose();
				new CartScreen(cart, store);
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton viewCart = new JButton("View cart");
		viewCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dispose();
				new CartScreen(cart, store);
			}
		});
		viewCart.setPreferredSize(new Dimension(100, 50));
		viewCart.setMaximumSize(new Dimension(100, 50));
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(viewCart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		  
		return center;
	}
	
	public AddItemToStoreScreen(Store store, Cart cart) {
		this.store = store;
		this.cart =cart;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Add Item To Store");
		setSize(700, 400);
	}
	
}
