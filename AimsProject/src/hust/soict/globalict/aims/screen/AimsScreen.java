package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.store.Store;

public class AimsScreen {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		Store anItem = new Store();
		
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.9f);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Harry Potter and the Philosopher's Stone", "Fantasy", "Chris Columbus", 150, 20.2f);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", "David Yates", 175 , 26.5f);
		DigitalVideoDisc dvd6= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", "David Yates", 147 , 24.5f);
		DigitalVideoDisc dvd7= new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 20.6f);
		anItem.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7);
		
		// Create new book objects and add them to the store
		Book book1= new Book("To Kill a Mockingbird", "Classic Novel", "A jarring & poignantly beautiful story about how humans treat each other.", 6.35f);
		book1.addAuthor("Harper Lee");
		Book book2= new Book("The Great Gatsby", "Classic Novel", "The greatest, most scathing dissection of the hollowness at the heart of the American dream. Hypnotic, tragic, both of its time and completely relevant.", 5.5f);
		book2.addAuthor("F. Scott Fitzgerald");
		Book book3= new Book("Pride and Prejudice", "Classic Novel", "Philosophy, history, wit, and the most passionate love story.", 6.3f);
		book3.addAuthor("Jane Austen");
		Book book4= new Book("Doraemon 1", "Comic", "Doraemon, a cat robot from the 22nd century", 4.25f);
		book4.addAuthor("Fujiko Fujio");
		Book book5= new Book("Doraemon 2", "Comic", "Doraemon is sent to help Nobita Nobi, a young boy who receives poor grades and is frequently bullied by his two classmates", 4.30f);
		book5.addAuthor("Fujiko Fujio");
		Book book6= new Book("Doraemon 3", "Comic", "Nobita Nobi and Doraemon end up developing a strong bond with each other.", 4.45f);
		book6.addAuthor("Fujiko Fujio");
		Book book7= new Book("Doraemon 4", "Comic", "Doraemon is sent to take care of Nobita by Sewashi Nobi, Nobita's future grandson, so that his descendants can get a better life", 4.15f);
		book7.addAuthor("Fujiko Fujio");
		anItem.addMedia(book1, book2, book3, book4, book5, book6, book7);
		
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
		
		CompactDisc cd4= new CompactDisc("Reputation", "Pop music", "Taylor Swift", "Big Machine Label Group", 14.2f);
		cd4.addTrack(new Track("...Ready For It?", 3));
		cd4.addTrack(new Track("End Game [feat. Ed Sheeran & Future]", 4));
		cd4.addTrack(new Track("Delicate", 4));
		cd4.addTrack(new Track("Look What You Made Me Do", 3));
		cd4.addTrack(new Track("Gorgeous", 4));
		
		CompactDisc cd5= new CompactDisc("After hours", "R&B music", "The Weeknd", "The Weeknd XO", 14.6f);
		cd5.addTrack(new Track("Blinding Lights", 3));
		cd5.addTrack(new Track("After Hours", 6));
		cd5.addTrack(new Track("Save Your Tears", 3));
		cd5.addTrack(new Track("Alone Again", 4));
		
		CompactDisc cd6= new CompactDisc("Camila", "Pop music", "Camila Cabello", "Epic Records", 14f);
		cd6.addTrack(new Track("Real Friends", 3));
		cd6.addTrack(new Track("Never Be the Same", 4));
		cd6.addTrack(new Track("Havana", 4));
		cd6.addTrack(new Track("Consequences", 3));
		
		CompactDisc cd7= new CompactDisc("In The Lonely Hour", "Pop music", "Sam Smith", "Universal Music Operations Limited", 14.5f);
		cd7.addTrack(new Track("Stay With Me", 3));
		cd7.addTrack(new Track("I'm Not The Only One", 4));
		cd7.addTrack(new Track("Lay Me Down", 3));
		cd7.addTrack(new Track("La La La", 3));
		anItem.addMedia(cd1, cd2, cd3, cd4, cd5, cd6, cd7);
		
		new StoreScreen(anItem, anOrder);
	}
}
