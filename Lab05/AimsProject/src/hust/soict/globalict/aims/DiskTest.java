package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class DiskTest {
	public static void main(String[] args) {
		// Create a new cart
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Harry Potter and the Philosopher's Stone", "Fantasy", 
				"Chris Columbus", 150, 20.2f);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", 
				"David Yates", 175 , 26.5f);
		DigitalVideoDisc dvd6= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", 
				"David Yates", 147 , 24.5f);
		DigitalVideoDisc dvd7= new DigitalVideoDisc("Avatar", "Science Fiction", 20.6f);
		DigitalVideoDisc dvd8= new DigitalVideoDisc("Titanic", "Romantic", 16.5f);
		DigitalVideoDisc dvd9= new DigitalVideoDisc("Avengers: Endgame", "Science Fiction", 27.55f);
		DigitalVideoDisc dvd10= new DigitalVideoDisc("Avengers: Infinity War", "Science Fiction", 26.5f);
		DigitalVideoDisc dvd11= new DigitalVideoDisc("Avengers: Age of Ultron", "Science Fiction", 26.5f);
		DigitalVideoDisc dvd12= new DigitalVideoDisc("Avengers 1", "Science Fiction", 26.5f);
		DigitalVideoDisc dvd13= new DigitalVideoDisc("Captain America: The First Avenger", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd14= new DigitalVideoDisc("Captain America: The Winter Soldier", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd15= new DigitalVideoDisc("Captain America: Civil War", "Science Fiction", 26.0f);
		DigitalVideoDisc dvd16= new DigitalVideoDisc("Iron man 1", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd17= new DigitalVideoDisc("Iron man 2", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd18= new DigitalVideoDisc("Iron man 3", "Science Fiction", 25.5f);
		DigitalVideoDisc dvd19= new DigitalVideoDisc("Iron man 4", "Science Fiction", 26.0f);
		DigitalVideoDisc dvd20= new DigitalVideoDisc("Doctor Strange", "Science Fiction", 26.0f);
		DigitalVideoDisc dvd21= new DigitalVideoDisc("Guadians of the Galaxy 1", "Science Fiction", 24.8f);
		anOrder.addDigitalVideoDisc(dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, dvd10, dvd11, dvd12, dvd13, dvd14, dvd15, 
				dvd16, dvd17, dvd18, dvd19, dvd20, dvd21);
		System.out.println("------------------------------------------------------------");
		anOrder.searchByTitle("harry potter");
		anOrder.searchByTitle("HARRY");
		anOrder.searchByTitle("harry AVenGer");
		anOrder.searchByTitle("harryp");
	}
}
