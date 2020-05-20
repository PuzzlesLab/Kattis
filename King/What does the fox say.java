import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			ArrayList<String> voices=new ArrayList<>();
			StringTokenizer st=new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) voices.add(st.nextToken());
			while (true) {
				st=new StringTokenizer(br.readLine());
				String s="";
				while (st.hasMoreTokens()) s=st.nextToken();
				if (!s.equals("say?")) while (voices.contains(s)) voices.remove(s);
				else break;
			}
			StringBuilder sb=new StringBuilder();
			for (String v : voices) {
				sb.append(v);
				sb.append(' ');
			}
			if (sb.length()>0) sb.setLength(sb.length()-1);
			System.out.println(sb.toString());
		}
	}

}