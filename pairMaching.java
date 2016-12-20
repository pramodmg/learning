public class pairMatching {

	private static final int MAX = 100;
	
	static void printPairs(int arr[], int sum){
		boolean[] binmap = new boolean[MAX];
		
		for(int i=0; i<arr.length;++i) {
			int temp = sum - arr[i];
			System.out.println("Arr value of the i " + arr[i]);
			if ( temp >= 0 && binmap[temp]) {
				System.out.println("Pair with given sum " + sum + " is ( " + arr[i] + ", " + temp + " )");
			}
			binmap[arr[i]] = true;
		}
	}
	public static void main(String[] args) {
		int A[] = {1, 4, 5, 6, 8, 3};
		int n = 7;
		printPairs(A,n);
	}

}