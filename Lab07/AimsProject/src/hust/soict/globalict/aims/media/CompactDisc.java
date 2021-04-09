package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}

	public CompactDisc(String title, String category, float cost, String director, int length, String artist,
			ArrayList<Track> tracks) {
		super(title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}
	public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist,
			ArrayList<Track> tracks) {
		super(id, title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}

	public void addAuthor(Track track) {
		boolean flag=false;
		int i=0;
		while(i<tracks.size()) {
			if(tracks.get(i).equals(track)==true) {
				flag=true;
			}
			i++;
		}
		if(flag==false) {
			tracks.add(track);
			System.out.println("Track has been added to the CD");
		}
		else System.out.println("Track've already existed in the CD");
	}
	
	public void removeAuthor(Track track) {
		int flag=-1;
		int i=0;
		while(i<tracks.size()) {
			if(tracks.get(i).equals(track)==true) {
				flag=i;
			}
			i++;
		}
		if(flag!=-1) {
			tracks.remove(flag);
			System.out.println("Track has been removed from the CD");
		}
		else System.out.println("Track not exist in the CD");
	}

	public int getLength() {
		int length=0;
		for(int i=0; i<tracks.size(); i++) {
			length+=tracks.get(i).getLength();
		}
		return length;
	}
	
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		for(int i=0; i<tracks.size(); i++) {
			tracks.get(i).play();
		}
	}


	

}
