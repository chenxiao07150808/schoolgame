import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * һ�������������ĳ̶ȡ�����Ϊ�������а���2�ĸ�������λ���ı�ֵ��
 * ���������Ǹ�������̶�����0.5����������Ǹ�ż����
 * ��������1�����������֡�-13142223336���Ǹ�11λ����
 * ������3��2�������Ǹ�����Ҳ��ż���������ķ����̶ȼ���Ϊ��3/11*1.5*2*100%��
 * ԼΪ81.82%��������������һ���������������ж��
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
