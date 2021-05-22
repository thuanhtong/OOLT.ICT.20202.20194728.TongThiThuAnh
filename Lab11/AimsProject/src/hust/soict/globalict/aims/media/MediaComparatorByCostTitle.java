package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	@Override
//	public int compare(Media o1, Media o2) {
//		if (o1.getCost()==o2.getCost()) {
//			return o1.getTitle().compareTo(o2.getTitle());
//		}
//		else{
//			if (o1.getCost() > o2.getCost()) return -1;
//			else if (o1.getCost() < o2.getCost()) return 1;
//			else return 0;
//		}
//	}
	
	public int compare(Media o1, Media o2) {
		return Comparator.comparing(Media::getCost).reversed().thenComparing(Media::getTitle).compare(o1, o2);
	}

}
