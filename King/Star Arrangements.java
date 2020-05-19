import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int S=Integer.parseInt(br.readLine());
		System.out.println(S+":");
		for (int row1=2;row1<=S/2+1;row1++) {
			for (int row2=row1-1;row2<=row1;row2++) {
				int sum=0;
				while (sum<S) {
					sum+=row1;
					if (sum<S) sum+=row2;
				}
				
				if (sum==S) System.out.printf("%d,%d\n",row1,row2);
			}
		}
	}

}