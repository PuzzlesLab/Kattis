import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static int reverse(int i) {
		int t=0;
		while (i>0) {
			t=t*10+i%10;
			i/=10;
		}
		return t;
	}
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int A=reverse(Integer.parseInt(st.nextToken()));
		int B=reverse(Integer.parseInt(st.nextToken()));
		System.out.println(Math.max(A, B));
	}

}