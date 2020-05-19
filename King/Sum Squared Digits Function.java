import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int P=Integer.parseInt(br.readLine());
		for (int p=0;p<P;p++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int K=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			int N=Integer.parseInt(st.nextToken());
			
			BigInteger bi=BigInteger.valueOf(N);
			String s=bi.toString(B);
			int sum=0;
			for (char c : s.toCharArray()) {
				if (c>='0' && c<='9') sum+=(c-'0')*(c-'0');
				else sum+=(c-'a'+10)*(c-'a'+10);
			}
			System.out.printf("%d %d\n",K,sum);
		}
	}

}