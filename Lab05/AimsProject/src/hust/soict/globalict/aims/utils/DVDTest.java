package hust.soict.globalict.aims.utils;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class DVDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1= new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("BBBB", "bbbb", "bbbb", 2, 5.3f);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("CCCC", "cccc", "cccc", 3, 5f);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("DDDD", "dddd", "dddd", 4, 7.1f);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("EEEE", "eeee", "eeee", 5, 3.3f);

		System.out.println(DVDUtils.compareByCost(dvd1, dvd2));
		//compareByCost return 1 if dvd1.cost>dvd2.cost, 
		//return 0 if dvd1.cost=dvd2.cost, return -1 if dvd1.cost<dvd2.cost
		
		System.out.println(DVDUtils.compareByTitle(dvd3, dvd4));
		//compareByTitle Compares strings lexicographically return >0 if dvd1.title>dvd2.title, 
		//return 0 if dvd1.title=dvd2.title, return <0 if dvd1.title<dvd2.title
		
		DigitalVideoDisc[] sorted = DVDUtils.sortByCost(new DigitalVideoDisc[] {dvd1, dvd2,
				dvd3, dvd4, dvd5});
		System.out.println("Sort by cost: ");
		
		for(int i=0; i<sorted.length; i++) {
			System.out.println(i+1 +". " +sorted[i].getDetail());
		}
		
		sorted = DVDUtils.sortByTitle(new DigitalVideoDisc[] {dvd1, dvd2,
				dvd3, dvd4, dvd5});
		System.out.println("Sort by Title: ");
		
		for(int i=0; i<sorted.length; i++) {
			System.out.println(i+1 +". " + sorted[i].getDetail());
		}
	}
}


