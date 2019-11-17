import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char [] ch=br.readLine().toCharArray();
		int ballLoc=1;
		for (char c : ch) {
			if (c=='A') {
				if (ballLoc==1) ballLoc=2;
				else if (ballLoc==2) ballLoc=1;
			} else if (c=='B') {
				if (ballLoc==2) ballLoc=3;
				else if (ballLoc==3) ballLoc=2;
			} else if (c=='C') {
				if (ballLoc==1) ballLoc=3;
				else if (ballLoc==3) ballLoc=1;
			}
		}
		System.out.println(ballLoc);
	}

}