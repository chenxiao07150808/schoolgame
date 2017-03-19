import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    String num = sc.nextLine();
    String number[] =num.split(" ");
    int A = Integer.parseInt(number[0]);
    int B = Integer.parseInt(number[1]);
    int num2 = sc.nextInt();
    String array2[]=new String[num2];
    int i1 =0;
    while(i1<num2){
    	array2[i1]+=sc.next();
    	i1++;
    }
   
      String str= sc.nextLine();
      String array[] = str.split(" ");
      int A1=Integer.parseInt(array[0]);
      int A2=Integer.parseInt(array[2]);
      int B1=Integer.parseInt(array[4]);
      int B2=Integer.parseInt(array[6]);
      int sum1=A1+B1;
      if(sum1==A2){
    	  A--;
    	  if(A==0){
    		  System.out.println("A");
    		  System.out.println(B);
    		  
    	  }
      }
      if(sum1==B2){
    	  if(B==0){
    		  System.out.println("B");
    		  System.out.println(A);
    		  break;
    	  }
      }
    }
    

}
