import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		while (N-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int r=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			int v=e-c;
			if (r>v) System.out.println("do not advertise");
			else if (r<v) System.out.println("advertise");
			else System.out.println("does not matter");
		}
	}

}