import java.util.Scanner;

public class Test26 {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
         String str = sc.nextLine();
         
         String arr[] = str.split("");
         for(int i =0 ;i<arr.length;i++){
        	 
           System.out.print(arr[i]+"\n"); 
        	 
         }
	}
}
