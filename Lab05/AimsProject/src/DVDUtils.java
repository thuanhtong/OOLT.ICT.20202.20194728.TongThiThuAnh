
public class DVDUtils {
	
	public static int compareByCost(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(dvd1.getCost() > dvd2.getCost()) return 1;
		else if (dvd1.getCost() == dvd2.getCost()) return 0;
		else return -1;
 	}
	
	public static int compareByTitle(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		return dvd1.getTitle().compareTo(dvd2.getTitle());
	}
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] dvd) {
		int n= dvd.length;
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (dvd[j].getCost() > dvd[min_idx].getCost())
	    			min_idx = j;
	    	TestPassingParameter.swap(dvd[min_idx], dvd[i]);
	    }
	    return dvd;
	}
	
	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] dvd) {
		int n= dvd.length;
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (dvd[j].getTitle().compareTo(dvd[min_idx].getTitle())<0)
	    			min_idx = j;
	    	TestPassingParameter.swap(dvd[min_idx], dvd[i]);
	    }
	    return dvd;
	}
}
