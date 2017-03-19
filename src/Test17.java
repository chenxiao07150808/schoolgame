import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 一个整数“犯二的程度”定义为该数字中包含2的个数与其位数的比值。
 * 如果这个数是负数，则程度增加0.5倍；如果还是个偶数，
 * 则再增加1倍。例如数字“-13142223336”是个11位数，
 * 其中有3个2，并且是负数，也是偶数，则它的犯二程度计算为：3/11*1.5*2*100%，
 * 约为81.82%。本题就请你计算一个给定整数到底有多二
 * 
 * 
 */
public class Test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String str = String.valueOf(num);
		double du = 1;
		double index = 0;
		
		double height = str.length();
		if (str.length() < 50) {
			for (int i = 0; i < str.length(); i++) {
				String t = str.substring(i, i + 1);
				if (t.equals("-")) {
					du = 0.5;
					height -= 1;
					if(Long.parseLong(num)%2==0){
						du=du+1;
					}
				} else {
					int idx = Integer.parseInt(t);
					if (idx == 2) {
						index++;
					}
				}

			}
			System.out.println(du);
			double sum=index/height*2*du*100;
			DecimalFormat df = new DecimalFormat("#.00");
	        String sum1=df.format(sum)+"%";
			System.out.println(sum1);
		}
	}
}
