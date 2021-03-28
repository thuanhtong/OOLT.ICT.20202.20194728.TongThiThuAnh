package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.disc.TestPassingParameter;

public class Store {
	public static final int MAX_NUMBERS_ITEM =1000;
	
	private DigitalVideoDisc itemsInStore[]= new DigitalVideoDisc[MAX_NUMBERS_ITEM];
	
	private int qtyItem=0;

	public void addDVD(DigitalVideoDisc disc) {
		if(qtyItem <MAX_NUMBERS_ITEM) {
			itemsInStore[qtyItem]= disc;
			System.out.println("The disc '" + disc.getTitle() + "' has been added to the store.");
			qtyItem++;
			if(qtyItem == MAX_NUMBERS_ITEM -1) System.out.println("Space for items in the store is almost full.");
			if(qtyItem == MAX_NUMBERS_ITEM) System.out.println("The store is run out of space for items.");
		}
		else System.out.println("Can't add the disc '" + disc.getTitle() + "' into the store. Space for items is already full!");
	}
	
	public void addDVD(DigitalVideoDisc... dvdList) {
		for(int i=0; i<dvdList.length; i++) {
			if(qtyItem <MAX_NUMBERS_ITEM) {
				itemsInStore[qtyItem]= dvdList[i];
				System.out.println("The disc '" + dvdList[i].getTitle() + "' has been added to the store.");
				qtyItem++;
				if(qtyItem == MAX_NUMBERS_ITEM-1) System.out.println("Space for items in the store is almost full.");
				if(qtyItem == MAX_NUMBERS_ITEM) System.out.println("The store is run out of space for items.");
			}
			else System.out.println("Can't add the disc '" + dvdList[i].getTitle() + "' into the store. Space for items is already full!");
		}
	}
	public void removeDVD(DigitalVideoDisc disc) {
		int flag=0;
		for(int i=0; i<qtyItem; i++) {
			if (itemsInStore[i] == disc) {
				itemsInStore[i]= itemsInStore[qtyItem-1];
				qtyItem--;
				System.out.println("The disc '" + disc.getTitle()+ "' has been removed from the store.");
				flag++;
			}
		}
		if(flag==0) System.out.println("The disc '" + disc.getTitle() + "' isn't in the store.");
	}
	
	
	public void viewStore() {
		int n= qtyItem;
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemsInStore[j].getId() < itemsInStore[min_idx].getId())
	    			min_idx = j;
	    	TestPassingParameter.swap(itemsInStore[min_idx], itemsInStore[i]);
	    }
	    System.out.println("***********************STORE**********************");
		for(int i=0; i<n; i++) {
			System.out.println(itemsInStore[i].viewStore());
		}
		System.out.println("**************************************************");
	}
	
	public DigitalVideoDisc searchByID(int id) {
		int i=0;
		while(i<qtyItem) {
			if(itemsInStore[i].getId()==id) {
				itemsInStore[i].getDetail();
				return itemsInStore[i];
			}
			i++;
		}
		return null;

	}
}
