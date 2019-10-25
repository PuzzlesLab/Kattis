import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		long sum=0;
		while (N-->0) {
			int term=Integer.parseInt(br.readLine());
			int num=term/10;
			int p=term%10;
			long result=1;
			while (p-->0) result*=num;
			sum+=result;
		}
		System.out.println(sum);
	}

}