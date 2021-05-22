package hust.soict.globalict.aims.store;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	public int storeSize() {
		return itemsInStore.size();
	}
	public void addMedia(Media media) {
		itemsInStore.add(media);
		System.out.println("'" + media.getTitle() + "' has been added to the store.");
	}

	public void addMedia(Media... mediaList) {
		for(int i=0; i<mediaList.length; i++) {
			itemsInStore.add(mediaList[i]);
			System.out.println("'" + mediaList[i].getTitle() + "' has been added to the store.");
		}

}
	public void removeMedia(Media media) {
		int flag=0;
		for(int i=0; i<itemsInStore.size(); i++) {
			if (itemsInStore.get(i).equals(media)) {
				itemsInStore.remove(i);
				System.out.println("'" + media.getTitle()+ "' has been removed from the store.");
				flag++;
			}
		}
		if(flag==0) System.out.println("'" + media.getTitle() + "' isn't in the cart.");
	}

	public void viewStore() {
		int n= itemsInStore.size();
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemsInStore.get(j).getId() < itemsInStore.get(min_idx).getId())
	    			min_idx = j;
	    	Collections.swap(itemsInStore, i, min_idx);
	    }
	    System.out.println("***********************STORE**********************");
		for(int i=0; i<n; i++) {
			System.out.println(itemsInStore.get(i).getDetail());
		}
		System.out.println("**************************************************");
	}
	
	// for aims
	public Media searchByID(int id) {
		int i=0;
		while(i<itemsInStore.size()) {
			if(itemsInStore.get(i).getId()==id) {
				return itemsInStore.get(i);
			}
			i++;
		}
		return null;
	}
	
	public void playMedia(int id) {
		int flag =0;
		int i=0;
		while(i<itemsInStore.size() && flag==0) {
			if(itemsInStore.get(i).getId()==id) {
				if(itemsInStore.get(i) instanceof Book) {
					System.out.println("Can't play a book!");
				}
				else if(itemsInStore.get(i) instanceof DigitalVideoDisc) {
					DigitalVideoDisc disc = (DigitalVideoDisc)itemsInStore.get(i);
					try {
						disc.play();
					} catch (PlayerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if(itemsInStore.get(i) instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc)itemsInStore.get(i);
					try {
						cd.play();
					} catch (PlayerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else System.out.println("The media can't be played");
				flag=1;
			}
			i++;
		}
		if(flag==0) System.out.println("No match media with ID:"+id+" is found in the store!");
	}
	
}
