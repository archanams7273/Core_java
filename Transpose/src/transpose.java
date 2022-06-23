import java.util.Scanner;
public class transpose {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int row=s.nextInt();
     int col=s.nextInt();
     int arr[][]=new int [row][col];
     for(int i=0;i<row;i++)
     {
    	 for(int j=0;j<col;j++)
    	 {
    		 arr[i][j]=s.nextInt();
    	 }
     }
     for(int i=0;i<row;i++)
     {
    	 for(int j=0;j<col;j++)
    	 {
    		 if(j==0)
    			 System.out.println(arr[j][i]);
    		 else
    			 System.out.println(" "+arr[j][i]);
    	 }
    	 System.out.println("\n");
     }
     
		// TODO Auto-generated method stub

	}

}
