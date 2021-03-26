package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
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
		DigitalVideoDisc dvd11= new DigitalVideoDisc("Captain America", "Science Fiction","Anthony Russo", 150, 25.0f);
		DigitalVideoDisc dvd12= new DigitalVideoDisc("Captain America", "Science Fiction","Russo Brother", 170, 26.0f);
		
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3,dvd4);
		anOrder.addDigitalVideoDisc(dvd5);
		anOrder.addDigitalVideoDisc(dvd6,dvd7);
		anOrder.addDigitalVideoDisc(dvd8,dvd9);
		anOrder.addDigitalVideoDisc(dvd10,dvd11);
		anOrder.addDigitalVideoDisc(dvd12);
		
		DigitalVideoDisc list[] = new DigitalVideoDisc[20];
		DigitalVideoDisc dvd13= new DigitalVideoDisc("Iron man 1", "Science Fiction", 25.0f);
		list[0]=dvd13;
		DigitalVideoDisc dvd14= new DigitalVideoDisc("Iron man 2", "Science Fiction", 25.0f);
		list[1]=dvd14;
		DigitalVideoDisc dvd15= new DigitalVideoDisc("Iron man 3", "Science Fiction", 25.5f);
		list[2]=dvd15;
		DigitalVideoDisc dvd16= new DigitalVideoDisc("Iron man 4", "Science Fiction", 26.0f);
		list[3]=dvd16;
		DigitalVideoDisc dvd17= new DigitalVideoDisc("Doctor Strange", "Science Fiction", 26.0f);
		list[4]=dvd17;
		anOrder.addDigitalVideoDisc(list);
		
		anOrder.removeDigitalVideoDisc(dvd5);
		
		System.out.println();
		anOrder.sortByCost();
		anOrder.sortByTitle();
		
		System.out.println();
		anOrder.searchByID(5);
		
		System.out.println();
		anOrder.searchByID(16);
		
		System.out.println();
		anOrder.printList();
		

	}

}
