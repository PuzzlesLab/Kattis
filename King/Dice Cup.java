import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int [] max=new int [N+M+1];
		for (int n=1;n<=N;n++) for (int m=1;m<=M;m++) max[n+m]++;
		
		int index=1;
		for (int i=2;i<max.length;i++) if (max[i]>max[index]) index=i;
		for (int i=2;i<max.length;i++) if (max[i]==max[index]) System.out.println(i);
	}

}