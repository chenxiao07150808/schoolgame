import java.util.Scanner;
public class Test22 {
	
	
	  public static void main(String[]args){
	    Scanner sc = new Scanner(System.in); 
	    int num = sc.nextInt();
	    if(num<=1000&&num>=0){
	    	int[] numbers=new int[num];
		    int index=0;
		    Scanner scanner=new Scanner(System.in);
		            
		    while(scanner.hasNext()){
		          if(scanner.hasNextInt()) numbers[index++]=scanner.nextInt();
		          if(index>=numbers.length)
		        	  break;
		     }
		    
		     scanner.close();
		     sc.close();
		     int ou = 0;
		     int ji = 0;
		     for(int i=0;i<numbers.length;i++){
		    	 if(numbers[i]>=0&&numbers[i]%2==0){
		    		 ou++;
		    	 }else if(numbers[i]>0&&numbers[i]%2!=0){
		    		 ji++;
		    	 }
		     }
		     System.out.println(ji+" "+ou);
	    }
	}
}
