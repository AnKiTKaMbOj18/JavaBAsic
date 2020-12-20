package kamboj.ankit.MavenDemo.JunitMockito.Mockito;

public class DataService {

	int[] number= {24,5,7};
	public int retrieveAllData() {
		
		int max=number[0];
		for(int i=0;i<number.length;i++) {
			if(number[i]>max)
				max=number[i];
		}
		
		return max;
	}
	
	public static void main(String args[]) {
		DataService ds=new DataService();
		
		int i=ds.retrieveAllData();
		System.out.println(i);
	}
}
