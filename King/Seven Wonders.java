import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=0, G=0, C=0;
		for (char c : br.readLine().toCharArray()) {
			if (c=='T') T++;
			else if (c=='G') G++;
			else if (c=='C') C++;
		}
		System.out.println(T*T+G*G+C*C+Math.min(T,Math.min(G,C))*7);
	}

}