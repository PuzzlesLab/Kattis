import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

	private static int left(int idx) {
		return (idx+1)%4;
	}
	
	private static int opposite(int idx) {
		return (idx+2)%4;
	}
	
	private static int right(int idx) {
		return Math.floorMod(idx-1,4);
	}

	public static void main (String [] args) throws Exception {
		HashMap<String, Integer> directionIdx = new HashMap<>();
		String [] directions = {"South", "West", "North", "East"}; //left.
		for (int i=0;i<directions.length;i++) directionIdx.put(directions[i], i);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int aIdx = directionIdx.get(st.nextToken());
		int bIdx = directionIdx.get(st.nextToken());
		int cIdx = directionIdx.get(st.nextToken());
		
		boolean ans=(opposite(aIdx)==bIdx && right(aIdx)==cIdx) || // Case 1
			((left(aIdx)==bIdx) && (ans=opposite(aIdx)==cIdx || right(aIdx)==cIdx)); // Case 2
		
		System.out.println(ans ? "Yes" : "No");
	}

}
