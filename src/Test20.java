import java.util.Scanner;

public class Test20 {


public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
	 int count = sc.nextInt();
	 String arr[]= new String[count+1];
	int index=0;
	int index2=0;
	while(index<(count+1)){	
		arr[index]= sc.nextLine();
		index++;
	}
	int num = sc.nextInt();
	String str2=sc.nextLine();
	
	String arr3[]= new String[]{};
	for(int i =0 ;i<count+1;i++){
		String arry[]=arr[i].split(" ");
		for(int j =0;j<arry.length;j++){
			arr3[index2+j]=arry[j+1];
		}
		index2+=Integer.parseInt(arry[0]);
	}
	String arr2[]=str2.split(" ");
	if(arr2.length>num){
		System.out.println("输入的值个数出错");
	}
	String strcount="";
	for(int a= 0;a<num;a++){
		for(int b=0;b<arr3.length;b++){
			if(arr2[a].equals(arr3[b])){
				strcount+=arr2[a]+" ";
			}
		}
	}
	if(strcount!=null){
		System.out.println(strcount);
	} 
 }
}
