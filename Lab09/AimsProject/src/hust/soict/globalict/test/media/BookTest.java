package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.Book;

public class BookTest {
	public static void main(String[] args) {

		Book book1= new Book("To Kill a Mockingbird", "Classic Novel", "A jarring & poignantly beautiful story about how humans treat each other.", 6.35f);
		book1.addAuthor("Harper Lee");
		
		Book book2= new Book("The Great Gatsby", "Classic Novel", "The greatest, most scathing dissection of the hollowness at the heart of the American dream. Hypnotic, tragic, both of its time and completely relevant.", 5.5f);
		book2.addAuthor("F. Scott Fitzgerald");
		
		Book book3= new Book("Pride and Prejudice", "Classic Novel", "Philosophy, history, wit, and the most passionate love story.", 6.3f);
		book3.addAuthor("Jane Austen");
		
		Book book4= new Book("I can the can", "Book", "I can. !can the can, but the, can ?cannot can me", 3.3f);
		book4.addAuthor("Me");
		book4.addAuthor("The can");
		
		book4.seeDetail();
		
		System.out.println("-----------------------------------");
		System.out.print(book1.toString());
		System.out.println("-----------------------------------");
		System.out.print(book4.toString());
	}
}
