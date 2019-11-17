import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken())*4;
		char B=st.nextToken().charAt(0);
		
		int [][] table=new int [128][];
		for (int i=0;i<table.length;i++) table[i]=new int [] {0,0};
		table['A']=new int [] {11,11};
		table['K']=new int [] {4,4};
		table['Q']=new int [] {3,3};
		table['J']=new int [] {20,2};
		table['T']=new int [] {10,10};
		table['9']=new int [] {14,0};
		
		int sum=0;
		while (N-->0) {
			String s=br.readLine();
			sum+=table[s.charAt(0)][s.charAt(1)==B?0:1];
		}
		System.out.println(sum);
	}

}