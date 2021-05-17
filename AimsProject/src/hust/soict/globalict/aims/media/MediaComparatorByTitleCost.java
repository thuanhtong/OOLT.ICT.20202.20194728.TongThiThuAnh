package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{

	@Override
//	public int compare(Media o1, Media o2) {
//		if (o1.getTitle().compareTo(o2.getTitle())==0) {
//			if (o1.getCost() > o2.getCost()) return -1;
//			else if (o1.getCost() < o2.getCost()) return 1;
//			else return 0;
//		}
//		else{
//			return o1.getTitle().compareTo(o2.getTitle());
//		}
//	}

	public int compare(Media o1, Media o2) {
		return Comparator.comparing(Media::getTitle).reversed().thenComparing(Media::getCost).reversed().compare(o1, o2);
	}
}
