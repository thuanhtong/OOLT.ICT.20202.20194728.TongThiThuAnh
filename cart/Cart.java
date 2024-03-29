package hust.soict.globalict.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import hust.soict.globalict.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED =20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>(20);
	
	
	public void addMedia(Media media) {
		if(itemsOrdered.size() <MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(media);
			System.out.println("'" + media.getTitle() + "' has been added to the cart.");
			if(itemsOrdered.size() == 19) System.out.println("The cart is almost full.");
			if(itemsOrdered.size() == 20) System.out.println("The cart is full.");
		}
		else System.out.println("Can't add '" + media.getTitle() + "' into the cart. The cart is already full!");
	}
	
	public void addMedia(Media... mediaList) {
	for(int i=0; i<mediaList.length; i++) {
		if(itemsOrdered.size() <MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(mediaList[i]);
			System.out.println("'" + mediaList[i].getTitle() + "' has been added to the cart.");
			if(itemsOrdered.size() == 19) System.out.println("The cart is almost full.");
			if(itemsOrdered.size() == 20) System.out.println("The cart is full.");
		}
		else System.out.println("Can't add '" + mediaList[i].getTitle() + "' into the cart. The cart is already full!");
		}
	}
	
	public void removeMedia(Media media) {
	int flag=0;
	for(int i=0; i<itemsOrdered.size(); i++) {
		if (itemsOrdered.get(i).equals(media)) {
			itemsOrdered.remove(i);
			System.out.println("'" + media.getTitle()+ "' has been removed from the cart.");
			flag++;
		}
	}
	if(flag==0) System.out.println("'" + media.getTitle() + "' isn't in the cart.");
	}
	
	
	public float totalCost() {
		float sumCost=0;
		for(int i=0; i<itemsOrdered.size(); i++) {
			sumCost+= itemsOrdered.get(i).getCost();
		}
		return sumCost;
	}

	public void sortByCost() {
		int n= itemsOrdered.size();
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemsOrdered.get(j).getCost() > itemsOrdered.get(min_idx).getCost())
	    			min_idx = j;
	    		else if (itemsOrdered.get(j).getCost() == itemsOrdered.get(min_idx).getCost()) {
	    			if (itemsOrdered.get(j).getTitle().compareTo(itemsOrdered.get(min_idx).getTitle()) < 0)
		    			min_idx = j;
	    		}
	    	Collections.swap(itemsOrdered, i, min_idx);
	    }
		System.out.println("Sort by cost: ");
		for(int i=0; i<n; i++) {
			System.out.println(i+1+ ". " + itemsOrdered.get(i).getDetail());
		}
	}
	
	public void sortByTitle() {
		int n= itemsOrdered.size();
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemsOrdered.get(j).getTitle().compareTo(itemsOrdered.get(min_idx).getTitle()) < 0)
	    			min_idx = j;
	    		else if (itemsOrdered.get(j).getTitle().compareTo(itemsOrdered.get(min_idx).getTitle()) == 0) {
	    			if (itemsOrdered.get(j).getCost() > itemsOrdered.get(min_idx).getCost()) 
	    				min_idx = j;
	    		}
	    	Collections.swap(itemsOrdered, i, min_idx);
	    }
		System.out.println("Sort by Title: ");
		for(int i=0; i<n; i++) {
			System.out.println(i+1 +". "+ itemsOrdered.get(i).getDetail());
		}
	}
	
	public void searchByID(int id) {
		int flag =0;
		int i=0;
		while(i<itemsOrdered.size() && flag==0) {
			if(itemsOrdered.get(i).getId()==id) {
				System.out.println("A match media is found: ");
				System.out.println(itemsOrdered.get(i).getDetail());
				flag=1;
			}
			i++;
		}
		if(flag==0) System.out.println("No match media with ID:"+id+" is found");
	}
	
	public void printList() {
		int n= itemsOrdered.size();
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemsOrdered.get(j).getTitle().compareTo(itemsOrdered.get(min_idx).getTitle()) < 0)
	    			min_idx = j;
	    		else if (itemsOrdered.get(j).getTitle().compareTo(itemsOrdered.get(min_idx).getTitle()) == 0) {
	    			if (itemsOrdered.get(j).getCost() > itemsOrdered.get(min_idx).getCost()) 
	    				min_idx = j;
	    		}
	    	Collections.swap(itemsOrdered, i, min_idx);
	    }
	    
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for(int i=0; i<n; i++) {
			System.out.println(i+1 + ". " + itemsOrdered.get(i).getDetail());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("**************************************************");
	}
	
	public void searchByTitle(String title) {
		int flag =0;
		int i=0;
		System.out.println("-Search for title '" +title+"':");
		while(i<itemsOrdered.size()) {
			if(itemsOrdered.get(i).search(title)==true) {
				System.out.println(itemsOrdered.get(i).getDetail());
				flag++;
			}
			i++;
		}
		if(flag==0) System.out.println("No match media is found");
	}
	
	public Media getALuckyItem() {
		int rand = (int)(Math.random() * itemsOrdered.size());
		String title=itemsOrdered.get(rand).getTitle();
		itemsOrdered.get(rand).setTitle(title + "(free)");
		itemsOrdered.get(rand).setCost(0f);
		return itemsOrdered.get(rand);
	}
	
	//for aims
	public void removeByID(int id) {
		int flag =0;
		int i=0;
		while(i<itemsOrdered.size() && flag==0) {
			if(itemsOrdered.get(i).getId()==id) {
				removeMedia(itemsOrdered.get(i));
				flag=1;
			}
			i++;
		}
		if(flag==0) System.out.println("No match media with ID:"+id+" is found in the cart");
	}
	
	public void emptyCart() {
		if(itemsOrdered.size()>0) {
			while(itemsOrdered.size()!=0) {
				removeMedia(itemsOrdered.get(0));
			}
			System.out.println("An order is created");
		}
		else System.out.println("Can't create order. The cart is empty!");
	}
	
	// check whether a disc in cart by id
	public int checkId(int id) {
		int flag=0;
		int i=0;
		while(i<itemsOrdered.size()) {
			if(itemsOrdered.get(i).getId()==id) {
				flag++;
			}
			i++;
		}
		return flag;
	}

	public void getFreeItem() {
		int flag=0;
		for(int i=0; i<itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i).getCost()==0.0f) flag=1;
		}
		if(itemsOrdered.size()>1) {
			if(flag==0) {
				System.out.println("Get lucky item: ");
				System.out.println(getALuckyItem().getDetail());
				flag=1;
			}
			else System.out.println("You already has a lucky item in the cart");
		}
		else System.out.println("Can't get a lucky item. The quantity of items in cart is too small!");
	}
	

}

