import java.util.Scanner;

public class Test30 {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		String name[]=new String[num];
		String nameG[]=new String[num/2];
		String nameB[]=new String[num/2];
		int index=0;
        int index2=0;
	   int sex[] =new int[num];
		
		if(num<=50){
			for(int i=0;i<num;i++){
				sex[i]=sc.nextInt();
				name[i]=sc.next();
				
			}
			
        for(int j=0;j<num;j++){
        	if(sex[j]==0){
        		nameG[index]=name[j];
        		index++;
        	}else{
        		nameB[index2]=name[j];
        		index2++;
        	}
        }
         for(int a=0;a<nameB.length;a++)
         {
        	System.out.println(nameB[a]+" "+nameG[nameB.length-1-a]);
         }
         }
		
	}
}
