import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ‰»Î£°");
		Scanner sc =new Scanner(System.in);
		String str= sc.nextLine();
		String []num = str.split(" ");
		int number = Integer.parseInt(num[0]);
		for(int i =1;i<=number;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int a=1;a<=2*number+1-2*i;a++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i =1;i<=number-1;i++){
			for(int j=1;j<=number-i;j++){
				System.out.print(" ");
			}
			for(int a=1;a<=2*i+1;a++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
