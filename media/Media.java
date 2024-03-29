package hust.soict.globalict.aims.media;

import java.time.LocalDate;
import java.util.StringTokenizer;

public class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	protected LocalDate dateAdded;
	protected static int nbMedias = 0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public LocalDate getDateAdded() {
		return dateAdded;
	}
	public static int getNbMedias() {
		return nbMedias;
	}
	
	public String getDetail() {
		return ("ID:" + this.id + " - " + this.title+ " - " + this.category + " - " + ": " + this.cost + "$");
	}
	
	public void seeDetail() {
		System.out.println("ID:" + this.id + " - " + this.title+ " - " + this.category + " - " + ": " + this.cost + "$");
	}
	
	public boolean search(String title){
		int n=title.length();
		if (n==0) return true;
		if(this.title.toLowerCase().contains(title.toLowerCase())) return true;
		else{
			StringTokenizer stk= new StringTokenizer(title);
			while (stk.hasMoreTokens()) {
				if(this.title.toLowerCase().contains(stk.nextToken().toLowerCase())) return true;
	        }
		}
		return false;
	}
	
}
