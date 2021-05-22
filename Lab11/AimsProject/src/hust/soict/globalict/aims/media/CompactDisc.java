package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;
import java.util.ArrayList;
import java.util.Iterator;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	public int getLength() {
		int length=0;
		for(int i=0; i<tracks.size(); i++) {
			length+=tracks.get(i).getLength();
		}
		return length;
	}
	
	public CompactDisc(String title, String category, String artist, String director, float cost) {
		super(title, category, cost, director);
		this.artist = artist;
	}
	
	public CompactDisc(String title, String category, String artist, String director, ArrayList<Track> tracks, float cost, int id) {
		super(id, title, category, cost, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public void addTrack(Track track) {
		boolean flag=false;
		int i=0;
		while(i<tracks.size()) {
			if(tracks.get(i).equals(track)) {
				flag=true;
			}
			i++;
		}
		if(flag==false) {
			tracks.add(track);
			System.out.println("Track '" + track.getTitle() +"' has been added to the CD '" + this.getTitle() +"'");
		}
		else System.out.println("Track '" + track.getTitle() +"' has already existed in the CD '"+ this.getTitle()+"'");
	}
	public void removeTrack(Track track) {
		int flag=-1;
		int i=0;
		while(i<tracks.size()) {
			if(tracks.get(i).equals(track)) {
				flag=i;
			}
			i++;
		}
		if(flag!=-1) {
			tracks.remove(flag);
			System.out.println("Track '" + track.getTitle() +"' has been removed from the CD '" + this.getTitle() + "'");
		}
		else System.out.println("Track '" + track.getTitle() + "' not exist in the CD '" + this.getTitle() + "'");
	}
	
	public String getDetail() {
		return ("ID:" + this.getId() + " - CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.artist + " - " + this.getDirector() + " - "+ this.getLength() + ": " + this.getCost() + "$");
	}
	public void seeDetail() {
		System.out.println("ID:" + this.getId() + " - CD - " + this.getTitle()+ " - " + this.getCategory() + " - " + this.artist + " - " + this.getDirector() + " - "+ this.getLength() + ": " + this.getCost() + "$");
		System.out.println("List of tracks: ");
		for(int i=0; i<tracks.size(); i++) 
			System.out.println("Track " + (i+1) + ": " + tracks.get(i).getDetail());
	}
	
	public void play() throws PlayerException {
		if(getLength() > 0 ) {
			Iterator<Track> iter = tracks.iterator();
			//JOptionPane.showMessageDialog(null,"Playing CD: " + this.getTitle()+ "\nCD length: " + this.getLength(), "Play CD", JOptionPane.INFORMATION_MESSAGE);
			Track nextTrack;
			while(iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				} catch (PlayerException e) {
					e.printStackTrace();
					//throw e;
				}
			}

		}
		else {
			throw new PlayerException("ERROR: CD length is non-positive");
			//JOptionPane.showMessageDialog(null, "CD: " +this.getTitle()+ " can't be played! \nCD's Length <= 0.", "Play CD", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
