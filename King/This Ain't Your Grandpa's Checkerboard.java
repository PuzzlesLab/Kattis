import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		char [][] ch=new char [N][];
		for (int i=0;i<N;i++) ch[i]=br.readLine().toCharArray();
		
		boolean rowFlag=true;
		for (int row=0;row<N;row++) {
			int w=0, b=0;
			for (int col=0;col<N;col++) if (ch[row][col]=='W') w++; else b++;
			rowFlag&=(w==b);
			
			String rowStr = new String(ch[row]);
			rowFlag&=!rowStr.contains("BBB") && !rowStr.contains("WWW");
		}
		
		boolean colFlag=true;
		for (int col=0;col<N;col++) {
			int w=0, b=0;
			for (int row=0;row<N;row++) if (ch[row][col]=='W') w++; else b++;
			colFlag&=(w==b);
			
			StringBuilder sb=new StringBuilder();
			for (int row=0;row<N;row++) sb.append(ch[row][col]);
			
			String colStr=sb.toString();
			rowFlag&=!colStr.contains("BBB") && !colStr.contains("WWW");
		}
		
		System.out.println(rowFlag && colFlag ? 1 : 0);
	}

}