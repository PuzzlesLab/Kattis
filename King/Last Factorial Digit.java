import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int [] lastDigit=new int [11];
		lastDigit[0]=1;
		for (int i=1;i<lastDigit.length;i++) lastDigit[i]=(lastDigit[i-1]*i)%10;
		
		int T=Integer.parseInt(br.readLine());
		while (T-->0) System.out.println(lastDigit[Integer.parseInt(br.readLine())]);
	}

}