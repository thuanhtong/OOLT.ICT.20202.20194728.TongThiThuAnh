package hust.soict.globalict.aims.media;

import java.time.LocalDate;

public class DigitalVideoDisc extends Media {

	private String director;
	private int length;
	//Generate Getters and Setters

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//Create a DVD object by title
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.dateAdded= LocalDate.now();
		nbMedias++;
		this.id = nbMedias;
	}

	//Create a DVD object by category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded= LocalDate.now();
		nbMedias++;
		this.id = nbMedias;
	}
	//Create a DVD object by director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.dateAdded= LocalDate.now();
		nbMedias++;
		this.id = nbMedias;
	}
	//Create a DVD object by all attributes: title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.dateAdded= LocalDate.now();
		nbMedias++;
		this.id = nbMedias;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost, int id) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.dateAdded= LocalDate.now();
		this.id = id;
	}

	public String getDetail() {
		return ("ID:" + this.id + " - DVD - " + this.title+ " - " + this.category + " - " +
				this.director + " - "+ this.length + ": " + this.cost + "$");
	}
	
	public void seeDetail() {
		System.out.println("ID:" + this.id + " - DVD - " + this.title+ " - " + this.category + " - " +
				this.director + " - "+ this.length + ": " + this.cost + "$");
	}

}

