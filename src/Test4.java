import java.util.Scanner;
/*
 * Ҫ�󣺸���һ�������¶�F������Ҫ���д���򣬼����Ӧ�������¶�C��
 * ���㹫ʽ��C = 5*(F-32)/9����Ŀ��֤����������������ͷ�Χ�ڡ�
 * class Test4 ʵ�����϶��뻪�϶ȵ�ת��
 */
public class Test4 {
  public static void main(String []args){
	  System.out.println("�������¶�");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int Celsius =0;
	  Celsius = 5*(num-32)/9;
	  System.out.println("Celsius = "+Celsius);
	  
  }
}
