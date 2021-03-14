
public class Aims {

	public static void main(String[] args) {
		// Create a new cart
		Cart anOrder = new Cart();
		
		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);

		DigitalVideoDisc dvd4= new DigitalVideoDisc("Harry Potter and the Philosopher's Stone", "Fantasy", 
				"Chris Columbus", 150, 20.2f);
		anOrder.addDigitalVideoDisc(dvd4);
		
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", 
				"David Yates", 175 , 26.5f);
		anOrder.addDigitalVideoDisc(dvd5);
		
		DigitalVideoDisc dvd6= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", 
				"David Yates", 147 , 24.5f);
		anOrder.addDigitalVideoDisc(dvd6);
		
		DigitalVideoDisc dvd7= new DigitalVideoDisc("Avatar", "Science Fiction", 20.6f);
		anOrder.addDigitalVideoDisc(dvd7);
	
		DigitalVideoDisc dvd8= new DigitalVideoDisc("Titanic", "Romantic", 16.5f);
		anOrder.addDigitalVideoDisc(dvd8);
		
		DigitalVideoDisc dvd9= new DigitalVideoDisc("Avengers: Endgame", "Science Fiction", 27.55f);
		anOrder.addDigitalVideoDisc(dvd9);
		
		DigitalVideoDisc dvd10= new DigitalVideoDisc("Avengers: Infinity War", "Science Fiction", 26.5f);
		anOrder.addDigitalVideoDisc(dvd10);
		
		DigitalVideoDisc dvd11= new DigitalVideoDisc("Avengers: Age of Ultron", "Science Fiction", 26.5f);
		anOrder.addDigitalVideoDisc(dvd11);
		
		DigitalVideoDisc dvd12= new DigitalVideoDisc("Avengers 1", "Science Fiction", 26.5f);
		anOrder.addDigitalVideoDisc(dvd12);
		
		DigitalVideoDisc dvd13= new DigitalVideoDisc("Captain America: The First Avenger", "Science Fiction", 25.0f);
		anOrder.addDigitalVideoDisc(dvd13);
		
		DigitalVideoDisc dvd14= new DigitalVideoDisc("Captain America: The Winter Soldier", "Science Fiction", 25.0f);
		anOrder.addDigitalVideoDisc(dvd14);
		
		DigitalVideoDisc dvd15= new DigitalVideoDisc("Captain America: Civil War", "Science Fiction", 26.0f);
		anOrder.addDigitalVideoDisc(dvd15);
		
		DigitalVideoDisc dvd16= new DigitalVideoDisc("Iron man 1", "Science Fiction", 25.0f);
		anOrder.addDigitalVideoDisc(dvd16);
		
		DigitalVideoDisc dvd17= new DigitalVideoDisc("Iron man 2", "Science Fiction", 25.0f);
		anOrder.addDigitalVideoDisc(dvd17);
		
		DigitalVideoDisc dvd18= new DigitalVideoDisc("Iron man 3", "Science Fiction", 25.5f);
		anOrder.addDigitalVideoDisc(dvd18);
		
		DigitalVideoDisc dvd19= new DigitalVideoDisc("Iron man 4", "Science Fiction", 26.0f);
		anOrder.addDigitalVideoDisc(dvd19);
		
		DigitalVideoDisc dvd20= new DigitalVideoDisc("Doctor Strange", "Science Fiction", 26.0f);
		anOrder.addDigitalVideoDisc(dvd20);
		
		DigitalVideoDisc dvd21= new DigitalVideoDisc("Guadians of the Galaxy 1", "Science Fiction", 24.8f);
		anOrder.addDigitalVideoDisc(dvd21);
		
		// remove disc from the cart
		anOrder.removeDigitalVideoDisc(dvd4);
		anOrder.removeDigitalVideoDisc(dvd5);
		anOrder.removeDigitalVideoDisc(dvd5);
		
		anOrder.addDigitalVideoDisc(dvd21);
		anOrder.removeDigitalVideoDisc(dvd17);
		anOrder.removeDigitalVideoDisc(dvd21);
		anOrder.removeDigitalVideoDisc(dvd21);
		
		//print total cost of the items in the cart
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());

	}
}
