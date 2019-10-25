import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		double v=0.0;
		while (T-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			v+=Double.parseDouble(st.nextToken())*Double.parseDouble(st.nextToken());
		}
		System.out.printf("%.3f\n", v);
	}

}