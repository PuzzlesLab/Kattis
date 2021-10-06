import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int [] rateOfChange=new int [N+3];
		for (int k=0;k<K;k++) {
			st=new StringTokenizer(br.readLine());
			char op=st.nextToken().charAt(0);
			int x1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			
			if (op=='R') {
				rateOfChange[x1]++;
				rateOfChange[x1+1]--;
				rateOfChange[x2+1]--;
				rateOfChange[x2+2]++;
			} else if (op=='D') {
				rateOfChange[x1]--;
				rateOfChange[x1+1]++;
				rateOfChange[x2+1]++;
				rateOfChange[x2+2]--;
			} else if (op=='H') {
				int mid=(x1+x2)/2;
				rateOfChange[x1]++;
				if ((x2-x1)%2==1) {
					rateOfChange[mid+1]--;
					rateOfChange[mid+2]--;
				} else {
					rateOfChange[mid+1]-=2;
				}
				rateOfChange[x2+2]++;
			} else if (op=='V') {
				rateOfChange[x1]--;
				int mid=(x1+x2)/2;
				if ((x2-x1)%2==1) {
					rateOfChange[mid+1]++;
					rateOfChange[mid+2]++;
				} else {
					rateOfChange[mid+1]+=2;
				}
				rateOfChange[x2+2]--;
			}
		}

		StringBuilder sb=new StringBuilder();
		long currChange=0;
		long ans=0;
		for (int n=1;n<=N;n++) {
			currChange+=rateOfChange[n];
			ans+=currChange;
			sb.append(ans);
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}

}
