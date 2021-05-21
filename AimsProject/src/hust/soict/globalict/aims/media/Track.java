package hust.soict.globalict.aims.media;

import javax.swing.JOptionPane;

import hust.soict.globalict.aims.exception.PlayerException;

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
	public void play() throws PlayerException {
		if(this.getLength() > 0 ) {
			JOptionPane.showMessageDialog(null,"Playing Track: " + this.getTitle()+ "\nTrack length: " + this.getLength(), "Play Track", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			throw new PlayerException("ERROR: Track length is non-positive");
			//JOptionPane.showMessageDialog(null, "Track: " +this.getTitle()+ " can't be played! \nTrack's Length <=0.", "Play Track", JOptionPane.ERROR_MESSAGE);
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
		if (this.getTitle().compareTo(o.getTitle())==0) {
			if (this.getLength() > o.getLength()) return -1;
			else if (this.getLength() < o.getLength()) return 1;
			else return 0;
		}
		else{
			return this.getTitle().compareTo(o.getTitle());
		}
	}
}
