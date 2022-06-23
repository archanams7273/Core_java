import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		char arr1[]=A.toLowerCase().toCharArray();
		char arr2[]=B.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		A=new String(arr1);
		Arrays.sort(arr2);
		B=new String(arr2);
		if(A.equals(B))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		// TODO Auto-generated method stub

	}

}