package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.disc.TestPassingParameter;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED =20;
	
	private DigitalVideoDisc itemOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered=0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered <20) {
			itemOrdered[qtyOrdered]= disc;
			System.out.println("The disc '" + disc.getTitle() + "' has been added.");
			qtyOrdered++;
			if(qtyOrdered == 19) System.out.println("The cart is almost full.");
			if(qtyOrdered == 20) System.out.println("The cart is full.");
		}
		else System.out.println("Can't add the disc '" + disc.getTitle() + "' into the cart. The cart is already full!");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int i=0;
		while(dvdList[i]!=null){
			if(qtyOrdered <20) {
				itemOrdered[qtyOrdered]= dvdList[i];
				System.out.println("The disc '" + dvdList[i].getTitle() + "' has been added.");
				qtyOrdered++;
				if(qtyOrdered == 19) System.out.println("The cart is almost full.");
				if(qtyOrdered == 20) System.out.println("The cart is full.");
			}
			else System.out.println("Can't add the disc '" + dvdList[i].getTitle() + "' into the cart. The cart is already full!");
			i++;
		}
	}
/*	
//	Method allowing to pass an arbitrary number of arguments for dvd.
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for(int i=0; i<dvdList.length; i++) {
			if(qtyOrdered <20) {
				itemOrdered[qtyOrdered]= dvdList[i];
				System.out.println("The disc '" + dvdList[i].getTitle() + "' has been added.");
				qtyOrdered++;
				if(qtyOrdered == 19) System.out.println("The cart is almost full.");
				if(qtyOrdered == 20) System.out.println("The cart is full.");
			}
			else System.out.println("Can't add the disc '" + dvdList[i].getTitle() + "' into the cart. The cart is already full!");
		}
	}
*/	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int flag=0;
		for(int i=0; i<qtyOrdered; i++) {
			if (itemOrdered[i] == disc) {
				itemOrdered[i]= itemOrdered[qtyOrdered-1];
				qtyOrdered--;
				System.out.println("The disc '" + disc.getTitle()+ "' has been removed from the cart.");
				flag++;
			}
		}
		if(flag==0) System.out.println("The disc '" + disc.getTitle() + "' isn't in the cart.");
	}
	
	public float totalCost() {
		float sumCost=0;
		for(int i=0; i<qtyOrdered; i++) {
			sumCost+= itemOrdered[i].getCost();
		}
		return sumCost;
	}
	
	public void sortByCost() {
		int n= qtyOrdered;
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemOrdered[j].getCost() > itemOrdered[min_idx].getCost())
	    			min_idx = j;
	    	TestPassingParameter.swap(itemOrdered[min_idx], itemOrdered[i]);
	    }
		System.out.println("Sort by cost: ");
		for(int i=0; i<n; i++) {
			System.out.println(i+1+ ". " + itemOrdered[i].getDetail());
		}
	}
	
	public void sortByTitle() {
		int n= qtyOrdered;
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemOrdered[j].getTitle().compareTo(itemOrdered[min_idx].getTitle()) < 0)
	    			min_idx = j;
	    	TestPassingParameter.swap(itemOrdered[min_idx], itemOrdered[i]);
	    }
		System.out.println("Sort by Title: ");
		for(int i=0; i<n; i++) {
			System.out.println(i+1 +". "+ itemOrdered[i].getDetail());
		}
	}
	
	public void searchByID(int id) {
		int flag =0;
		int i=0;
		while(i<qtyOrdered && flag==0) {
			if(itemOrdered[i].getId()==id) {
				System.out.println("A match DVD is found: ");
				System.out.println(itemOrdered[i].getDetail());
				flag=1;
			}
			i++;
		}
		if(flag==0) System.out.println("No match DVD with ID:"+id+" is found");
	}
	
	public void printList() {
		int n= qtyOrdered;
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemOrdered[j].getTitle().compareTo(itemOrdered[min_idx].getTitle()) < 0)
	    			min_idx = j;
	    		else if (itemOrdered[j].getTitle().compareTo(itemOrdered[min_idx].getTitle()) == 0) {
	    			if (itemOrdered[j].getCost() > itemOrdered[min_idx].getCost()) 
	    				min_idx = j;
	    			else if (itemOrdered[j].getCost() == itemOrdered[min_idx].getCost()) {
	    				if (itemOrdered[j].getLength() > itemOrdered[min_idx].getLength()) 
		    				min_idx = j;
	    			}
	    		}
	    	TestPassingParameter.swap(itemOrdered[min_idx], itemOrdered[i]);
	    }
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for(int i=0; i<n; i++) {
			System.out.println(i+1 + ". " + itemOrdered[i].getDetail());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("**************************************************");
	}
}

