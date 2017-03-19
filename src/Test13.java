import java.util.Scanner;

public class Test13 {
  public static void main(String[]args){
	  Scanner sc =new Scanner(System.in);
	  int num =sc.nextInt();
	  int count=0;
	  if(num<=10){
		 for(int i=num;i>0;i--){
			 count+=sum(i);
		 }
		 System.out.println(count);
	  }
  }
  public static int sum(int n){
	  if(n == 1){
	  return 1;
	  }else{
	  return sum(n-1) * n;
	  }
  }
}
