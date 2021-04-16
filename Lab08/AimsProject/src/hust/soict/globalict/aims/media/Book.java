package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Book extends Media implements Comparable<Book>{
	private List<String> authors = new ArrayList<String>();
	private String content;
	
	
	public List<String> getAuthors() {
		return authors;
	}
	public String getContent() {
		return content;
	}
	
	public void addAuthor(String authorName) {
		boolean flag=false;
		int i=0;
		while(i<authors.size()) {
			if(authors.get(i).equals(authorName)==true) {
				flag=true;
			}
			i++;
		}
		if(flag==false) {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		int flag=-1;
		int i=0;
		while(i<authors.size()) {
			if(authors.get(i).equals(authorName)==true) {
				flag=i;
			}
			i++;
		}
		if(flag!=-1) {
			authors.remove(flag);
		}
	}
	
	public Book(String title, String category, String content, float cost) {
		super(title, category, cost);
		this.content = content;
	}

	public Book(String title, String category, List<String> authors, String content, float cost, int id) {
		super(id, title, category, cost);
		this.authors = authors;
		this.content = content;
	}
	
	public String getDetail() {
		return ("ID:" + this.getId() + " - Book - " + this.getTitle()+ " - " + this.getCategory() + " - " +
				this.authors  + ": " + this.getCost() + "$");
	}
	
	public void seeDetail() {
		ArrayList<String> token = new ArrayList<String>();
		StringTokenizer word= new StringTokenizer(this.content.replaceAll("[,.?!]" , ""));
		int frequency[]=new int[word.countTokens()];
		for(int i=0; i<frequency.length; i++) {
			frequency[i]=1;
		}
		while (word.hasMoreTokens()) {
			String tmp=word.nextToken().toLowerCase();
			int flag=0;
			for(int i=0; i<token.size(); i++) {
				if(token.get(i).equals(tmp)){
					frequency[i]++;
					flag++;
					break;
				}
			}
			if(flag==0) {
				token.add(tmp);
			}
		}
		
		int n=token.size();
		int tmp;
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (token.get(j).compareTo(token.get(min_idx)) < 0)
	    			min_idx = j;
	    	Collections.swap(token, i, min_idx);
	    	tmp=frequency[i];
	    	frequency[i]=frequency[min_idx];
	    	frequency[min_idx]=tmp;
	    }
	    System.out.println(frequency.length);
		System.out.println("ID:" + this.getId() + " - Book - " + this.getTitle()+ " - " + this.getCategory() + " - " +
				this.authors  + " - Content length:" + token.size());
		System.out.println("Token|Frequency");
		for(int i=0; i<token.size(); i++) {
			System.out.println(token.get(i)+ " " + frequency[i]);
		}
	}
	
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if (this.getTitle().compareTo(o.getTitle()) < 0) return -1;
		else if (this.getTitle().compareTo(o.getTitle()) > 0) return 1;
		else{
			if (this.getCost() > o.getCost()) return -1;
			else if(this.getCost() < o.getCost()) return 1;
			else return 0;
		}
	}
}
