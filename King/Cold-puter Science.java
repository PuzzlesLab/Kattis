import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int ans=0;
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int n=0;n<N;n++) if (Integer.parseInt(st.nextToken())<0) ans++;
		System.out.println(ans);
	}

}