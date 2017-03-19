import java.util.Scanner;

/*
 * 输入一个整数，输出每个数字对应的拼音。当整数为负数时，先输出“fu”字。十个数字对应的拼音如下：
0: ling 1: yi 2: er 3: san 4: si 5: wu 6: liu 7: qi 8: ba 9: jiu

class Test7 实现数字的识别输出
 */

public class Test7 {
	
	public static void	view()
		{		String array2[] ={"ling","yi","er","san","si","wu","liu","xi","ba","jiu"};
		System.out.println("请输入数据");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String onshow2="";
		if(num>=0){
			String str2[]=(num+"").split("");
			for(int a=0;a<str2.length;a++){
				onshow2+=array2[Integer.parseInt(str2[a])];
				if(a!=str2.length-1){
					onshow2+=" ";
				}
			}
			System.out.println(onshow2);
		}else if(num<0){
			onshow2+="fu ";
			String str2[]=(num+"").split("");
			for(int a=1;a<str2.length;a++){
				onshow2+=array2[Integer.parseInt(str2[a])];
				if(a!=str2.length-1){
					onshow2+=" ";
				}
			}
			System.out.println(onshow2);
		}
		}
		
	
	public static void main(String[] args) {
		/*String array[] ={"ling","yi","er","san","si","wu","liu","xi","ba","jiu"};
		System.out.println("请输入数据");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String onshow="";
		String str[] =num.split("");
		int i =0;
		while(i<str.length){
			switch  (str[i]){
			case "-":
				i++;
				onshow+="fu ";
				continue;
			case "0":
				i++;
				onshow+=array[0]+" ";
				continue;
			case "1" :
				i++;
				onshow+=array[1]+" ";
				continue;
			case "2" :
				i++;
				onshow+=array[2]+' ';
				continue;
			case "3" :
				i++;
				onshow+=array[3]+" ";
				continue;
			case "4" :
					i++;
					onshow+=array[4]+' ';
					continue;
			case "5" :
						i++;
						onshow+=array[5]+ ' ';
						continue;
			case "6" :
					i++;
					onshow+=array[6]+" ";
					continue;
			case "7" :
				i++;
				onshow+=array[7] + ' ';
				continue;
			case "8" :
				i++;
				onshow+=array[8]+ ' ';
				continue;
			case "9" :
				i++;
				onshow+=array[9]+ ' ';
				continue;
			}
				
		}
		System.out.println(onshow);*/
	
		view();
	}
}
