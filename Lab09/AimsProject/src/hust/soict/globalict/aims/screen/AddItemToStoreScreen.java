package hust.soict.globalict.aims.screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.screen.*;
import hust.soict.globalict.aims.store.Store;

public class AddItemToStoreScreen extends JFrame {
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
				viewCart(cart);
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
				viewCart(cart);
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
	
	public void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Get a lucky item from cart");
		System.out.println("5. Play a media in cart");
		System.out.println("6. Place order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5-6");
	}
	
	public void viewCart(Cart cart) {
		Scanner sc = new Scanner(System.in);
		int c;
		do {
			System.out.println("--------------------------------------------------------");
			cart.printList();
			cartMenu();
			System.out.print("Your choice: ");
			c = sc.nextInt();
			switch(c) {
			case 0: //exit
				new StoreScreen(store, cart);
				break;
			case 1:
				System.out.println("FILTER MEDIA IN CART: ");
				System.out.println("1. By ID");
				System.out.println("2. By Title");
				System.out.print("Your choice: ");
				int choice = sc.nextInt();
				if(choice ==1) {
					System.out.print("Enter Media's ID: ");
					int id = sc.nextInt();
					cart.searchByID(id);
				}
				else if(choice ==2) {
					System.out.print("Enter Media's title: ");
					sc.nextLine();
					String title = sc.nextLine();
					cart.searchByTitle(title);
				}
				else System.out.println("Wrong functionality!");
				break;
			case 2:
				System.out.println("SORT MEDIA IN CART: ");
				System.out.println("1. By Title - Cost");
				System.out.println("2. By Cost - Title");
				System.out.print("Your choice: ");
				choice = sc.nextInt();
				if(choice ==1) {
					cart.sortByTitle();
				}
				else if(choice ==2) {
					cart.sortByCost();
				}
				else System.out.println("Wrong functionality!");
				break;
			case 3:
				System.out.print("Enter Media's ID to remove from cart: ");
				int id = sc.nextInt();
				cart.removeByID(id);
				break;
			case 4:
				cart.getFreeItem();
				break;
			case 5:
				System.out.print("Enter Media's ID to play: ");
				id = sc.nextInt();
				cart.playMedia(id);
				break;
			case 6:
				cart.emptyCart();
				break;
			default:
				System.out.println("Wrong functionality! Please choose again.\n");
				break;
			}
		}while(c!=0);
	}
}
