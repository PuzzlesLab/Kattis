import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char [] c1=br.readLine().toCharArray();
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<c1.length/3;i++) sb.append("PER");
		char [] c2=sb.toString().toCharArray();
		int diff=0;
		for (int i=0;i<c1.length;i++) if (c1[i]!=c2[i]) diff++;
		System.out.println(diff);
	}

}