import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			char [] c=br.readLine().toCharArray();
			int N=(int)(Math.sqrt(c.length));
			char [][] mat=new char [N][N];
			for (int n=0;n<N;n++) for (int n2=0;n2<N;n2++) mat[n][n2]=c[n*N+n2];
			
			char [][] ans=new char [N][N];
			for (int col=N-1;col>=0;col--) for (int row=0;row<N;row++) ans[N-col-1][row]=mat[row][col];
			
			StringBuilder sb=new StringBuilder();
			for (int n=0;n<N;n++) sb.append(new String(ans[n]));
			System.out.println(sb.toString());
		}
	}

}