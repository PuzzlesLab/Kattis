import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int [] ref= {1,1,2,2,2,8};
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i=0;i<ref.length;i++) {
			sb.append(ref[i]-Integer.parseInt(st.nextToken()));
			sb.append(' ');
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
	}

}