import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double C=Double.parseDouble(br.readLine());
		int L=Integer.parseInt(br.readLine());
		double sum=0;
		while (L-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			sum+=Double.parseDouble(st.nextToken())*Double.parseDouble(st.nextToken())*C;
		}
		System.out.printf("%.7f\n", sum);
	}

}