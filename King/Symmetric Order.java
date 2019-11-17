import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int testCase=1;
		while (!(s=br.readLine()).equals("0")) {
			int N=Integer.parseInt(s);
			String [] names=new String[N];
			while (N-->0) names[names.length-N-1]=br.readLine();
			
			LinkedList<String> top=new LinkedList<>();
			LinkedList<String> btm=new LinkedList<>();
			for (int i=0;i<names.length;i++) if (i%2==0) top.addLast(names[i]); else btm.addFirst(names[i]); 

			StringBuilder sb=new StringBuilder();
			sb.append("SET ");
			sb.append(testCase);
			sb.append('\n');
			while (!top.isEmpty()) {
				sb.append(top.removeFirst());
				sb.append('\n');
			}
			while (!btm.isEmpty()) {
				sb.append(btm.removeFirst());
				sb.append('\n');
			}
			System.out.print(sb.toString());
			testCase++;
		}
	}

}