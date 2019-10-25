import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int W=Integer.parseInt(st.nextToken());
		int H=Integer.parseInt(st.nextToken());
		double sqrt=Math.sqrt(W*W+H*H);
		for (int n=0;n<N;n++) {
			int currSize=Integer.parseInt(br.readLine());
			System.out.println(currSize>sqrt ? "NE" : "DA");
		}
	}

}