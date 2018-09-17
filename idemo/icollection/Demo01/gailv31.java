package Demo01;

import java.util.Scanner;

/**概率三分之一 num2/=3==0;
 * @author zxc
 *do{
		num2=(int)(Math.random()*10);
	}while(num2==9);
	num2/=3;
 */
public class gailv31 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean boo=true;
	for(;boo;){
		System.out.println("石头剪刀布：");
		String choose=sc.next();
		int num1,num2;
		if(choose.equals("石头")){
			num1=0;
		}else if(choose.equals("剪刀")){
			num1=1;
		}else{
			num1=2;
		}
		do{
			num2=(int)(Math.random()*10);
		}while(num2==9);
		num2/=3;
		
		boo=(num1!=num2);
		if(num2==0){
			System.out.println("剪刀");
		}else if(num2==1){
			System.out.println("布");
		}else {
			System.out.println("石头");
		}
		//num2-num1<=3&&num2-num1>=1||num1-num2>=6;
		System.out.println(num1+" "+num2);
	}//for //num1-num2<=3||num2-num1>=6
	System.out.println("赢了");
}
}
