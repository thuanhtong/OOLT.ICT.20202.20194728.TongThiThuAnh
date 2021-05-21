package hust.soict.globalict.aims.media;

public class Disc extends Media{
	private String director;
	private int length;
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	//DVD
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public Disc(String title, String category, float cost, String director, int length) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	public Disc(int id,String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}
	//CD
	public Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		this.director = director;
	}
	public Disc(int id, String title, String category, float cost, String director) {
		super(id, title, category, cost);
		this.director = director;
	}


}
