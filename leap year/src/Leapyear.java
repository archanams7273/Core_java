
public class Leapyear {

	public static void main(String[] args) {
		int year=1998;
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
			System.out.println("specified year is a leap year");
		else
			System.out.println("specified year is not a leap year");
		
	}

}
