import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		for (int n=0;n<N;n++) {
			char [] c1=br.readLine().toCharArray();
			char [] c2=br.readLine().toCharArray();
			
			StringBuilder sb=new StringBuilder();
			sb.append(new String(c1)); sb.append('\n');
			sb.append(new String(c2)); sb.append('\n');
			for (int i=0;i<c1.length;i++) sb.append(c1[i]==c2[i] ? '.' : '*' );
			sb.append('\n');
			System.out.println(sb.toString());
		}
	}

}