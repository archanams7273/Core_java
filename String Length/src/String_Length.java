import java.util.Scanner;
public class String_Length {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String A=sc.next();
		String B=sc.next();
		System.out.println(A.length()+B.length());
		if(A.compareTo(B)>0)
		System.out.println("yes");
		else
			System.out.println("No");
		System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+
			Character.toUpperCase(B.charAt(0))+B.substring(1));
		// TODO Auto-generated method stub

	}

}
