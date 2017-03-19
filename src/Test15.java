import java.util.Scanner;

/*
 * 美国总统奥巴马不仅呼吁所有人都学习编程，甚至以身作则编写代码，成为美国历史上首位编写计算机代码的总统。
 * 2014年底,为庆祝“计算机科学教育周”正式启动，奥巴马编写了很简单的计算机代码：
 * 在屏幕上画一个正方形。现在你也跟他一起画吧！
 */
public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String array[] = str.split(" ");
		double num = Integer.parseInt(array[0]);
		int cols =0;
		cols= (int) Math.round(num/2);
		if (num >= 3 && num <= 21) {
			for (int i = 0; i < cols; i++) {
				for (int j = 0; j < num; j++) {
					System.out.print(array[1]);
				}
				System.out.println();
			}
		}
	}
}
