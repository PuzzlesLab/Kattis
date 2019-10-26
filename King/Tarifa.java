import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int X=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		int remaining=X;
		for (int n=0;n<N;n++) remaining+=(X-Integer.parseInt(br.readLine()));
		System.out.println(remaining);
	}

}