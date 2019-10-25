import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int D=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		LocalDate dt=LocalDate.of(2009,M,D);
		String day = dt.getDayOfWeek().toString().toLowerCase();
		System.out.println(Character.toUpperCase(day.charAt(0))+day.substring(1));
	}

}