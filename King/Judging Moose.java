import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int l=Integer.parseInt(st.nextToken());
		int r=Integer.parseInt(st.nextToken());
		
		if (l==r && l>0) System.out.println("Even "+l*2);
		else if (l!=r) System.out.println("Odd "+Math.max(l,r)*2);
		else System.out.println("Not a moose");
	}

}