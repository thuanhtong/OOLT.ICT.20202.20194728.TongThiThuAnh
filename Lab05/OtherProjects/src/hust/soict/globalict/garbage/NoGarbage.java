package hust.soict.globalict.garbage;

public class NoGarbage {
	public static void main(String[] args) {
		long startTime, endTime;
		startTime =System.currentTimeMillis();
		String makeGarbage;
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			makeGarbage= "Garbage";
			makeGarbage= "Garbage";
		}
		makeGarbage = null;
		
		endTime= System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
