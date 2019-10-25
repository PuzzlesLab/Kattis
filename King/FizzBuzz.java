import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int X=Integer.parseInt(st.nextToken());
		int Y=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		StringBuilder sb=new StringBuilder();
		for (int n=1;n<=N;n++) {
			if (n%X==0 && n%Y==0) sb.append("FizzBuzz");
			else if (n%X==0) sb.append("Fizz");
			else if (n%Y==0) sb.append("Buzz");
			else sb.append(n);
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}

}