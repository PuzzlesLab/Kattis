import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		double h=Integer.parseInt(st.nextToken());
		double v=Double.parseDouble(st.nextToken())/180*Math.PI;
		System.out.println((int)Math.ceil(h/Math.sin(v)));
	}

}