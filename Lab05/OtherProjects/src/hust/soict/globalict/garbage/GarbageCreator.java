package hust.soict.globalict.garbage;

public class GarbageCreator {
	public static void main(String[] args) {
		long startTime, endTime;
		startTime =System.currentTimeMillis();
		String makeGarbage;
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			makeGarbage= new String("Garbage");
			new String("Garbage");
		}
		makeGarbage = null;
		
		endTime= System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
