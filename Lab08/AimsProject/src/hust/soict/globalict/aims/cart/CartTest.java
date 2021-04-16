package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.*;
public class CartTest {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
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
		
		Book book8= new Book("Doraemon 5", "Comic", "Doraemon has a four-dimensional pouch in which he stores unexpected gadgets he uses to help Nobita", 4.15f);
		book8.addAuthor("Fujiko Fujio");
		
		Book book9= new Book("Doraemon 6", "Comic", "His most important gadgets include- Bamboo-Copter, a small piece of headgear that can allow its users to fly", 4.05f);
		book9.addAuthor("Fujiko Fujio");
		
		Book book10= new Book("Doraemon 7", "Comic", "Anywhere Door, a pink-colored door that allows people to travel according to the thoughts of the person who turns the knob", 4.25f);
		book10.addAuthor("Fujiko Fujio");
		
		Book book11= new Book("Doraemon 8", "Comic", "Time Kerchief, a handkerchief that can turn an object new or old or a person young or old", 4.15f);
		book11.addAuthor("Fujiko Fujio");
		
		Book book12= new Book("Doraemon 9", "Comic", "Translator Tool, a cuboid jelly that can allow people to converse in any language across the universe", 4.55f);
		book12.addAuthor("Fujiko Fujio");
		
		Book book13= new Book("The Lord of the Rings: The Fellowship of the Ring", "Fantasy Novel", "At 33, the age of adulthood among hobbits, Frodo Baggins receives a magic Ring of Invisibility from his uncle Bilbo", 6.4f);
		book13.addAuthor("J. R. R. Tolkien");
		
		Book book14= new Book("The Lord of the Rings: The Two Towers", "Fantasy Novel", "Frodo, a Christlike figure, learns that the ring has the power to control the entire world and, he discovers, to corrupt its owner", 6.65f);
		book14.addAuthor("J. R. R. Tolkien");
		
		Book book15= new Book("The Lord of the Rings: The Return of the King", "Fantasy Novel", "A fellowship of hobbits, elves, dwarfs, and men is formed to destroy the ring by casting it into the volcanic fires of the Crack of Doom, where it was forged", 6.6f);
		book15.addAuthor("J. R. R. Tolkien");
		
		Book book16= new Book("The Hobbit", "Fantasy Novel", "They are opposed on their harrowing mission by the evil Sauron and his Black Riders.", 6.5f);
		book16.addAuthor("J. R. R. Tolkien");
		
		Book book17= new Book("I can the can", "Book", "I can. !can the can, but the, can ?cannot can me", 3.3f);
		book17.addAuthor("Me");
		book17.addAuthor("The can");
		book17.addAuthor("Harper Lee");
		book17.removeAuthor("Harper Lee");
		book17.removeAuthor("Harper Le");
		
		anOrder.addMedia(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15, book16, book17);
		
		System.out.println(anOrder.totalCost());
		anOrder.sortByCost();
		System.out.println();
		anOrder.sortByTitle();
	
		System.out.println();
		anOrder.searchByID(2);
	
		System.out.println();
		anOrder.searchByID(1);
	
		System.out.println();
		anOrder.printList();
		
		anOrder.searchByTitle("DORAEMON lord");
		
		book17.seeDetail();
		anOrder.removeByID(17);
		
		
		CompactDisc cd1= new CompactDisc("Future Nostalgia","Pop music", "Dua Lipa", "Warner Records UK", 23.6f);
		cd1.addTrack(new Track("Future Nostalgia", 4));
		cd1.addTrack(new Track("Physical", 3));
		cd1.addTrack(new Track("Don't Start Now", 3));
		cd1.addTrack(new Track("Levitating", 3));
		cd1.addTrack(new Track("Break My Heart", 3));
		cd1.addTrack(new Track("Break My Heart", 3));
		cd1.removeTrack(new Track("Levitating", 3));
		cd1.removeTrack(new Track("Levitating", 3));
		cd1.seeDetail();
		cd1.play();
		anOrder.addMedia(cd1);
		anOrder.removeMedia(cd1);
		anOrder.removeMedia(cd1);
	}
}


