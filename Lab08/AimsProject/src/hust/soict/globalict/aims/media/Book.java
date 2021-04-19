package hust.soict.globalict.aims.media;

import java.util.*;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	private String content;
	List<String> contentTokens;
	Map<String,Integer> wordFrequency;
	
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
		this.processContent();
	}

	public Book(String title, String category, List<String> authors, String content, float cost, int id) {
		super(id, title, category, cost);
		this.authors = authors;
		this.content = content;
		this.processContent();
	}
	
	public String getDetail() {
		return ("ID:" + this.getId() + " - Book - " + this.getTitle()+ " - " + this.getCategory() + " - " +
				this.authors  + ": " + this.getCost() + "$");
	}
	
	public void seeDetail() {
		System.out.println("ID:" + this.getId() + " - Book - " + this.getTitle()+ " - " + this.getCategory() + " - " +
				this.authors  + " - Content length " + this.wordFrequency.size() + ": " + this.getCost() + "$");
		System.out.println("Token | Frequency");
		for (String key : wordFrequency.keySet()) {
			System.out.println(key + " - " + wordFrequency.get(key));
        }		
	}
	
	public void processContent() {
		String[] words = this.content.toLowerCase().replaceAll("[,.?!]" , "").split(" ");
		contentTokens = Arrays.asList(words);
		Collections.sort(contentTokens);
		wordFrequency = new TreeMap<>();
		for (String word : contentTokens) {
            Integer count = wordFrequency.get(word);
            if (count == null) {
                wordFrequency.put(word, 1);
            } else {
                wordFrequency.put(word, count + 1);
            }
        }
	}
	
	public String toString() {
		String output = "ID:" + this.getId() + " - Book - " + this.getTitle()+ " - " + this.getCategory() + " - " +
				this.authors  + " - Content length " + this.wordFrequency.size() + ": " + this.getCost() + "$" + "\n";
		output+= "Tokens frequency: \n";
		for (String key : wordFrequency.keySet()) {
            output+= key + " - " + wordFrequency.get(key) + "\n";
        }		
		return output;
	}
	
}
