package hust.soict.globalict.aims;

import java.util.Scanner;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

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
		System.out.println("1. See a DVD’s details");
		System.out.println("2. Add a DVD to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter DVDs in cart");
		System.out.println("2. Sort DVDs in cart");
		System.out.println("3. Remove DVD from cart");
		System.out.println("4. Place order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		Store anItem = new Store();
		// Create new dvd objects and add them to the store
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.9f);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Harry Potter and the Philosopher's Stone", "Fantasy", 
				"Chris Columbus", 150, 20.2f);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", 
				"David Yates", 175 , 26.5f);
		DigitalVideoDisc dvd6= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", 
				"David Yates", 147 , 24.5f);
		DigitalVideoDisc dvd7= new DigitalVideoDisc("Avatar", "Science Fiction", 20.6f);
		DigitalVideoDisc dvd8= new DigitalVideoDisc("Titanic", "Romantic", 16.5f);
		DigitalVideoDisc dvd9= new DigitalVideoDisc("Avengers: Endgame", "Science Fiction", 27.55f);
		DigitalVideoDisc dvd10= new DigitalVideoDisc("Avengers: Infinity War", "Science Fiction", 26.5f);
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
		anItem.addDVD(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, dvd10, dvd11, dvd12, dvd13, dvd14, dvd15, 
				dvd16, dvd17, dvd18, dvd19, dvd20, dvd21);
		
		DigitalVideoDisc tmp;
		DigitalVideoDisc[] dvd=new DigitalVideoDisc[100];
		int count=0;
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
								System.out.print("Enter DVD's ID to see details: ");
								int id = sc.nextInt();
								tmp = anItem.searchByID(id);
								if (tmp!=null) {
									System.out.println(tmp.getDetail());
									System.out.println("Do you want to add the DVD to the cart?");
									System.out.println("1. Yes");
									System.out.println("2. No");
									System.out.print("Your choice: ");
									choice = sc.nextInt();
									if(choice ==1) {
										dvd[count]= new DigitalVideoDisc(tmp.getTitle(), tmp.getCategory(),tmp.getDirector(),
												tmp.getLength(), tmp.getCost(), tmp.getId());
										anOrder.addDigitalVideoDisc(dvd[count]);
										count++;
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
								if(tmp!=null) {
									dvd[count]= new DigitalVideoDisc(tmp.getTitle(), tmp.getCategory(),tmp.getDirector(),
											tmp.getLength(), tmp.getCost(), tmp.getId());
									anOrder.addDigitalVideoDisc(dvd[count]);
									count++;
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
											System.out.print("Enter DVD's ID: ");
											id = sc.nextInt();
											anOrder.searchByID(id);
										}
										else if(choice ==2) {
											System.out.print("Enter DVD's title: ");
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
										System.out.print("Enter DVD's ID to remove from cart: ");
										id = sc.nextInt();
										anOrder.removeByID(id);
										break;
									case 4:
										anOrder.emptyCart();
										System.out.println("An order is created");
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
						System.out.println("1. Add DVD");
						System.out.println("2. Remove DVD");
						System.out.print("Your choice: ");
						choice = sc.nextInt();
						if(choice ==1) {
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
							anItem.addDVD(new DigitalVideoDisc(title, category, director, length, (float)cost));
						}
						else if(choice==2) {
							System.out.print("Enter DVD's ID to remove from store: ");
							int id = sc.nextInt();
							tmp = anItem.searchByID(id);
							anItem.removeDVD(tmp);
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
									System.out.print("Enter DVD's ID: ");
									int id = sc.nextInt();
									anOrder.searchByID(id);
								}
								else if(choice ==2) {
									System.out.print("Enter DVD's title: ");
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
								System.out.print("Enter DVD's ID to remove from cart: ");
								int id = sc.nextInt();
								anOrder.removeByID(id);
								break;
							case 4:
								anOrder.emptyCart();
								System.out.println("An order has been created");
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
