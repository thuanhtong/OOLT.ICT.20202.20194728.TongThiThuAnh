package hust.soict.globalict.aims.media;

public class Track implements Playable, Comparable<Track>{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}

	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public String getDetail() {
		return (this.title + " - " + this.length);
	}
	public void play() {
		if(this.getLength() <=0 )
			System.out.println("Track: " +this.getTitle()+ " can't be played! Track's Length <=0.");
		else {
			System.out.println("Playing Track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
		}
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof  Track) {
			Track tmp= (Track)obj;
			return (this.getTitle().equals(tmp.getTitle())==true && this.getLength()==tmp.getLength());
		}
		else return false;
	}
	
	@Override
	public int compareTo(Track o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
