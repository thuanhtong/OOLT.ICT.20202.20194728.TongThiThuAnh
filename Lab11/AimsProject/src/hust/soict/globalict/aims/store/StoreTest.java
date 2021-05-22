package hust.soict.globalict.aims.store;

import java.util.Scanner;

import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.*;

public class StoreTest {
	public static void main(String[] args) throws PlayerException {
		Store anItem = new Store();
		
		// Create new dvd objects and add them to the store
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.99f);
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
		anItem.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, dvd10, dvd11, dvd12, dvd13, dvd14, dvd15, 
				dvd16, dvd17, dvd18, dvd19, dvd20);
		
		// remove disc from the store
		anItem.removeMedia(dvd5);
		anItem.removeMedia(dvd5);
		anItem.addMedia(dvd21);

		anItem.viewStore();
		System.out.println(anItem.searchByID(9).getDetail());
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Title: ");
			String title =sc.nextLine();
			System.out.print("Enter Category: ");
			String category=sc.nextLine();
			System.out.print("Enter Author: ");
			String Author=sc.nextLine();
			System.out.print("Enter Content: ");
			String content=sc.nextLine();
			System.out.print("Enter Cost: ");
			float cost=sc.nextFloat();
			Book book= new Book(title, category, content, (float)cost);
			book.addAuthor(Author);
			anItem.addMedia(book);
		}
		anItem.viewStore();
		dvd5.play();
	}
}
