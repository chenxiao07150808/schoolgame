import java.util.Scanner;
/*
 * ΢�����и��Գơ�����V���ļһÿ�����Ӵߴ���ũ�ǰ�ϧ�������˯�����������ڱ����Լ���ϢҲ���Ǻܹ��ɣ�
 * �������Ӳ�����ʱ��һ�����ӵĵ����Ǹ�������ʱ������ģ����������ĳ�������ã���ô���������͵����Ǹ���������
 * ����������㣬������һ�������������⣬��Ȼһ����24Сʱ����ȴ��ֻ�ں������1~12�¡�������23:00���ӣ�
 * ���ǡ���������������������������
 * ������23:01�ͻ��ǡ���������������������������������ҹ00:00������12:00�ڼ䣨�˵�ʱ��������ڣ���
 * �����ǲ��õ�
 */
public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String time[] = str.split(":");
		int hours = Integer.parseInt(time[0]);
		int seonds = Integer.parseInt(time[1]);
		if (seonds > 0) {
			hours++;
			if (hours <= 12) {
				System.out.println("Only " + str + " Too early to Dang.");
			} else if (hours <= 24) {
				for (int i = 0; i < hours - 12; i++) {
					System.out.print("Dang");
				}
			}
		}
	}
}
