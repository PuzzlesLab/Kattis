import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		double sum=0.0;
		double count=0.0;
		StringTokenizer st=new StringTokenizer(br.readLine());
		while (n-->0) {
			int num=Integer.parseInt(st.nextToken());
			if (num>=0 && num<=4) {
				sum+=num;
				count++;
			}
		}
		System.out.println(sum/count);
	}

}