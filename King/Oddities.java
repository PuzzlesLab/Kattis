import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		while (N-->0) {
			int x=Integer.parseInt(br.readLine());
			System.out.printf("%d is %s\n", x, x%2==0 ? "even" : "odd");
		}
	}

}