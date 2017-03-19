import java.util.Scanner;

/*
 * 给定两个整数A和B，输出从A到B的所有整数以及这些数的和
 * class Test8
 * 
 */
public class Test8 {
 public static void main(String [] args){
	 /*System.out.println("请输入数值");
	 Scanner sc =new Scanner(System.in);
	 String str = sc.nextLine();
	 String array[]=str.split(" ");
	 int num1=Integer.parseInt(array[0]);
	 int num2= Integer.parseInt(array[1]);
	 Boolean temp=false;
     int sum=0;
     int a=0;
    if((num1>=-100&&num1<=100)&&(num2>=-100&&num2<=100)){
    	 if(num1>num2){
    		 for(int i =num2;i<=num1;i++){
    			 sum+=i;
    			String num=i+"";
    			while(true){
    				num=" "+num;
    				if(num.length()==5){
    					System.out.print(num);
    					break;
    				}
    			}
    			
    			 a++;
    			 if(a%5==0){
    				 System.out.println();	 
    				 a=0;
    			 }
    		 }
    		 System.out.println();
    		 System.out.println(sum);
    	 }else{
    		 for(int i =num1;i<=num2;i++){
    			 sum+=i;
    			 String num=i+"";
     			while(true){
     				num=" "+num;
     				if(num.length()==5){
     					System.out.print(num);
     					break;
     				}
     			}
    			 a++;
    			 if(a%5==0){
    				 System.out.println();	
    				 a=0;
    			 }
    		 }
    		 System.out.println();
    		 System.out.println("Sum="+sum);
    	 }
    }*/
	
	     Scanner sc =new Scanner(System.in);
	     int num = sc.nextInt();
	     int num2 = sc.nextInt();
	     if(num>=-100&&num<=num2&&num2<=100){
	       int numCount = 0;
	       int str = 0;
	       for(int i =num;i<=num2;i++){
	         if(numCount == 5){
	           System.out.println();
	           numCount=0;
	         }
	         String str2 = i+" ";
	         while(true){
	           str2=""+str2;
	           if(str2.length()==5){
	             break; 
	           }
	         }
	         System.out.print(str2);
	         numCount++;
	         str+=i;
	       }
	       System.out.println();
	       System.out.println("Sum = "+str);
	     }
	   }
	   
	 }