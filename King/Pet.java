import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class uva {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int [] grade=new int [5];
		for (int n=0;n<grade.length;n++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for (int a=0;a<4;a++) grade[n]+=Integer.parseInt(st.nextToken());
		}
		int bestIndex=0;
		for (int n=1;n<grade.length;n++) if (grade[n]>grade[bestIndex]) bestIndex=n;
		System.out.printf("%d %d\n", bestIndex+1, grade[bestIndex]);
	}

}