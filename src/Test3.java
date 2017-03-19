import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] d = {0,0,0,0,0,0,0,0,0,0};
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		for(int i=0;i<10;i++){
			String D = String.valueOf(i);
			int j=0;
			int dcount = 0;
			while((N.indexOf(D,j)!=-1) && j<N.length()){
				dcount++;
				j = N.indexOf(D,j)+1;
			}
			d[i] = dcount;
		}
		for(int i=0;i<10;i++){
			if(d[i]>0){
				System.out.println(String.valueOf(i)+":"+String.valueOf(d[i]));
			}
		}*/
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		if(num.length()<=1000){
			int index=0;
			String array[]=num.split("");
			int numbers[] = {0,0,0,0,0,0,0,0,0,0};
			for(int j=0;j<array.length;j++){
			for(int i=0;i<10;i++){
				if(i==Integer.parseInt(array[j])){
					index=numbers[i];
					index++;
					numbers[i]=index;
					break;
				}
			}
			}
			for(int a =0 ;a<numbers.length;a++){
				if(numbers[a]!=0){
					System.out.println(a+":"+numbers[a]);
				}
				
				
			}
	
		}

	}

}
