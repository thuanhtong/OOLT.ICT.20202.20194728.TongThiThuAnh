
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String directory;
	private int length;
	private float cost;
	
	//Generate Getters and Setters
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirectory() {
		return directory;
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
	//Create a DVD object by category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	//Create a DVD object by director, category, title and cost
	public DigitalVideoDisc(String title, String category, String directory, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.cost = cost;
	}
	//Create a DVD object by all attributes: title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.length = length;
		this.cost = cost;
	}

}
