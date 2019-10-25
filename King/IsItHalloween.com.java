import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> monthMap=new HashMap<>();
		monthMap.put("JAN",1);
		monthMap.put("FEB",2);
		monthMap.put("MAR",3);
		monthMap.put("APR",4);
		monthMap.put("MAY",5);
		monthMap.put("JUN",6);
		monthMap.put("JUL",7);
		monthMap.put("AUG",8);
		monthMap.put("SEP",9);
		monthMap.put("OCT",10);
		monthMap.put("NOV",11);
		monthMap.put("DEC",12);
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		String month=st.nextToken();
		String day=st.nextToken();
		boolean flag=false;
		try {
			flag=Integer.parseInt(day, monthMap.get(month)-2)==25;
		} catch (Exception e) {}
		System.out.println(flag ? "yup" : "nope");
	}

}