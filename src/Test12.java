import java.util.Scanner;
class Test12{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    if(num<=10){
     int sum =1;
     for(int i=0;i<num;i++){
        sum= 2*sum;
     }
    System.out.println("2^"+num+" = "+sum);
    }
  }
}