import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	
	public static class Reading implements Comparable<Reading> {
		public int ts;
		public double value;
		
		public Reading(int t, double v) {
			this.ts=t;
			this.value=v;
		}
		
		public int compareTo(Reading r) { return this.ts-r.ts; }
	}
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		Reading [] readings=new Reading[N];
		while (N-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			readings[N]=new Reading(Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
		}
		Arrays.sort(readings);
		
		double value=0.0;
		for (int i=1;i<readings.length;i++) value+=0.5*(readings[i].value+readings[i-1].value)*(readings[i].ts-readings[i-1].ts);
		System.out.println(value/1000);
	}

}