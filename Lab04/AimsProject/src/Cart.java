
public class Cart {
	public static final int MAX_NUMBERS_ORDERED =20;
	
	private DigitalVideoDisc itemOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered=0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered <20) {
			itemOrdered[qtyOrdered]= disc;
			System.out.println("The disc '" + disc.getTitle() + "' has been added.");
			qtyOrdered++;
			if(qtyOrdered == 19) System.out.println("The cart is almost full.");
			if(qtyOrdered == 20) System.out.println("The cart is full.");
		}
		else System.out.println("Can't add the disc '" + disc.getTitle() + "' into the cart. The cart is already full!");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for(int i=0; i<dvdList.length; i++) {
			if(qtyOrdered <20) {
				itemOrdered[qtyOrdered]= dvdList[i];
				System.out.println("The disc '" + dvdList[i].getTitle() + "' has been added.");
				qtyOrdered++;
				if(qtyOrdered == 19) System.out.println("The cart is almost full.");
				if(qtyOrdered == 20) System.out.println("The cart is full.");
			}
			else System.out.println("Can't add the disc '" + dvdList[i].getTitle() + "' into the cart. The cart is already full!");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int flag=0;
		for(int i=0; i<qtyOrdered; i++) {
			if (itemOrdered[i] == disc) {
				itemOrdered[i]= itemOrdered[qtyOrdered-1];
				qtyOrdered--;
				System.out.println("The disc '" + disc.getTitle()+ "' has been removed from the cart.");
				flag++;
			}
		}
		if(flag==0) System.out.println("The disc '" + disc.getTitle() + "' isn't in the cart.");
	}
	
	public float totalCost() {
		float sumCost=0;
		for(int i=0; i<qtyOrdered; i++) {
			sumCost+= itemOrdered[i].getCost();
		}
		return sumCost;
	}
	

}

