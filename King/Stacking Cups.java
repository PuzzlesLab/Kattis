import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
	
	private static boolean isInt(String s) {
		try { Integer.parseInt(s); return true; }
		catch (Exception e) {}
		return false;
	}
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		HashMap<String,Integer> diameter=new HashMap<>(); //prevent rounding error, safe to use diameter :/
		String [] cups=new String [N];
		for (int n=0;n<N;n++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String s1=st.nextToken();
			String s2=st.nextToken();
			if (isInt(s1)) {
				diameter.put(s2, Integer.parseInt(s1));
				cups[n]=s2;
			} else {
				diameter.put(s1, Integer.parseInt(s2)*2);
				cups[n]=s1;
			}
		}
		Arrays.sort(cups, (String a, String b) -> diameter.get(a)-diameter.get(b));
		for (int n=0;n<N;n++) System.out.println(cups[n]);
	}

}