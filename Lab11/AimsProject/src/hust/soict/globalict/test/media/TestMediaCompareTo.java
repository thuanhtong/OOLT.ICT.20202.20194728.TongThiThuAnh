package hust.soict.globalict.test.media;

import java.util.*;
import hust.soict.globalict.aims.media.*;

public class TestMediaCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Media> collection = new ArrayList<Media>();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 25.9f);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.9f);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Aladin", "Live action", 25.9f);
		//Add DVD objects to the ArrayList
		collection.add(dvd1);
		collection.add(dvd4);
		collection.add(dvd3);
		collection.add(dvd2);
		
		//Iterate through the ArrayList and output their titles (unsorted order)
		Iterator<Media> iterator = collection.iterator();
		System.out.println("-----------------------------------");
		System.out.println("The DVDs currently in the order are: ");
		while (iterator.hasNext()) 
			System.out.println(((DigitalVideoDisc)iterator.next()).getDetail());
		
		
		//Sort the collection of DVDs - based on the compareTo() method
		Collections.sort((List<Media>)collection);
		//Iterate through the ArrayList and output their titles - in sort order
		iterator = collection.iterator();
		System.out.println("-----------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		while (iterator.hasNext()) 
			System.out.println(((DigitalVideoDisc)iterator.next()).getDetail());

		
		Collections.sort((List<Media>)collection, Media.COMPARE_BY_COST_TITLE);
		iterator = collection.iterator();
		System.out.println("-----------------------------------");
		System.out.println("The DVDs in sorted order COMPARE_BY_COST_TITLE are : ");
		while (iterator.hasNext()) 
			System.out.println(((DigitalVideoDisc)iterator.next()).getDetail());
		
		
		Collections.sort((List<Media>)collection,  Media.COMPARE_BY_TITLE_COST);
		iterator = collection.iterator();
		System.out.println("-----------------------------------");
		System.out.println("The DVDs in sorted order COMPARE_BY_TITLE_COST are: ");
		while (iterator.hasNext()) 
			System.out.println(((DigitalVideoDisc)iterator.next()).getDetail());
		System.out.println("-----------------------------------");
		
	}

}
