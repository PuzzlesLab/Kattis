import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int side=2;
		for (int n=1;n<=N;n++) side+=(side-1);
		System.out.println(side*side);
	}

}