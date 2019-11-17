import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char [] ch=br.readLine().toCharArray();
		int ws=0, ll=0, ul=0, sy=0;
		double total=0.0;
		for (char c : ch) {
			if (Character.isAlphabetic(c))
				if (Character.isLowerCase(c)) ll++;
				else ul++;
			else if (c=='_') ws++;
			else sy++;
			total++;
		}
		System.out.println(ws/total);
		System.out.println(ll/total);
		System.out.println(ul/total);
		System.out.println(sy/total);
	}

}