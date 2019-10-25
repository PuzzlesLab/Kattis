import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		while (N-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int b=Integer.parseInt(st.nextToken());
			double p=Double.parseDouble(st.nextToken());
			System.out.printf("%.4f %.4f %.4f\n", 60/p*(b-1), 60/p*b, 60/p*(b+1));
		}
	}

}