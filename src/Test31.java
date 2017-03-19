import java.util.Scanner;

public class Test31 {
 public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
	 int num =sc.nextInt();
	 int height[] = new int[num];
	 int weight[] = new int[num];
	 for(int i =0;i<num;i++){
		 height[i]=sc.nextInt();
		 weight[i]=sc.nextInt();
	 }
	 
	for(int j = 0 ;j<num;j++){
		double style=(height[j]-100)*0.9*2;
		double fat = style*1.1;
		double low =style/1.1;
	}
 }
}
