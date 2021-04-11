package hust.soict.globalict.aims.media;

import java.time.LocalDate;
import java.util.StringTokenizer;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	
	private LocalDate dateAdded;
	private static int nbMedias = 0;
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}
	public static int getNbMedias() {
		return nbMedias;
	}
	
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded = LocalDate.now();
		nbMedias++;
		this.id = nbMedias;
	}
	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded = LocalDate.now();
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
