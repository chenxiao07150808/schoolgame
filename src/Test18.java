import java.util.Scanner;
/*
 * 微博上有个自称“大笨钟V”的家伙，每天敲钟催促码农们爱惜身体早点睡觉。不过由于笨钟自己作息也不是很规律，
 * 所以敲钟并不定时。一般敲钟的点数是根据敲钟时间而定的，如果正好在某个整点敲，那么“当”数就等于那个整点数；
 * 如果过了整点，就敲下一个整点数。另外，虽然一天有24小时，钟却是只在后半天敲1~12下。例如在23:00敲钟，
 * 就是“当当当当当当当当当当当”，
 * 而到了23:01就会是“当当当当当当当当当当当当”。在午夜00:00到中午12:00期间（端点时间包括在内），
 * 笨钟是不敲的
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
