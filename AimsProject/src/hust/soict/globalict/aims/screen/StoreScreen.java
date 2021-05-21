package hust.soict.globalict.aims.screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.*;

public class StoreScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Store store;
	private Cart cart;
	
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
		menu.add(new JMenuItem("View store"));
		
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
		center.setLayout(new GridLayout(0,5,2,2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for(int i = 0; i< store.storeSize(); i++) {
			MediaStore cell =new MediaStore(mediaInStore.get(i));
			center.add(cell);
		}
		return center;
	}
	
	public class MediaStore extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Media media;
		public MediaStore(Media media) {
			this.media = media;
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			JLabel title = new JLabel(media.getTitle());
			title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
			title.setAlignmentX(CENTER_ALIGNMENT);
			
			JLabel cost = new JLabel("" + media.getCost()+ " $");
			cost.setAlignmentX(CENTER_ALIGNMENT);
			
			JPanel container = new JPanel();
			container.setLayout(new FlowLayout(FlowLayout.CENTER));
			
			JButton addToCartButton = new JButton("Add to cart");
			addToCartButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					cart.addToCart(media);
				}
			});
			container.add(addToCartButton);

			if(media instanceof Playable) {
				JButton playButton = new JButton("Play");
				playButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						try {
							((Playable) media).play();
						} catch (PlayerException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				container.add(playButton);
			}
			
			this.add(Box.createVerticalGlue());
			this.add(title);
			this.add(cost);
			this.add(Box.createVerticalGlue());
			this.add(container);
			
			this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
	}
	

	public StoreScreen(Store store, Cart cart) {
		this.store = store;
		this.cart = cart;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
	}
	
	
}
