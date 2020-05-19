import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int [] x=new int [3];
		int [] y=new int [3];
		for (int i=0;i<3;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			x[i]=Integer.parseInt(st.nextToken());
			y[i]=Integer.parseInt(st.nextToken());
		}
		int ax=-1, ay=-1;
		Arrays.sort(x); Arrays.sort(y);
		if (x[0]==x[1]) ax=x[2];
		else ax=x[0];
		if (y[0]==y[1]) ay=y[2];
		else ay=y[0];
		System.out.printf("%d %d\n", ax, ay);
	}

}