import java.util.Scanner;

/*
 * ������ͳ�°��������������˶�ѧϰ��̣��������������д���룬��Ϊ������ʷ����λ��д������������ͳ��
 * 2014���,Ϊ��ף���������ѧ�����ܡ���ʽ�������°����д�˺ܼ򵥵ļ�������룺
 * ����Ļ�ϻ�һ�������Ρ�������Ҳ����һ�𻭰ɣ�
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
