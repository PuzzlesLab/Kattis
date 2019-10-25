import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for (int n=1;n<=N;n++) {
			sb.append(n);
			sb.append(" Abracadabra\n");
		}
		System.out.print(sb.toString());
	}

}