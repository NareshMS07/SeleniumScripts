package dec28;

public class ForEach {

	public static void main(String[] args) {
		String week[]= {"mon","tue","wed","thu","fri","sat","sun"};
		System.out.println(week[6]);
		for (String x : week) 
		{
			System.out.println(x);	
		}
	}
}
