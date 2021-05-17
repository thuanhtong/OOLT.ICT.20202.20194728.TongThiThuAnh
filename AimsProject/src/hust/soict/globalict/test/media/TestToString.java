package hust.soict.globalict.test.media;

import java.util.ArrayList;
import java.util.List;
import hust.soict.globalict.aims.media.*;

public class TestToString {
	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		DigitalVideoDisc dvd= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		mediae.add(dvd);
		
		Book book= new Book("To Kill a Mockingbird", "Classic Novel", "A jarring & poignantly beautiful story about how humans treat each other.", 6.35f);
		book.addAuthor("Harper Lee");
		mediae.add(book);
		
		CompactDisc cd= new CompactDisc("Future Nostalgia","Pop music", "Dua Lipa", "Warner Records UK", 23.6f);
		cd.addTrack(new Track("Future Nostalgia", 4));
		cd.addTrack(new Track("Physical", 3));
		cd.addTrack(new Track("Don't Start Now", 3));
		cd.addTrack(new Track("Levitating", 3));
		cd.addTrack(new Track("Break My Heart", 3));
		mediae.add(cd);
		System.out.println("--------------------------------------------");
		for (Media m : mediae)
			System.out.println(m.toString());

		//if we not override toString method(), the program will implement the toString() method of Object class
//		public String toString() {
//		    return getClass().getName()+"@"+Integer.toHexString(hashCode());
//		}
		//method's returning is unmeaningful for us -> we should override toString() method for each type of media so that we can output
		//presentation of object that we want (like toString() method of Book)
	}
}
