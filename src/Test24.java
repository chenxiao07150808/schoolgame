import java.util.Scanner;

public class Test24 {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int day=0;
		if(num>0&&num<8){
			day=num+2;
			if(day>7){
				day=day%7;
			}
			System.out.println(day);
		}
	}
}
