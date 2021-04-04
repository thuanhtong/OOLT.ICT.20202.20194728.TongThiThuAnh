package hust.soict.globalict.aims;

import java.util.Scanner;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.media.*;
public class Aims {
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Get a lucky item from cart");
		System.out.println("5. Place order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");

		}
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		Store anItem = new Store();
		// Create new dvd objects and add them to the store
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.9f);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Harry Potter and the Philosopher's Stone", "Fantasy", "Chris Columbus", 150, 20.2f);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", "David Yates", 175 , 26.5f);
		DigitalVideoDisc dvd6= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", "David Yates", 147 , 24.5f);
		DigitalVideoDisc dvd7= new DigitalVideoDisc("Avatar", "Science Fiction", 20.6f);
		DigitalVideoDisc dvd8= new DigitalVideoDisc("Titanic", "Romantic", 16.5f);
		DigitalVideoDisc dvd9= new DigitalVideoDisc("Avengers: Endgame", "Science Fiction", 27.55f);
		Media dvd10= new DigitalVideoDisc("Avengers: Infinity War", "Science Fiction", 26.5f);
		DigitalVideoDisc dvd11= new DigitalVideoDisc("Avengers: Age of Ultron", "Science Fiction", 26.5f);
		DigitalVideoDisc dvd12= new DigitalVideoDisc("Avengers 1", "Science Fiction", 26.5f);
		DigitalVideoDisc dvd13= new DigitalVideoDisc("Captain America: The First Avenger", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd14= new DigitalVideoDisc("Captain America: The Winter Soldier", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd15= new DigitalVideoDisc("Captain America: Civil War", "Science Fiction", 26.0f);
		DigitalVideoDisc dvd16= new DigitalVideoDisc("Iron man 1", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd17= new DigitalVideoDisc("Iron man 2", "Science Fiction", 25.0f);
		DigitalVideoDisc dvd18= new DigitalVideoDisc("Iron man 3", "Science Fiction", 25.5f);
		DigitalVideoDisc dvd19= new DigitalVideoDisc("Iron man 4", "Science Fiction", 26.0f);
		DigitalVideoDisc dvd20= new DigitalVideoDisc("Doctor Strange", "Science Fiction", 26.0f);
		DigitalVideoDisc dvd21= new DigitalVideoDisc("Guadians of the Galaxy 1", "Science Fiction", 24.8f);
		anItem.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, dvd10, dvd11, dvd12, dvd13, dvd14, dvd15, dvd16, dvd17, dvd18, dvd19, dvd20, dvd21);
		
		// Create new book objects and add them to the store
		Book book1= new Book("To Kill a Mockingbird", "Classic Novel", "A jarring & poignantly beautiful story about how humans treat each other.", 6.35f);
		book1.addAuthor("Harper Lee");
		Book book2= new Book("The Great Gatsby", "Classic Novel", "The greatest, most scathing dissection of the hollowness at the heart of the American dream. Hypnotic, tragic, both of its time and completely relevant.", 5.5f);
		book2.addAuthor("F. Scott Fitzgerald");
		Book book3= new Book("Pride and Prejudice", "Classic Novel", "Philosophy, history, wit, and the most passionate love story.", 6.3f);
		book3.addAuthor("Jane Austen");
		Book book4= new Book("Doraemon 1", "Comic", "Doraemon, a cat robot from the 22nd century", 4.25f);
		book4.addAuthor("Fujiko Fujio");
		Book book5= new Book("Doraemon 2", "Comic", "Doraemon is sent to help Nobita Nobi, a young boy who receives poor grades and is frequently bullied by his two classmates", 4.30f);
		book5.addAuthor("Fujiko Fujio");
		Book book6= new Book("Doraemon 3", "Comic", "Nobita Nobi and Doraemon end up developing a strong bond with each other.", 4.45f);
		book6.addAuthor("Fujiko Fujio");
		Book book7= new Book("Doraemon 4", "Comic", "Doraemon is sent to take care of Nobita by Sewashi Nobi, Nobita's future grandson, so that his descendants can get a better life", 4.15f);
		book7.addAuthor("Fujiko Fujio");
		Book book8= new Book("Doraemon 5", "Comic", "Doraemon has a four-dimensional pouch in which he stores unexpected gadgets he uses to help Nobita", 4.15f);
		book8.addAuthor("Fujiko Fujio");
		Book book9= new Book("Doraemon 6", "Comic", "His most important gadgets include- Bamboo-Copter, a small piece of headgear that can allow its users to fly", 4.05f);
		book9.addAuthor("Fujiko Fujio");
		Book book10= new Book("Doraemon 7", "Comic", "Anywhere Door, a pink-colored door that allows people to travel according to the thoughts of the person who turns the knob", 4.25f);
		book10.addAuthor("Fujiko Fujio");
		Book book11= new Book("Doraemon 8", "Comic", "Time Kerchief, a handkerchief that can turn an object new or old or a person young or old", 4.15f);
		book11.addAuthor("Fujiko Fujio");
		Book book12= new Book("Doraemon 9", "Comic", "Translator Tool, a cuboid jelly that can allow people to converse in any language across the universe", 4.55f);
		book12.addAuthor("Fujiko Fujio");
		Book book13= new Book("The Lord of the Rings: The Fellowship of the Ring", "Fantasy Novel", "At 33, the age of adulthood among hobbits, Frodo Baggins receives a magic Ring of Invisibility from his uncle Bilbo", 6.4f);
		book13.addAuthor("J. R. R. Tolkien");
		Book book14= new Book("The Lord of the Rings: The Two Towers", "Fantasy Novel", "Frodo, a Christlike figure, learns that the ring has the power to control the entire world and, he discovers, to corrupt its owner", 6.65f);
		book14.addAuthor("J. R. R. Tolkien");
		Book book15= new Book("The Lord of the Rings: The Return of the King", "Fantasy Novel", "A fellowship of hobbits, elves, dwarfs, and men is formed to destroy the ring by casting it into the volcanic fires of the Crack of Doom, where it was forged", 6.6f);
		book15.addAuthor("J. R. R. Tolkien");
		Book book16= new Book("The Hobbit", "Fantasy Novel", "They are opposed on their harrowing mission by the evil Sauron and his Black Riders.", 6.5f);
		book16.addAuthor("J. R. R. Tolkien");
		anItem.addMedia(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15, book16);
		
		Media tmp;
		DigitalVideoDisc disc;
		Book book;
		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			int show;
			do {
				System.out.println("--------------------------------------------------------");
				showMenu();
				System.out.print("Your choice: ");
				show = sc.nextInt();
				switch(show) {
					case 0: 
						break;
					case 1:
						int store;
						do {
							System.out.println("--------------------------------------------------------");
							anItem.viewStore();
							storeMenu();
							System.out.print("Your choice: ");
							store = sc.nextInt();
							switch(store) {
							case 0:
								break;
							case 1:
								System.out.print("Enter media's ID to see details: ");
								int id = sc.nextInt();
								tmp = anItem.searchByID(id);
								if (tmp!=null) {
									tmp.seeDetail();
									System.out.println("Do you want to add the Media to the cart?");
									System.out.println("1. Yes");
									System.out.println("2. No");
									System.out.print("Your choice: ");
									choice = sc.nextInt();
									if(choice ==1) 
										if(tmp instanceof DigitalVideoDisc) {
											disc=(DigitalVideoDisc)tmp;
											anOrder.addMedia(new DigitalVideoDisc(disc.getTitle(), disc.getCategory(),disc.getDirector(),
												disc.getLength(), disc.getCost(), disc.getId()));
										}
										else if(tmp instanceof Book) {
											book=(Book)tmp;
											anOrder.addMedia(new Book(book.getTitle(), book.getCategory(), book.getAuthors(),
													book.getContent(), book.getCost(), book.getId()));
										}
									else if(choice ==2) System.out.println();
									else System.out.println("Wrong functionality!");
								}
								else System.out.println("No match DVD with ID:"+id+" is found");
								break;
							case 2:
								System.out.print("Enter DVD's ID you want to add to the cart: ");
								id = sc.nextInt();
								tmp = anItem.searchByID(id);
								if(tmp!=null) 
									if(tmp instanceof DigitalVideoDisc) {
										disc=(DigitalVideoDisc)tmp;
										anOrder.addMedia(new DigitalVideoDisc(disc.getTitle(), disc.getCategory(),disc.getDirector(),
											disc.getLength(), disc.getCost(), disc.getId()));
									}
									else if(tmp instanceof Book) {
										book=(Book)tmp;
										anOrder.addMedia(new Book(book.getTitle(), book.getCategory(), book.getAuthors(),
												book.getContent(), book.getCost(), book.getId()));
									}
								else System.out.println("No match DVD with ID:"+id+" is found");
								break;
							case 3:
								int cart;
								do {
									System.out.println("--------------------------------------------------------");
									anOrder.printList();
									cartMenu();
									System.out.print("Your choice: ");
									cart = sc.nextInt();
									switch(cart) {
									case 0:
										break;
									case 1:
										System.out.println("FILTER MEDIA IN CART: ");
										System.out.println("1. By ID");
										System.out.println("2. By Title");
										System.out.print("Your choice: ");
										choice = sc.nextInt();
										if(choice ==1) {
											System.out.print("Enter Media's ID: ");
											id = sc.nextInt();
											anOrder.searchByID(id);
										}
										else if(choice ==2) {
											System.out.print("Enter Media's title: ");
											sc.nextLine();
											String title = sc.nextLine();
											anOrder.searchByTitle(title);
										}
										else System.out.println("Wrong functionality!");
										break;
									case 2:
										System.out.println("SORT MEDIA IN CART: ");
										System.out.println("1. By Title");
										System.out.println("2. By Cost");
										System.out.print("Your choice: ");
										choice = sc.nextInt();
										if(choice ==1) {
											anOrder.sortByTitle();
										}
										else if(choice ==2) {
											anOrder.sortByCost();
										}
										else System.out.println("Wrong functionality!");
										break;
									case 3:
										System.out.print("Enter Media's ID to remove from cart: ");
										id = sc.nextInt();
										anOrder.removeByID(id);
										break;
									case 4:
										anOrder.getFreeItem();
										break;
									case 5:
										anOrder.emptyCart();
										break;
									default:
										System.out.println("Wrong functionality! Please choose again.\n");
										break;
									}
								}while(cart!=0);
								break;
							default:
								System.out.println("Wrong functionality! Please choose again.\n");
								break;
							}
						}while(store!=0);
						break;
					case 2:
						System.out.println("--------------------------------------------------------");
						anItem.viewStore();
						System.out.println("UPDATE STORE: ");
						System.out.println("1. Add Media");
						System.out.println("2. Remove Media");
						System.out.print("Your choice: ");
						choice = sc.nextInt();
						if(choice ==1) {
							System.out.println("1. Add DVD");
							System.out.println("2. Add Book");
							System.out.print("Your choice: ");
							int addChoice = sc.nextInt();
							if(addChoice ==1) {
								sc.nextLine();
								System.out.print("Enter Title: ");
								String title =sc.nextLine();
								System.out.print("Enter Category: ");
								String category=sc.nextLine();
								System.out.print("Enter Director: ");
								String director=sc.nextLine();
								System.out.print("Enter Length: ");
								int length=sc.nextInt();
								System.out.print("Enter Cost: ");
								float cost=sc.nextFloat();
								anItem.addMedia(new DigitalVideoDisc(title, category, director, length, (float)cost));
							}
							else if(addChoice ==2) {
								sc.nextLine();
								System.out.print("Enter Title: ");
								String title =sc.nextLine();
								System.out.print("Enter Category: ");
								String category=sc.nextLine();
								System.out.print("Enter Author: ");
								String Author=sc.nextLine();
								System.out.print("Enter Content: ");
								String content=sc.nextLine();
								System.out.print("Enter Cost: ");
								float cost=sc.nextFloat();
								book= new Book(title, category, content, (float)cost);
								book.addAuthor(Author);
								anItem.addMedia(book);
							}
							else System.out.println("Wrong functionality!");
							
						}
						else if(choice==2) {
							System.out.print("Enter Media's ID to remove from store: ");
							int id = sc.nextInt();
							tmp = anItem.searchByID(id);
							anItem.removeMedia(tmp);
							//remove dvd which has been removed from store from cart
							int flag=anOrder.checkId(id);
							while(flag>0) {
								anOrder.removeByID(id);
								flag--;
							}
						}
						else System.out.println("Wrong functionality!");
						break;
					case 3:
						int cart;
						do {
							System.out.println("--------------------------------------------------------");
							anOrder.printList();
							cartMenu();
							System.out.print("Your choice: ");
							cart = sc.nextInt();
							switch(cart) {
							case 0:
								break;
							case 1:
								System.out.println("FILTER MEDIA IN CART: ");
								System.out.println("1. By ID");
								System.out.println("2. By Title");
								System.out.print("Your choice: ");
								choice = sc.nextInt();
								if(choice ==1) {
									System.out.print("Enter Media's ID: ");
									int id = sc.nextInt();
									anOrder.searchByID(id);
								}
								else if(choice ==2) {
									System.out.print("Enter Media's title: ");
									sc.nextLine();
									String title = sc.nextLine();
									anOrder.searchByTitle(title);
								}
								else System.out.println("Wrong functionality!");
								break;
							case 2:
								System.out.println("SORT MEDIA IN CART: ");
								System.out.println("1. By Title");
								System.out.println("2. By Cost");
								System.out.print("Your choice: ");
								choice = sc.nextInt();
								if(choice ==1) {
									anOrder.sortByTitle();
								}
								else if(choice ==2) {
									anOrder.sortByCost();
								}
								else System.out.println("Wrong functionality!");
								break;
							case 3:
								System.out.print("Enter Media's ID to remove from cart: ");
								int id = sc.nextInt();
								anOrder.removeByID(id);
								break;
							case 4:
								anOrder.getFreeItem();
								break;
							case 5:
								anOrder.emptyCart();
								break;
							default:
								System.out.println("Wrong functionality! Please choose again.\n");
								break;
							}
						}while(cart!=0);
						break;
					default:
						System.out.println("Wrong functionality! Please choose again.\n");
						break;
				}

			}while(show!=0);
		}
	}
	
}
