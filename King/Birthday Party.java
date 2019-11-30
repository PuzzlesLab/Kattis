import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
	
	public static class Edge {
		int a, b;
		boolean enabled;
		
		public Edge(int x, int y) {
			this.a=x;
			this.b=y;
			this.enabled=true;
		}
		public int opposite(int x) {
			return (x==a) ? b : a;
		}
	}
	
	private static int getParent(int [] parent, int id) {
		if (parent[id]!=id) parent[id]=getParent(parent, parent[id]);
		return parent[id];
	}
	
	private static int countSpanningTrees(ArrayList<Edge> allEdges, ArrayList<Edge> [] edgeList) {
		int P=edgeList.length;
		int [] parent=new int [P];
		for (int p=0;p<P;p++) parent[p]=p;
		
		boolean [] visited=new boolean [P];
		for (int p=0;p<P;p++) if (!visited[p]) {
			Stack<Integer> stk=new Stack<>();
			visited[p]=true;
			stk.add(p);
			while (!stk.isEmpty()) {
				int currId=stk.pop();
				for (Edge e : edgeList[currId]) if (e.enabled) {
					int oppo=e.opposite(currId);
					
					int p1=getParent(parent, currId);
					int p2=getParent(parent, oppo);
					if (p1>p2) parent[p2]=parent[p1];
					else if (p1<p2) parent[p1]=parent[p2];
					
					if (!visited[oppo]) {
						stk.push(oppo);
						visited[oppo]=true;
					}
				}
			}
		}

		HashSet<Integer> set=new HashSet<>();
		for (int p=0;p<P;p++) set.add(getParent(parent, p));
		return set.size();
	}
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int P=Integer.parseInt(st.nextToken());
			int C=Integer.parseInt(st.nextToken());
			if (P==0 && C==0) break;
			
			ArrayList<Edge> allEdges=new ArrayList<>();
			ArrayList<Edge> [] edgeList=new ArrayList [P];
			for (int p=0;p<P;p++) edgeList[p]=new ArrayList<>();
			
			for (int c=0;c<C;c++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				Edge e=new Edge(a, b);
				edgeList[a].add(e);
				edgeList[b].add(e);
				allEdges.add(e);
			}
			
			boolean flag=false;
			for (Edge e : allEdges) {
				e.enabled=false;
				flag |= countSpanningTrees(allEdges, edgeList)>1;
				e.enabled=true;
				if (flag) break;
			}
			System.out.println(flag ? "Yes" : "No");
		}
		
	}

}