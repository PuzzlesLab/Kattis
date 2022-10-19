import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

	private static ArrayList<Integer> [] BetterThan;
	private static ArrayList<Integer> [] WorseThan;
	private static boolean [] Visited;

	private static int findBetterThan(int emp) {
		int value=1;
		for (int i=0;i<BetterThan[emp].size();i++) {
			int next=BetterThan[emp].get(i);
			if (!Visited[next]) {
				Visited[next]=true;
				value+=findBetterThan(next);
			}
		}
		return value;
	}

	private static int findWorseThan(int emp) {
		int value=1;
		for (int i=0;i<WorseThan[emp].size();i++) {
			int next=WorseThan[emp].get(i);
			if (!Visited[next]) {
				Visited[next]=true;
				value+=findWorseThan(next);
			}
		}
		return value;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(s);
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			int E=Integer.parseInt(st.nextToken());
			int P=Integer.parseInt(st.nextToken());

			BetterThan=new ArrayList[E];
			WorseThan=new ArrayList[E];
			Visited=new boolean[E];
			for (int e=0;e<E;e++) {
				BetterThan[e]=new ArrayList<>();
				WorseThan[e]=new ArrayList<>();
			}

			for (int p=0;p<P;p++) {
				st=new StringTokenizer(br.readLine());
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				BetterThan[x].add(y);
				WorseThan[y].add(x);
			}

			int ansA=0;
			int ansB=0;
			int ansW=0;

			for (int e=0;e<E;e++) {
				Arrays.fill(Visited,false);
				Visited[e]=true;
				int betterThan=E-findBetterThan(e)+1;
				if (betterThan<=A) ansA++;
				if (betterThan<=B) ansB++;

				Arrays.fill(Visited,false);
				Visited[e]=true;
				if (findWorseThan(e)>B) ansW++;
			}
			
			StringBuilder sb=new StringBuilder();
			sb.append(ansA);
			sb.append('\n');
			sb.append(ansB);
			sb.append('\n');
			sb.append(ansW);
			System.out.println(sb.toString());
		}
	}

}
