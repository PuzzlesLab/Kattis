import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double d=Double.parseDouble(br.readLine())*(1000.0/4854)*5280;
		System.out.println((int)(d+0.5));
	}

}