import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static int sumOfDigits(int n) {
		int temp=0;
		while (n>0) {
			temp+=n%10;
			n/=10;
		}
		return temp;
	}
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int L=Integer.parseInt(br.readLine());
		int D=Integer.parseInt(br.readLine());
		int X=Integer.parseInt(br.readLine());
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i=L;i<=D;i++) if (sumOfDigits(i)==X) {
			min=Math.min(min, i);
			max=Math.max(max, i);
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}