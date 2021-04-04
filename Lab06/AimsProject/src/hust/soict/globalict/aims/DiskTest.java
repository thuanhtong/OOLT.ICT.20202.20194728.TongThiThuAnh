package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;

public class DiskTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		// Create a new cart
		Cart anOrder = new Cart();
		
		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1= new DigitalVideoDisc("Harry Potter and the Philosopher's Stone", "Fantasy", 
				"Chris Columbus", 150, 20.2f);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", 
				"David Yates", 175 , 26.5f);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", 
				"David Yates", 147 , 24.5f);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Avatar", "Science Fiction", 20.6f);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Titanic", "Romantic", 16.5f);
		DigitalVideoDisc dvd6= new DigitalVideoDisc("Avengers: Endgame", "Science Fiction", 27.55f);
		DigitalVideoDisc dvd7= new DigitalVideoDisc("Avengers: Infinity War", "Science Fiction", 26.5f);
		DigitalVideoDisc dvd8= new DigitalVideoDisc("Avengers: Age of Ultron", "Science Fiction", 26.5f);
		DigitalVideoDisc dvd9= new DigitalVideoDisc("Avengers 1", "Science Fiction", 26.5f);
		
		//Disc with same name and cost
		DigitalVideoDisc dvd10= new DigitalVideoDisc("Captain America", "Science Fiction", "Joe Johnston", 155, 25.0f);
		DigitalVideoDisc dvd11= new DigitalVideoDisc("Captain America", "Science Fiction","Anthony Russo", 150, 26.0f);
		DigitalVideoDisc dvd12= new DigitalVideoDisc("Captain America", "Science Fiction","Russo Brother", 170, 25.0f);
		
		DigitalVideoDisc dvd13= new DigitalVideoDisc("Iron man 1", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd14= new DigitalVideoDisc("Iron man 2", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd15= new DigitalVideoDisc("Iron man 3", "Science Fiction", 25.5f);
		DigitalVideoDisc dvd16= new DigitalVideoDisc("Iron man 4", "Science Fiction", 26.0f);
		DigitalVideoDisc dvd17= new DigitalVideoDisc("Doctor Strange", "Science Fiction", 26.0f);
		DigitalVideoDisc dvd18= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd19= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		//Media dvd20= new DigitalVideoDisc("Aladin", "Animation", 18.9f);
		
		anOrder.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, dvd10, dvd11, dvd12, dvd13, dvd14, dvd15, 
				dvd16, dvd17,dvd18,dvd19);
		
		anOrder.removeMedia(dvd5);
		anOrder.addMedia(dvd1);
		anOrder.addMedia(dvd6);
		
		System.out.println();
		dvd6.seeDetail();
		System.out.println(anOrder.totalCost());
		anOrder.sortByCost();
		System.out.println();
		anOrder.sortByTitle();
		
		System.out.println();
		anOrder.searchByID(6);
	
		System.out.println();
		anOrder.searchByID(16);
		
		System.out.println();
		anOrder.printList();
		
		anOrder.searchByTitle("harry potter");
		anOrder.searchByTitle("HARRY");
		anOrder.searchByTitle("harry AVenGer");
		anOrder.searchByTitle("harryp");
		
		anOrder.removeByID(20);
		
		System.out.println("Get lucky item: ");
		System.out.println(anOrder.getALuckyItem().getDetail());
		
		anOrder.getFreeItem();
		
		System.out.println();
		anOrder.printList();
		//System.out.println(dvd20 instanceof Book);
	}
}
