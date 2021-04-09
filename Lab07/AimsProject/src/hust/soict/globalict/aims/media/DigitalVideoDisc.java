package hust.soict.globalict.aims.media;


public class DigitalVideoDisc extends Disc implements Playable {

	//Generate Getters and Setters
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director, length);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost, int id) {
		super(id, title, category, cost, director, length);
	}
	
	public String getDetail() {
		return ("ID:" + this.id + " - DVD - " + this.title+ " - " + this.category + " - " +
				this.director + " - "+ this.length + ": " + this.cost + "$");
	}
	public void seeDetail() {
		System.out.println("ID:" + this.id + " - DVD - " + this.title+ " - " + this.category + " - " +
				this.director + " - "+ this.length + ": " + this.cost + "$");
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}

