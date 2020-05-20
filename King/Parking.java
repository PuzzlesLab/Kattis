import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			int N=Integer.parseInt(br.readLine());
			int [] nums=new int [N];
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			for (int n=0;n<N;n++) nums[n]=Integer.parseInt(st.nextToken());
			Arrays.sort(nums);
			
			int distBetweenNums=0;
			for (int n=1;n<N;n++) distBetweenNums+=Math.abs(nums[n]-nums[n-1]);
			
			int minDist=Integer.MAX_VALUE;
			for (int p=0;p<=99;p++) minDist=Math.min(Math.abs(p-nums[0])+Math.abs(nums[N-1]-p),minDist);
			minDist+=distBetweenNums;
			
			System.out.println(minDist);
		}
	}

}