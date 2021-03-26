package hust.soict.globalict.aims.disc;
import java.time.LocalDate;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private LocalDate dateAdded;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	//Generate Getters and Setters
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	//Create a DVD object by title
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.dateAdded= LocalDate.now();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}

	//Create a DVD object by category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded= LocalDate.now();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	//Create a DVD object by director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.dateAdded= LocalDate.now();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
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
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	
	public String getDetail() {
		return ("DVD - " + this.title+ " - " + this.category + " - " +
				this.director + " - "+ this.length + ": " + this.cost + "$");
	}
}

