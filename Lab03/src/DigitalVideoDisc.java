
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
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
	
	//Create a DVD object by title
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
//	public DigitalVideoDisc(String category) {
//		super();
//		this.category = category;
//	}
	
	//Question: If you create a constructor method to build a DVD by title then create a constructor
	//method to build a DVD by category. Does JAVA allow you to do this?
	//Answer: JAVA doesn't allow us to do this, it will report an error of Duplicate method of 
	//DigitalVideoDisc(String) in type DigitalVideoDisc. Because both Title and Category are String field,
	//if we call DigitalVideoDisc("A_String") for a string, the program can't distinguish whether 
	//the string is a name or a category.

	//Create a DVD object by category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	//Create a DVD object by director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	//Create a DVD object by all attributes: title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

}

