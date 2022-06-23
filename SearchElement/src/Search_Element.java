import java.util.Scanner;
public class Search_Element {

	public static void main(String[] args) {
		boolean flag=false;
		int i=0;
	 Scanner sc=new Scanner(System.in);
	     int size=sc.nextInt();
	     int arr[]=new int [size];
	     for(i=0;i<size;i++)
	    	 arr[i]=sc.nextInt();
	     int key=sc.nextInt();
	    	 for(i=0;i<size;i++)
	    	 {
	    		 if(arr[i]==key)
	    			 flag=true;
	    		 break;
	    	 }
	     if(flag)
	    			 System.out.println("position of "+key +" is "+(i+1));
	    		 else
	    			 System.out.println("element not found");
	    	 }
	 
		// TODO Auto-generated method stub

	}


