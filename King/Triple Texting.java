import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int length=s.length()/3;
		
		String [] strs=new String[3];
		for (int i=0;i<3;i++) strs[i]=s.substring(i*length,(i+1)*length);
		
		if (strs[0].equals(strs[1]) || strs[0].equals(strs[2])) System.out.println(strs[0]);
		else System.out.println(strs[1]);
	}

}