import java.util.Scanner;
/*
 * 要求：给定一个华氏温度F，本题要求编写程序，计算对应的摄氏温度C。
 * 计算公式：C = 5*(F-32)/9。题目保证输入与输出均在整型范围内。
 * class Test4 实现摄氏度与华氏度的转化
 */
public class Test4 {
  public static void main(String []args){
	  System.out.println("请输入温度");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int Celsius =0;
	  Celsius = 5*(num-32)/9;
	  System.out.println("Celsius = "+Celsius);
	  
  }
}
