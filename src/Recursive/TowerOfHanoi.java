package Recursive;

public class TowerOfHanoi {

	public static void doTowers(int topN, char from, char inter, char to) {
		if (topN == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			doTowers(topN - 1, from, to, inter);
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN - 1, inter, from, to);
		}
	}

	public static void main(String[] args) {
		int nDisks = 3;
		doTowers(nDisks, 'A', 'B', 'C');
		
		//
//		int n=8;
//		for (int i = 1; i <= n; i++){
//		    for(int j = 1; j < 8; j = j * 2) {
//		        System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
//		    }
//		}
	}
}