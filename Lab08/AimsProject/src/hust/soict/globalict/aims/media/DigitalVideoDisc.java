package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

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
		return ("ID:" + this.getId() + " - DVD - " + this.getTitle()+ " - " + this.getCategory() + " - " +
				this.getDirector() + " - "+ this.getLength() + ": " + this.getCost() + "$");
	}
	public void seeDetail() {
		System.out.println("ID:" + this.getId() + " - DVD - " + this.getTitle()+ " - " + this.getCategory() + " - " +
				this.getDirector() + " - "+ this.getLength() + ": " + this.getCost() + "$");
	}
	
	@Override
	public void play() {
		if(this.getLength() <=0 )
			System.out.println("DVD: " +this.getTitle()+ " can't be played! DVD's Length <=0.");
		else {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
	}

}

