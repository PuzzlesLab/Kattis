import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		while (N-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			double v=Double.parseDouble(st.nextToken());
			double angle=Double.parseDouble(st.nextToken())/180*Math.PI;
			double x1=Double.parseDouble(st.nextToken());
			double h1=Double.parseDouble(st.nextToken())+1;
			double h2=Double.parseDouble(st.nextToken())-1;
			
			double t=x1/(Math.cos(angle)*v);
			double y=v*t*Math.sin(angle)-0.5*9.81*t*t;
			boolean flag=y>=h1 && y<=h2;
			System.out.println(flag ? "Safe" : "Not Safe");
		}
		

	}

}