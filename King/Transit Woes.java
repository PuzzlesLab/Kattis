import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int S=Integer.parseInt(st.nextToken());
		int T=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());

		st=new StringTokenizer(br.readLine());
		int currTime=S+Integer.parseInt(st.nextToken());
		int [] bs2bs=new int [N];
		for (int n=0;n<N;n++) bs2bs[n]=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		int [] busTime=new int [N];
		for (int n=0;n<N;n++) busTime[n]=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		int [] busInterval=new int [N];
		for (int n=0;n<N;n++) busInterval[n]=Integer.parseInt(st.nextToken());
		
		for (int n=0;n<N;n++) {
			while (currTime%busInterval[n]!=0) currTime++;
			currTime+=busTime[n];
			currTime+=bs2bs[n];
		}
		
		System.out.println(currTime<=T ? "yes" : "no");
	}

}