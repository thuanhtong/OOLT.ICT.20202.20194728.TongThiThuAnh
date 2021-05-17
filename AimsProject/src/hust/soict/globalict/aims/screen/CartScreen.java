package hust.soict.globalict.aims.screen;

import java.io.IOException;


import javax.swing.JFrame;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CartScreen extends JFrame {
	private Cart cart;
	private Store store;
	public CartScreen(Cart cart, Store store) {
		super();
		
		this.cart =cart;
		this.store = store;
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Cart");
		this.setVisible(true);
		this.setSize(1024, 768);
		JFrame jframe = this;
		
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/globalict/aims/screen/Cart.fxml"));
					
					CartScreenController controller = new CartScreenController(cart, store, jframe);
					
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}
	
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		Store anItem = new Store();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.9f);
		anOrder.addMedia(dvd1, dvd2, dvd3);
		
		// Create new book objects and add them to the store
		Book book1= new Book("To Kill a Mockingbird", "Classic Novel", "A jarring & poignantly beautiful story about how humans treat each other.", 6.35f);
		book1.addAuthor("Harper Lee");
		Book book2= new Book("The Great Gatsby", "Classic Novel", "The greatest, most scathing dissection of the hollowness at the heart of the American dream. Hypnotic, tragic, both of its time and completely relevant.", 5.5f);
		book2.addAuthor("F. Scott Fitzgerald");
		Book book3= new Book("Pride and Prejudice", "Classic Novel", "Philosophy, history, wit, and the most passionate love story.", 6.3f);
		book3.addAuthor("Jane Austen");
		anOrder.addMedia(book1, book2, book3);
		
		// Create new cd objects and add them to the store
		CompactDisc cd1= new CompactDisc("Future Nostalgia","Pop music", "Dua Lipa", "Warner Records UK", 23.6f);
		cd1.addTrack(new Track("Future Nostalgia", 4));
		cd1.addTrack(new Track("Physical", 3));
		cd1.addTrack(new Track("Don't Start Now", 3));
		cd1.addTrack(new Track("Levitating", 3));
		cd1.addTrack(new Track("Break My Heart", 3));
		
		CompactDisc cd2= new CompactDisc("Positions", "Pop music", "Ariana Grande", "UMG Recordings Inc.", 18.5f);
		cd2.addTrack(new Track("34+35", 3));
		cd2.addTrack(new Track("positions", 3));
		cd2.addTrack(new Track("shut up", 2));
		
		CompactDisc cd3= new CompactDisc("Heaven & Hell", "Pop music", "Ava Max", "Atlantic Records", 15.6f);
		cd3.addTrack(new Track("Kings & Queens", 3));
		cd3.addTrack(new Track("So Am I", 3));
		cd3.addTrack(new Track("Salt", 3));
		cd3.addTrack(new Track("Sweet but Psycho", 3));
		anOrder.addMedia(cd1, cd2, cd3);
		
		new CartScreen(anOrder, anItem);
	}
}
